package freedom1b2830.system.apiutils.executor;

import java.io.IOException;

import freedom1b2830.system.apiutils.executor.impl.shell.bash.BashExe;

public class ExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		BashExe bash = new BashExe();

		ExecutorOutputListener outputListener = new ExecutorOutputListener() {

			@Override
			public void out(Executor executor, String line) {
				System.err.println(line);
			}

			@Override
			public void err(Executor executor, String line) {
				System.out.println(line);
			}
		};
		bash.appendListener(outputListener);
		bash.call();
		bash.command("id");// single word cmd
		bash.command("ls -la /");// cmd with args
		bash.command("echo 123 >&2 ");// test error stream

		bash.stop();
		bash.join();

	}
}
