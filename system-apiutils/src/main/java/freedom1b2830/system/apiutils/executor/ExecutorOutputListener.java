package freedom1b2830.system.apiutils.executor;

public interface ExecutorOutputListener {

	void out(Executor executor, String line);

	void err(Executor object, String line);

}
