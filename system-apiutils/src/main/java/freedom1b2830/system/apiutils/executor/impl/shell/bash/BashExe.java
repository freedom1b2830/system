package freedom1b2830.system.apiutils.executor.impl.shell.bash;

import java.nio.file.AccessDeniedException;

import freedom1b2830.system.apiutils.Shells;
import freedom1b2830.system.apiutils.executor.impl.shell.ShellExe;

public class BashExe extends ShellExe {
	public BashExe() throws AccessDeniedException {
		mainCmd = Shells.getShell("bash");
	}

}
