package freedom1b2830.system.apiutils.executor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.concurrent.CopyOnWriteArrayList;

public class Executor {
	public Executor() {
		Thread.currentThread().setUncaughtExceptionHandler(exceptionHandler);
	}

	private final CopyOnWriteArrayList<ExecutorOutputListener> listeners = new CopyOnWriteArrayList<>();
	public Process process;
	public BufferedReader errorReader;
	public BufferedReader inputReader;
	public BufferedWriter outputWriter;
	ExecutorExceptionHandler exceptionHandler = new ExecutorExceptionHandler();

	public void appendListener(ExecutorOutputListener outputListener) {
		listeners.addIfAbsent(outputListener);
	}

	protected Thread stdOutThread;
	protected Thread stdERRThread;

	public void call() throws IOException {
		String[] cmdLine = new String[1];
		cmdLine[0] = mainCmd.toFile().getAbsolutePath();

		ProcessBuilder processBuilder = new ProcessBuilder(cmdLine);
		this.process = processBuilder.start();

		this.outputWriter = process.outputWriter(StandardCharsets.UTF_8);
		this.errorReader = process.errorReader(StandardCharsets.UTF_8);
		this.inputReader = process.inputReader(StandardCharsets.UTF_8);

		this.stdOutThread = new Thread((Runnable) () -> {
			Thread.currentThread().setUncaughtExceptionHandler(exceptionHandler);
			try {
				inputReader.lines().forEachOrdered(line -> {
					for (ExecutorOutputListener listener : listeners) {
						listener.out(Executor.this, line);
					}
				});
			} catch (java.io.UncheckedIOException e) {
				if (e.getCause() instanceof IOException && !e.getCause().getMessage().equals("Stream closed")) {
					e.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}, String.format("%s [%s] pid=%s io=stdOut", getClass().getSimpleName(), cmdLine[0], process.pid()));

		this.stdERRThread = new Thread((Runnable) () -> {
			Thread.currentThread().setUncaughtExceptionHandler(exceptionHandler);

			try {
				errorReader.lines().forEachOrdered(line -> {
					for (ExecutorOutputListener listener : listeners) {
						listener.err(Executor.this, line);
					}
				});
			} catch (java.io.UncheckedIOException e1) {
				if (e1.getCause() instanceof IOException && !e1.getCause().getMessage().equals("Stream closed")) {
					e1.printStackTrace();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}, String.format("%s [%s] pid=%s io=stdErr", getClass().getSimpleName(), cmdLine[0], process.pid()));

		stdERRThread.start();
		stdOutThread.start();
	}

	protected Path mainCmd;

	public void mainCmd(Path shell) {
		mainCmd = shell;
	}

}
