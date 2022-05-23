package freedom1b2830.system.managment.systemd.journald.libs.event.impl;

import java.lang.reflect.Field;

import freedom1b2830.system.managment.systemd.journald.libs.event.JournaldEvent;

public class AuditEvent extends JournaldEvent {

	private static final long serialVersionUID = 6915105866170938015L;

	public AuditEvent(JournaldEvent journaldEvent)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Field[] journaldEventFields = journaldEvent.getClass().getDeclaredFields();
		for (Field field : journaldEventFields) {
			String fielName = field.getName();
			if (fielName.equals("serialVersionUID")) {
				continue;
			}
			if (!field.trySetAccessible()) {
				continue;
			}
			Object journaldEventFieldValue = field.get(journaldEvent);
			if (journaldEventFieldValue == null) {
				continue;
			}
			Field thisField = this.getClass().getSuperclass().getDeclaredField(fielName);
			thisField.set(this, journaldEventFieldValue);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuditEvent [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
