package freedom1b2830.system.managment.systemd.journald.libs.event;

public class CURSOR {

	private String s;
	private String i;
	private String b;
	private String m;
	private String t;
	private String x;

	public void parse(String val) {
		String[] ar = val.split(";");
		if (ar.length != 6) {
			throw new IllegalArgumentException(String.format("val.split(;)!=6 for val:[%s]", val));
		}
		for (String string : ar) {
			String[] arPair = string.split("=");
			String key = arPair[0];
			String value = arPair[1];

			if (key.equals("s")) {
				s = value;
			} else if (key.equals("i")) {
				i = value;
			} else if (key.equals("b")) {
				b = value;
			} else if (key.equals("m")) {
				m = value;
			} else if (key.equals("t")) {
				t = value;
			} else if (key.equals("x")) {
				x = value;
			} else {
				throw new IllegalArgumentException("unexpect:" + string);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CURSOR [m=");
		builder.append(m);
		builder.append(", s=");
		builder.append(s);
		builder.append(", i=");
		builder.append(i);
		builder.append(", b=");
		builder.append(b);
		builder.append(", t=");
		builder.append(t);
		builder.append(", x=");
		builder.append(x);
		builder.append("]");
		return builder.toString();
	}

}
