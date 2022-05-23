package freedom1b2830.system.managment.systemd.journald.instance.init;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import freedom1b2830.system.apiutils.executor.Executor;
import freedom1b2830.system.apiutils.executor.ExecutorOutputListener;
import freedom1b2830.system.apiutils.executor.impl.shell.bash.BashExe;
import freedom1b2830.system.managment.systemd.journald.instance.EventAppender;
import freedom1b2830.system.managment.systemd.journald.libs.event.JournaldEvent;
import freedom1b2830.system.managment.systemd.journald.libs.event.impl.AuditEvent;

public class JournaldInstance {
	/**
	 * // FIXME ONLY DEBUG,NO SECUR (DATA LEAK)
	 */
	public @Deprecated(forRemoval = true) static CopyOnWriteArrayList<String> errorsParse = new CopyOnWriteArrayList<>();

	public static void main(String[] args) throws IOException, InterruptedException {
		File output = new File("OLOG");

		BashExe bashExe = new BashExe();
		ObjectMapper mapper = new ObjectMapper();
		EventAppender eventAppender = new EventAppender();

		ExecutorOutputListener outputListener = new ExecutorOutputListener() {

			@Override
			public void err(Executor executor, String line) {
				System.err.println(line);
			}

			@Override
			public void out(Executor executor, String line) {
				JournaldEvent journaldEvent = new JournaldEvent();
				try {
					@SuppressWarnings("unchecked")
					Map<String, Object> result = mapper.readValue(line, HashMap.class);
					for (Entry<String, Object> entry : result.entrySet()) {
						String key = null;
						Object val = null;
						try {
							key = entry.getKey();
							val = entry.getValue();
							eventAppender.append(journaldEvent, key, val);
						} catch (NoSuchElementException e) {
							String msg = String.format("exc1:%s  for %s ", e, key);
							errorsParse.addIfAbsent(msg);
						}

						catch (Exception e) {
							String msg = String.format("exc2:%s value:%s", e.getMessage(), val);
							errorsParse.addIfAbsent(msg);
						}
					}
				} catch (JsonProcessingException e1) {
					e1.printStackTrace();
				}
				journaldEvent.getClass();// TODO
				// send to pipe

				try {
					JournaldEvent castedEvent = journaldEvent.cast();
					if (castedEvent instanceof AuditEvent auditEvent) {
						System.err.println(auditEvent);
						Runtime.getRuntime().exit(0);
					}
					System.out.println(castedEvent);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		bashExe.appendListener(outputListener);

		bashExe.call();
		bashExe.command("journalctl   -a -o json");
		bashExe.command("journalctl   -a -o json -f &&exit 0");

		while (bashExe.process.isAlive()) {
			Thread.sleep(300);
		}

		if (!errorsParse.isEmpty()) {
			if (!output.exists()) {
				output.createNewFile();
			}
			Collections.sort(errorsParse);
			for (String string : errorsParse) {
				Files.writeString(output.toPath(), (string + '\n'), StandardOpenOption.APPEND);
				System.err.println(string);
			}
		}

	}

}
