package freedom1b2830.system.apiutils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

public class Shells {
	public final static String BASH = "bash";
	public final static String ZSH = "zsh";
	public final static String DASH = "dash";

	/**
	 *
	 * переписать (восстановить очередность)
	 *
	 * @param needShell
	 * @return
	 * @throws java.nio.file.AccessDeniedException for getattr syscall
	 */
	public @Deprecated static Path getShell(String needShell) throws java.nio.file.AccessDeniedException {
		final String PATH = System.getenv("PATH");
		String[] dirs = PATH.split(":");

		CopyOnWriteArrayList<Path> shells = new CopyOnWriteArrayList<>();

		Arrays.asList(dirs).parallelStream().forEachOrdered(pathString -> {
			try {
				File file = new File(pathString);
				Files.walk(file.toPath()).parallel().filter(path -> {
					File tmpFile = path.toFile();
					if (tmpFile.isFile()) {
						return true;
					}
					return false;
				}).forEachOrdered(path -> {
					File tmpFile = path.toFile();
					String fileName = tmpFile.getName();
					if (needShell != null && !needShell.strip().trim().isEmpty()
							&& needShell.equalsIgnoreCase(fileName)) {
						shells.add(path);
						return;
					}
					if (fileName.equalsIgnoreCase(BASH) || fileName.equalsIgnoreCase(ZSH)
							|| fileName.equalsIgnoreCase(DASH)) {
						shells.add(path);
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		// for needed
		if (needShell != null && !needShell.strip().trim().isEmpty()) {// NPE,not empty
			Optional<Path> neededF = shells.stream().filter(path -> {
				String fileName = path.toFile().getName();
				return needShell.equalsIgnoreCase(fileName);
			}).findFirst();
			if (neededF.isPresent()) {
				return neededF.get();
			}
		}

		// fallback
		for (Path path2 : shells) {
			File file = path2.toFile();
			String fileName = file.getName();
			if (fileName.equalsIgnoreCase(BASH)) {
				return path2;
			}
			if (fileName.equalsIgnoreCase(ZSH)) {
				return path2;
			}
			if (fileName.equalsIgnoreCase(DASH)) {
				return path2;
			}
		}
		return null;
	}

}
