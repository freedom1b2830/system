package freedom1b2830.system.apiutils.executor.impl.shell;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Path;

import freedom1b2830.system.apiutils.Shells;
import freedom1b2830.system.apiutils.executor.Executor;

public class ShellExe extends Executor {
	public ShellExe() throws AccessDeniedException {
		mainCmd = Shells.getShell(null);// fallback (no NPE)
	}

	public void command(String string) throws IOException {
		outputWriter.write(string);
		outputWriter.write("\n");
		outputWriter.flush();
	}

	public void join() throws InterruptedException {
		stdOutThread.join();
		stdERRThread.join();
	}

	@Override
	public void mainCmd(Path shell) {
		throw new UnsupportedOperationException("already used");
	}

	public void stop() throws InterruptedException {
		Thread.sleep(300);
		process.destroy();
	}

}
