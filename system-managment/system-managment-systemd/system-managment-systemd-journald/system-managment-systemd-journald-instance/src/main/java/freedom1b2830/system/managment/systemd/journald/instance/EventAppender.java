package freedom1b2830.system.managment.systemd.journald.instance;

import java.io.File;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.NoSuchElementException;

import freedom1b2830.system.managment.systemd.journald.libs.event.CURSOR;
import freedom1b2830.system.managment.systemd.journald.libs.event.JournaldEvent;
import freedom1b2830.system.managment.systemd.journald.libs.event.YesNo;

public class EventAppender {

	public void append(JournaldEvent journaldEvent, String key, Object val)
			throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Field[] fields = journaldEvent.getClass().getDeclaredFields();
		Field field = checkContainsFields(journaldEvent, fields, key);

		try {

			field.trySetAccessible();

			Class<?> type0 = field.getType();
			AnnotatedType type = field.getAnnotatedType();
			Type type2 = type.getType();

			if (type2 == Integer.class) {
				if (key.equals("AUDIT_FIELD_PERMISSIVE")) {
					// FIXME ECLIPSE/DBEAVER DBUS BUG (remove \n from val)
					val = val.toString().trim().strip();
				}
				field.set(journaldEvent, Integer.valueOf(val.toString()));
			} else if (type2 == String.class) {
				field.set(journaldEvent, val.toString());
			} else if (type2 == Long.class) {
				field.set(journaldEvent, Long.valueOf(val.toString()));
			} else if (type2 == Path.class) {
				File file = new File((String) val);
				field.set(journaldEvent, file.toPath());
			} else if (type0.getSuperclass() == Enum.class) {
				try {
					@SuppressWarnings("unchecked")
					Enum<?> enuum = Enum.valueOf((Class) type0, (String) val);
					field.set(journaldEvent, enuum);
				} catch (NoSuchElementException | IllegalArgumentException e) {
					String msg = String.format("value:%s", val);
					throw new NoSuchElementException(msg);
				}
			} else if (type2 == CURSOR.class) {
				CURSOR cursor = new CURSOR();
				cursor.parse((String) val);
				field.set(journaldEvent, cursor);
			} else if (type2 == YesNo.class) {
				YesNo cursor = new YesNo((String) val);
				field.set(journaldEvent, cursor);
			}

			else {
				throw new UnsupportedOperationException(String.format("TODO %s", field));
			}
		} catch (NoSuchElementException e) {
			throw e;
		} catch (Exception e) {
			System.err.println(String.format("exc:appendValue field:%s msg:%s", field.getName(), e.getMessage()));
			throw e;
		}

	}

	private Field checkContainsFields(JournaldEvent journaldEvent, Field[] fields, String key)
			throws NoSuchFieldException {
		for (Field field : fields) {
			String fielName = field.getName();
			if (fielName.equals("serialVersionUID")) {
				continue;
			}
			if (fielName.equals(key)) {
				return field;
			}
		}
		throw new NoSuchFieldException(
				String.format("pl impl in class %s : %s", journaldEvent.getClass().getSimpleName(), key));
	}

}
