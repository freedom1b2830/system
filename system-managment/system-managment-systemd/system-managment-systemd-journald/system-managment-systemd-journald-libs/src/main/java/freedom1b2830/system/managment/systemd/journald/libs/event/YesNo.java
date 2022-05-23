package freedom1b2830.system.managment.systemd.journald.libs.event;

public class YesNo {
	private static final String NO_low = "no";
	private static final String NO = "NO";
	private static final String YES_low = "yes";
	private static final String YES = "YES";
	private boolean low;
	private boolean yes;

	public YesNo(String input) {
		if (input.equals(YES)) {
			yes = true;
			low = false;
		} else if (input.equals(YES_low)) {
			yes = true;
			low = true;
		} else if (input.equals(NO)) {
			yes = false;
			low = false;
		} else if (input.equals(NO_low)) {
			yes = false;
			low = true;
		} else {
			throw new IllegalArgumentException(String.format("unexp value:", input));
		}
	}

	public String get() {
		if (yes) {
			if (low) {
				return YES_low;
			}
			return YES;
		} else {
			if (low) {
				return NO_low;
			}
			return NO;
		}
	}

	public boolean isLow() {
		return low;
	}

	@Override
	public String toString() {
		return get();
	}
}
