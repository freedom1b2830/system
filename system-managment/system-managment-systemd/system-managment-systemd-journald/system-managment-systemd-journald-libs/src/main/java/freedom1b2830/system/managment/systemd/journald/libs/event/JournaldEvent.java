package freedom1b2830.system.managment.systemd.journald.libs.event;

import java.io.Serializable;
import java.nio.file.Path;

import freedom1b2830.system.managment.systemd.journald.libs.event.impl.AuditEvent;

public class JournaldEvent implements Serializable {
	private static final long serialVersionUID = -2986137099002178822L;

	public _AUDIT_FIELD_NAMETYPE _AUDIT_FIELD_NAMETYPE;
	public _AUDIT_FIELD_TCLASS _AUDIT_FIELD_TCLASS;
	public CURSOR __CURSOR;
	public Integer _AUDIT_FIELD_ARGC;
	public Integer _AUDIT_FIELD_CAP_FE;
	public Integer _AUDIT_FIELD_CAP_FI;
	public Integer _AUDIT_FIELD_CAP_FP;
	public Integer _AUDIT_FIELD_CAP_FROOTID;
	public Integer _AUDIT_FIELD_CAP_FVER;
	public Integer _AUDIT_FIELD_DEST;
	Long _AUDIT_FIELD_EXIT;
	public Long _AUDIT_FIELD_INO;
	public Integer _AUDIT_FIELD_INODE;
	public Integer _AUDIT_FIELD_ITEM;
	public Integer _AUDIT_FIELD_ITEMS;
	public Integer _AUDIT_FIELD_OGID;
	public Integer _AUDIT_FIELD_OUID;
	public Integer _AUDIT_FIELD_PERMISSIVE;
	public Integer _AUDIT_FIELD_SGID;
	public Integer _AUDIT_FIELD_SUID;
	public Integer _AUDIT_FIELD_SYSCALL;
	public Integer _AUDIT_ID;
	public Long _AUDIT_LOGINUID;
	public Long _AUDIT_SESSION;
	public Integer _AUDIT_TYPE;
	public Long AVAILABLE;
	public Integer CODE_LINE;
	public Long CPU_USAGE_NSEC;
	public Integer CURRENT_USE;
	public Long DISK_AVAILABLE;
	public Long DISK_KEEP_FREE;
	public Integer _EGID;
	public Integer _EUID;
	public Integer _FSGID;
	public Integer _FSUID;
	public Integer _GID;
	public Integer JOB_ID;
	public Long LIMIT;
	public Long MAX_USE;
	public Integer _PID;
	public Integer _PPID;
	public Integer PRIORITY;
	public Long _SOURCE_MONOTONIC_TIMESTAMP;
	public Integer SYSLOG_FACILITY;
	public Integer SYSLOG_PID;
	public Integer TID;
	public Integer _UID;
	public Long __MONOTONIC_TIMESTAMP;
	public Long __REALTIME_TIMESTAMP;
	public Long _SOURCE_REALTIME_TIMESTAMP;
	public NM_LOG_LEVEL NM_LOG_LEVEL;
	public Path AUDIT_FIELD_EXE;
	public Path _AUDIT_FIELD_PATH;
	public Path JOURNAL_PATH;
	public String _AUDIT_FIELD_A0;
	public String _AUDIT_FIELD_A1;
	public String _AUDIT_FIELD_A2;
	public String _AUDIT_FIELD_A3;
	public String AUDIT_FIELD_ADDR;
	public String _AUDIT_FIELD_ARCH;
	public String AUDIT_FIELD_RESULT;
	public String AUDIT_FIELD_COMM;
	public String _AUDIT_FIELD_CWD;
	public String _AUDIT_FIELD_DEV;
	public String AUDIT_FIELD_HOSTNAME;
	public String _AUDIT_FIELD_IOCTLCMD;
	public String _AUDIT_FIELD_KEY;
	public String _AUDIT_FIELD_MODE;
	public String _AUDIT_FIELD_NAME;
	public String _AUDIT_FIELD_OBJ;
	public String _AUDIT_FIELD_RDEV;
	public String _AUDIT_FIELD_A4;
	public String _AUDIT_FIELD_A5;
	public String _AUDIT_FIELD_A6;
	public String _AUDIT_FIELD_A7;
	public String AUDIT_FIELD_RES;
	public String _AUDIT_FIELD_SCONTEXT;
	public String _AUDIT_FIELD_TCONTEXT;
	public String AUDIT_FIELD_TERMINAL;
	public String AUDIT_FIELD_UNIT;
	public String _AUDIT_TYPE_NAME;
	public String AVAILABLE_PRETTY;
	public String _BOOT_ID;
	public String _CAP_EFFECTIVE;
	public String _CMDLINE;
	public String CODE_FILE;
	public String CODE_FUNC;
	public String _COMM;
	public String CURRENT_USE_PRETTY;
	public String DISK_AVAILABLE_PRETTY;
	public String DISK_KEEP_FREE_PRETTY;
	public String _EXE;
	public String _HOSTNAME;
	public String INVOCATION_ID;
	public String JOB_RESULT;
	public String JOB_TYPE;
	public String JOURNAL_NAME;
	public String LIMIT_PRETTY;
	public String _MACHINE_ID;
	public String MAX_USE_PRETTY;
	public String MESSAGE;
	public String MESSAGE_ID;
	public String NM_DEVICE;
	public String NM_LOG_DOMAINS;
	public String _SELINUX_CONTEXT;
	public String _STREAM_ID;
	public String SYSLOG_IDENTIFIER;
	public String SYSLOG_RAW;
	public String SYSLOG_TIMESTAMP;
	public String _SYSTEMD_CGROUP;
	public String _SYSTEMD_INVOCATION_ID;
	public String _SYSTEMD_SLICE;
	public String _SYSTEMD_UNIT;
	public String TIMESTAMP_BOOTTIME;
	public String TIMESTAMP_MONOTONIC;
	public String _TTY;
	public String UNIT;
	public String AUDIT_FIELD_ACCT;
	public _TRANSPORT _TRANSPORT;
	public YesNo _AUDIT_FIELD_SUCCESS;
	public String AUDIT_FIELD_DEFAULT_CONTEXT;
	public String AUDIT_FIELD_DEST;
	public String AUDIT_FIELD_GRANTORS;
	public String AUDIT_FIELD_INTERFACE;
	public String _AUDIT_FIELD_LSM;
	public String AUDIT_FIELD_LSM;
	public String AUDIT_FIELD_MEMBER;
	public String AUDIT_FIELD_MSGTYPE;
	public String _AUDIT_FIELD_OP;
	public String AUDIT_FIELD_OP;
	public String AUDIT_FIELD_SCONTEXT;
	public String _AUDIT_FIELD_TABLE;
	public String AUDIT_FIELD_TCONTEXT;
	public

	String DEVICE;
	public String _KERNEL_DEVICE;
	public String _KERNEL_SUBSYSTEM;
	public String SEAT_ID;
	public String _SYSTEMD_USER_SLICE;
	public String _SYSTEMD_USER_UNIT;
	public Path _UDEV_DEVNODE;
	public String _UDEV_SYSNAME;
	public String USER_ID;
	public String USER_INVOCATION_ID;
	public String USER_UNIT;
	public String WHERE;
	public String AUDIT_FIELD_TCLASS;
	public String PULSE_BACKTRACE;
	public String AUDIT_FIELD_NAME;
	public String AUDIT_FIELD_UUID;
	public String _AUDIT_FIELD_A10;
	public String _AUDIT_FIELD_A11;
	public String _AUDIT_FIELD_A12;
	public String _AUDIT_FIELD_A13;
	public String _AUDIT_FIELD_A14;
	public String _AUDIT_FIELD_A15;
	public String _AUDIT_FIELD_A16;
	public String _AUDIT_FIELD_A17;
	public String _AUDIT_FIELD_A18;
	public String _AUDIT_FIELD_A19;
	public String _AUDIT_FIELD_A20;
	public String GLIB_DOMAIN;
	public String _AUDIT_FIELD_A22;
	public String _AUDIT_FIELD_A24;
	public String _AUDIT_FIELD_A21;
	public String _AUDIT_FIELD_A23;
	public String _AUDIT_FIELD_A8;
	public String _AUDIT_FIELD_A9;
	public String _AUDIT_FIELD_LADDR;
	public String _AUDIT_FIELD_SADDR;
	public

	Integer AUDIT_FIELD_PID;
	public Integer _AUDIT_FIELD_CAP_PA;
	public Integer _AUDIT_FIELD_CAP_PE;
	public Integer _AUDIT_FIELD_CAP_PI;
	public Integer _AUDIT_FIELD_CAP_PP;
	public Integer _AUDIT_FIELD_IPC_KEY;
	public Integer GLIB_OLD_LOG_API;
	public Integer _AUDIT_FIELD_LPORT;
	public Integer _AUDIT_FIELD_CAPABILITY;
	public Integer THREAD_ID;
	public Integer _AUDIT_FIELD_SRC;
	public Integer AUDIT_FIELD_UID;
	public Integer _AUDIT_FIELD_AUDIT_ENABLED;
	public Integer _AUDIT_FIELD_AUDIT_PID;
	public Integer _AUDIT_FIELD_ENABLED;
	public Integer _AUDIT_FIELD_ENFORCING;
	public Integer AUDIT_FIELD_ENFORCING;
	public Integer _AUDIT_FIELD_ENTRIES;
	public Integer _AUDIT_FIELD_FAMILY;
	public Integer _AUDIT_FIELD_OLD_ENABLED;
	public Integer _AUDIT_FIELD_OLD_ENFORCING;
	public Integer _AUDIT_FIELD_PROG_ID;
	public Integer _AUDIT_FIELD_OLD;
	public Integer AUDIT_FIELD_PERMISSIVE;// FIXME \n
	public Integer _AUDIT_FIELD_RES;
	public Integer AUDIT_FIELD_SAUID;
	public Integer AUDIT_FIELD_SPID;
	public Integer AUDIT_FIELD_TPID;
	public Integer ERRNO;
	public Integer LEADER;
	public Integer KERNEL_USEC;
	public Integer SESSION_ID;
	public Integer _SYSTEMD_OWNER_UID;
	public Integer _SYSTEMD_SESSION;
	public Integer USERSPACE_USEC;

	public JournaldEvent cast()
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		if (_AUDIT_FIELD_SCONTEXT != null && _AUDIT_FIELD_TCONTEXT != null) {
			AuditEvent auditEvent = new AuditEvent(this);
			return auditEvent;
		}
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JournaldEvent [");
		if (__CURSOR != null) {
			builder.append("__CURSOR=");
			builder.append(__CURSOR);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_NAMETYPE != null) {
			builder.append("_AUDIT_FIELD_NAMETYPE=");
			builder.append(_AUDIT_FIELD_NAMETYPE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_TCLASS != null) {
			builder.append("_AUDIT_FIELD_TCLASS=");
			builder.append(_AUDIT_FIELD_TCLASS);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ARGC != null) {
			builder.append("_AUDIT_FIELD_ARGC=");
			builder.append(_AUDIT_FIELD_ARGC);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_FE != null) {
			builder.append("_AUDIT_FIELD_CAP_FE=");
			builder.append(_AUDIT_FIELD_CAP_FE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_FI != null) {
			builder.append("_AUDIT_FIELD_CAP_FI=");
			builder.append(_AUDIT_FIELD_CAP_FI);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_FP != null) {
			builder.append("_AUDIT_FIELD_CAP_FP=");
			builder.append(_AUDIT_FIELD_CAP_FP);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_FROOTID != null) {
			builder.append("_AUDIT_FIELD_CAP_FROOTID=");
			builder.append(_AUDIT_FIELD_CAP_FROOTID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_FVER != null) {
			builder.append("_AUDIT_FIELD_CAP_FVER=");
			builder.append(_AUDIT_FIELD_CAP_FVER);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_DEST != null) {
			builder.append("_AUDIT_FIELD_DEST=");
			builder.append(_AUDIT_FIELD_DEST);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_EXIT != null) {
			builder.append("_AUDIT_FIELD_EXIT=");
			builder.append(_AUDIT_FIELD_EXIT);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_INO != null) {
			builder.append("_AUDIT_FIELD_INO=");
			builder.append(_AUDIT_FIELD_INO);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_INODE != null) {
			builder.append("_AUDIT_FIELD_INODE=");
			builder.append(_AUDIT_FIELD_INODE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ITEM != null) {
			builder.append("_AUDIT_FIELD_ITEM=");
			builder.append(_AUDIT_FIELD_ITEM);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ITEMS != null) {
			builder.append("_AUDIT_FIELD_ITEMS=");
			builder.append(_AUDIT_FIELD_ITEMS);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OGID != null) {
			builder.append("_AUDIT_FIELD_OGID=");
			builder.append(_AUDIT_FIELD_OGID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OUID != null) {
			builder.append("_AUDIT_FIELD_OUID=");
			builder.append(_AUDIT_FIELD_OUID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_PERMISSIVE != null) {
			builder.append("_AUDIT_FIELD_PERMISSIVE=");
			builder.append(_AUDIT_FIELD_PERMISSIVE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SGID != null) {
			builder.append("_AUDIT_FIELD_SGID=");
			builder.append(_AUDIT_FIELD_SGID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SUID != null) {
			builder.append("_AUDIT_FIELD_SUID=");
			builder.append(_AUDIT_FIELD_SUID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SYSCALL != null) {
			builder.append("_AUDIT_FIELD_SYSCALL=");
			builder.append(_AUDIT_FIELD_SYSCALL);
			builder.append(", ");
		}
		if (_AUDIT_ID != null) {
			builder.append("_AUDIT_ID=");
			builder.append(_AUDIT_ID);
			builder.append(", ");
		}
		if (_AUDIT_LOGINUID != null) {
			builder.append("_AUDIT_LOGINUID=");
			builder.append(_AUDIT_LOGINUID);
			builder.append(", ");
		}
		if (_AUDIT_SESSION != null) {
			builder.append("_AUDIT_SESSION=");
			builder.append(_AUDIT_SESSION);
			builder.append(", ");
		}
		if (_AUDIT_TYPE != null) {
			builder.append("_AUDIT_TYPE=");
			builder.append(_AUDIT_TYPE);
			builder.append(", ");
		}
		if (AVAILABLE != null) {
			builder.append("AVAILABLE=");
			builder.append(AVAILABLE);
			builder.append(", ");
		}
		if (CODE_LINE != null) {
			builder.append("CODE_LINE=");
			builder.append(CODE_LINE);
			builder.append(", ");
		}
		if (CPU_USAGE_NSEC != null) {
			builder.append("CPU_USAGE_NSEC=");
			builder.append(CPU_USAGE_NSEC);
			builder.append(", ");
		}
		if (CURRENT_USE != null) {
			builder.append("CURRENT_USE=");
			builder.append(CURRENT_USE);
			builder.append(", ");
		}
		if (DISK_AVAILABLE != null) {
			builder.append("DISK_AVAILABLE=");
			builder.append(DISK_AVAILABLE);
			builder.append(", ");
		}
		if (DISK_KEEP_FREE != null) {
			builder.append("DISK_KEEP_FREE=");
			builder.append(DISK_KEEP_FREE);
			builder.append(", ");
		}
		if (_EGID != null) {
			builder.append("_EGID=");
			builder.append(_EGID);
			builder.append(", ");
		}
		if (_EUID != null) {
			builder.append("_EUID=");
			builder.append(_EUID);
			builder.append(", ");
		}
		if (_FSGID != null) {
			builder.append("_FSGID=");
			builder.append(_FSGID);
			builder.append(", ");
		}
		if (_FSUID != null) {
			builder.append("_FSUID=");
			builder.append(_FSUID);
			builder.append(", ");
		}
		if (_GID != null) {
			builder.append("_GID=");
			builder.append(_GID);
			builder.append(", ");
		}
		if (JOB_ID != null) {
			builder.append("JOB_ID=");
			builder.append(JOB_ID);
			builder.append(", ");
		}
		if (LIMIT != null) {
			builder.append("LIMIT=");
			builder.append(LIMIT);
			builder.append(", ");
		}
		if (MAX_USE != null) {
			builder.append("MAX_USE=");
			builder.append(MAX_USE);
			builder.append(", ");
		}
		if (_PID != null) {
			builder.append("_PID=");
			builder.append(_PID);
			builder.append(", ");
		}
		if (_PPID != null) {
			builder.append("_PPID=");
			builder.append(_PPID);
			builder.append(", ");
		}
		if (PRIORITY != null) {
			builder.append("PRIORITY=");
			builder.append(PRIORITY);
			builder.append(", ");
		}
		if (_SOURCE_MONOTONIC_TIMESTAMP != null) {
			builder.append("_SOURCE_MONOTONIC_TIMESTAMP=");
			builder.append(_SOURCE_MONOTONIC_TIMESTAMP);
			builder.append(", ");
		}
		if (SYSLOG_FACILITY != null) {
			builder.append("SYSLOG_FACILITY=");
			builder.append(SYSLOG_FACILITY);
			builder.append(", ");
		}
		if (SYSLOG_PID != null) {
			builder.append("SYSLOG_PID=");
			builder.append(SYSLOG_PID);
			builder.append(", ");
		}
		if (TID != null) {
			builder.append("TID=");
			builder.append(TID);
			builder.append(", ");
		}
		if (_UID != null) {
			builder.append("_UID=");
			builder.append(_UID);
			builder.append(", ");
		}
		if (__MONOTONIC_TIMESTAMP != null) {
			builder.append("__MONOTONIC_TIMESTAMP=");
			builder.append(__MONOTONIC_TIMESTAMP);
			builder.append(", ");
		}
		if (__REALTIME_TIMESTAMP != null) {
			builder.append("__REALTIME_TIMESTAMP=");
			builder.append(__REALTIME_TIMESTAMP);
			builder.append(", ");
		}
		if (_SOURCE_REALTIME_TIMESTAMP != null) {
			builder.append("_SOURCE_REALTIME_TIMESTAMP=");
			builder.append(_SOURCE_REALTIME_TIMESTAMP);
			builder.append(", ");
		}
		if (NM_LOG_LEVEL != null) {
			builder.append("NM_LOG_LEVEL=");
			builder.append(NM_LOG_LEVEL);
			builder.append(", ");
		}
		if (AUDIT_FIELD_EXE != null) {
			builder.append("AUDIT_FIELD_EXE=");
			builder.append(AUDIT_FIELD_EXE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_PATH != null) {
			builder.append("_AUDIT_FIELD_PATH=");
			builder.append(_AUDIT_FIELD_PATH);
			builder.append(", ");
		}
		if (JOURNAL_PATH != null) {
			builder.append("JOURNAL_PATH=");
			builder.append(JOURNAL_PATH);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A0 != null) {
			builder.append("_AUDIT_FIELD_A0=");
			builder.append(_AUDIT_FIELD_A0);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A1 != null) {
			builder.append("_AUDIT_FIELD_A1=");
			builder.append(_AUDIT_FIELD_A1);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A2 != null) {
			builder.append("_AUDIT_FIELD_A2=");
			builder.append(_AUDIT_FIELD_A2);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A3 != null) {
			builder.append("_AUDIT_FIELD_A3=");
			builder.append(_AUDIT_FIELD_A3);
			builder.append(", ");
		}
		if (AUDIT_FIELD_ADDR != null) {
			builder.append("AUDIT_FIELD_ADDR=");
			builder.append(AUDIT_FIELD_ADDR);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ARCH != null) {
			builder.append("_AUDIT_FIELD_ARCH=");
			builder.append(_AUDIT_FIELD_ARCH);
			builder.append(", ");
		}
		if (AUDIT_FIELD_RESULT != null) {
			builder.append("AUDIT_FIELD_RESULT=");
			builder.append(AUDIT_FIELD_RESULT);
			builder.append(", ");
		}
		if (AUDIT_FIELD_COMM != null) {
			builder.append("AUDIT_FIELD_COMM=");
			builder.append(AUDIT_FIELD_COMM);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CWD != null) {
			builder.append("_AUDIT_FIELD_CWD=");
			builder.append(_AUDIT_FIELD_CWD);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_DEV != null) {
			builder.append("_AUDIT_FIELD_DEV=");
			builder.append(_AUDIT_FIELD_DEV);
			builder.append(", ");
		}
		if (AUDIT_FIELD_HOSTNAME != null) {
			builder.append("AUDIT_FIELD_HOSTNAME=");
			builder.append(AUDIT_FIELD_HOSTNAME);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_IOCTLCMD != null) {
			builder.append("_AUDIT_FIELD_IOCTLCMD=");
			builder.append(_AUDIT_FIELD_IOCTLCMD);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_KEY != null) {
			builder.append("_AUDIT_FIELD_KEY=");
			builder.append(_AUDIT_FIELD_KEY);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_MODE != null) {
			builder.append("_AUDIT_FIELD_MODE=");
			builder.append(_AUDIT_FIELD_MODE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_NAME != null) {
			builder.append("_AUDIT_FIELD_NAME=");
			builder.append(_AUDIT_FIELD_NAME);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OBJ != null) {
			builder.append("_AUDIT_FIELD_OBJ=");
			builder.append(_AUDIT_FIELD_OBJ);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_RDEV != null) {
			builder.append("_AUDIT_FIELD_RDEV=");
			builder.append(_AUDIT_FIELD_RDEV);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A4 != null) {
			builder.append("_AUDIT_FIELD_A4=");
			builder.append(_AUDIT_FIELD_A4);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A5 != null) {
			builder.append("_AUDIT_FIELD_A5=");
			builder.append(_AUDIT_FIELD_A5);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A6 != null) {
			builder.append("_AUDIT_FIELD_A6=");
			builder.append(_AUDIT_FIELD_A6);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A7 != null) {
			builder.append("_AUDIT_FIELD_A7=");
			builder.append(_AUDIT_FIELD_A7);
			builder.append(", ");
		}
		if (AUDIT_FIELD_RES != null) {
			builder.append("AUDIT_FIELD_RES=");
			builder.append(AUDIT_FIELD_RES);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SCONTEXT != null) {
			builder.append("_AUDIT_FIELD_SCONTEXT=");
			builder.append(_AUDIT_FIELD_SCONTEXT);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_TCONTEXT != null) {
			builder.append("_AUDIT_FIELD_TCONTEXT=");
			builder.append(_AUDIT_FIELD_TCONTEXT);
			builder.append(", ");
		}
		if (AUDIT_FIELD_TERMINAL != null) {
			builder.append("AUDIT_FIELD_TERMINAL=");
			builder.append(AUDIT_FIELD_TERMINAL);
			builder.append(", ");
		}
		if (AUDIT_FIELD_UNIT != null) {
			builder.append("AUDIT_FIELD_UNIT=");
			builder.append(AUDIT_FIELD_UNIT);
			builder.append(", ");
		}
		if (_AUDIT_TYPE_NAME != null) {
			builder.append("_AUDIT_TYPE_NAME=");
			builder.append(_AUDIT_TYPE_NAME);
			builder.append(", ");
		}
		if (AVAILABLE_PRETTY != null) {
			builder.append("AVAILABLE_PRETTY=");
			builder.append(AVAILABLE_PRETTY);
			builder.append(", ");
		}
		if (_BOOT_ID != null) {
			builder.append("_BOOT_ID=");
			builder.append(_BOOT_ID);
			builder.append(", ");
		}
		if (_CAP_EFFECTIVE != null) {
			builder.append("_CAP_EFFECTIVE=");
			builder.append(_CAP_EFFECTIVE);
			builder.append(", ");
		}
		if (_CMDLINE != null) {
			builder.append("_CMDLINE=");
			builder.append(_CMDLINE);
			builder.append(", ");
		}
		if (CODE_FILE != null) {
			builder.append("CODE_FILE=");
			builder.append(CODE_FILE);
			builder.append(", ");
		}
		if (CODE_FUNC != null) {
			builder.append("CODE_FUNC=");
			builder.append(CODE_FUNC);
			builder.append(", ");
		}
		if (_COMM != null) {
			builder.append("_COMM=");
			builder.append(_COMM);
			builder.append(", ");
		}
		if (CURRENT_USE_PRETTY != null) {
			builder.append("CURRENT_USE_PRETTY=");
			builder.append(CURRENT_USE_PRETTY);
			builder.append(", ");
		}
		if (DISK_AVAILABLE_PRETTY != null) {
			builder.append("DISK_AVAILABLE_PRETTY=");
			builder.append(DISK_AVAILABLE_PRETTY);
			builder.append(", ");
		}
		if (DISK_KEEP_FREE_PRETTY != null) {
			builder.append("DISK_KEEP_FREE_PRETTY=");
			builder.append(DISK_KEEP_FREE_PRETTY);
			builder.append(", ");
		}
		if (_EXE != null) {
			builder.append("_EXE=");
			builder.append(_EXE);
			builder.append(", ");
		}
		if (_HOSTNAME != null) {
			builder.append("_HOSTNAME=");
			builder.append(_HOSTNAME);
			builder.append(", ");
		}
		if (INVOCATION_ID != null) {
			builder.append("INVOCATION_ID=");
			builder.append(INVOCATION_ID);
			builder.append(", ");
		}
		if (JOB_RESULT != null) {
			builder.append("JOB_RESULT=");
			builder.append(JOB_RESULT);
			builder.append(", ");
		}
		if (JOB_TYPE != null) {
			builder.append("JOB_TYPE=");
			builder.append(JOB_TYPE);
			builder.append(", ");
		}
		if (JOURNAL_NAME != null) {
			builder.append("JOURNAL_NAME=");
			builder.append(JOURNAL_NAME);
			builder.append(", ");
		}
		if (LIMIT_PRETTY != null) {
			builder.append("LIMIT_PRETTY=");
			builder.append(LIMIT_PRETTY);
			builder.append(", ");
		}
		if (_MACHINE_ID != null) {
			builder.append("_MACHINE_ID=");
			builder.append(_MACHINE_ID);
			builder.append(", ");
		}
		if (MAX_USE_PRETTY != null) {
			builder.append("MAX_USE_PRETTY=");
			builder.append(MAX_USE_PRETTY);
			builder.append(", ");
		}
		if (MESSAGE != null) {
			builder.append("MESSAGE=");
			builder.append(MESSAGE);
			builder.append(", ");
		}
		if (MESSAGE_ID != null) {
			builder.append("MESSAGE_ID=");
			builder.append(MESSAGE_ID);
			builder.append(", ");
		}
		if (NM_DEVICE != null) {
			builder.append("NM_DEVICE=");
			builder.append(NM_DEVICE);
			builder.append(", ");
		}
		if (NM_LOG_DOMAINS != null) {
			builder.append("NM_LOG_DOMAINS=");
			builder.append(NM_LOG_DOMAINS);
			builder.append(", ");
		}
		if (_SELINUX_CONTEXT != null) {
			builder.append("_SELINUX_CONTEXT=");
			builder.append(_SELINUX_CONTEXT);
			builder.append(", ");
		}
		if (_STREAM_ID != null) {
			builder.append("_STREAM_ID=");
			builder.append(_STREAM_ID);
			builder.append(", ");
		}
		if (SYSLOG_IDENTIFIER != null) {
			builder.append("SYSLOG_IDENTIFIER=");
			builder.append(SYSLOG_IDENTIFIER);
			builder.append(", ");
		}
		if (SYSLOG_RAW != null) {
			builder.append("SYSLOG_RAW=");
			builder.append(SYSLOG_RAW);
			builder.append(", ");
		}
		if (SYSLOG_TIMESTAMP != null) {
			builder.append("SYSLOG_TIMESTAMP=");
			builder.append(SYSLOG_TIMESTAMP);
			builder.append(", ");
		}
		if (_SYSTEMD_CGROUP != null) {
			builder.append("_SYSTEMD_CGROUP=");
			builder.append(_SYSTEMD_CGROUP);
			builder.append(", ");
		}
		if (_SYSTEMD_INVOCATION_ID != null) {
			builder.append("_SYSTEMD_INVOCATION_ID=");
			builder.append(_SYSTEMD_INVOCATION_ID);
			builder.append(", ");
		}
		if (_SYSTEMD_SLICE != null) {
			builder.append("_SYSTEMD_SLICE=");
			builder.append(_SYSTEMD_SLICE);
			builder.append(", ");
		}
		if (_SYSTEMD_UNIT != null) {
			builder.append("_SYSTEMD_UNIT=");
			builder.append(_SYSTEMD_UNIT);
			builder.append(", ");
		}
		if (TIMESTAMP_BOOTTIME != null) {
			builder.append("TIMESTAMP_BOOTTIME=");
			builder.append(TIMESTAMP_BOOTTIME);
			builder.append(", ");
		}
		if (TIMESTAMP_MONOTONIC != null) {
			builder.append("TIMESTAMP_MONOTONIC=");
			builder.append(TIMESTAMP_MONOTONIC);
			builder.append(", ");
		}
		if (_TTY != null) {
			builder.append("_TTY=");
			builder.append(_TTY);
			builder.append(", ");
		}
		if (UNIT != null) {
			builder.append("UNIT=");
			builder.append(UNIT);
			builder.append(", ");
		}
		if (AUDIT_FIELD_ACCT != null) {
			builder.append("AUDIT_FIELD_ACCT=");
			builder.append(AUDIT_FIELD_ACCT);
			builder.append(", ");
		}
		if (_TRANSPORT != null) {
			builder.append("_TRANSPORT=");
			builder.append(_TRANSPORT);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SUCCESS != null) {
			builder.append("_AUDIT_FIELD_SUCCESS=");
			builder.append(_AUDIT_FIELD_SUCCESS);
			builder.append(", ");
		}
		if (AUDIT_FIELD_DEFAULT_CONTEXT != null) {
			builder.append("AUDIT_FIELD_DEFAULT_CONTEXT=");
			builder.append(AUDIT_FIELD_DEFAULT_CONTEXT);
			builder.append(", ");
		}
		if (AUDIT_FIELD_DEST != null) {
			builder.append("AUDIT_FIELD_DEST=");
			builder.append(AUDIT_FIELD_DEST);
			builder.append(", ");
		}
		if (AUDIT_FIELD_GRANTORS != null) {
			builder.append("AUDIT_FIELD_GRANTORS=");
			builder.append(AUDIT_FIELD_GRANTORS);
			builder.append(", ");
		}
		if (AUDIT_FIELD_INTERFACE != null) {
			builder.append("AUDIT_FIELD_INTERFACE=");
			builder.append(AUDIT_FIELD_INTERFACE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_LSM != null) {
			builder.append("_AUDIT_FIELD_LSM=");
			builder.append(_AUDIT_FIELD_LSM);
			builder.append(", ");
		}
		if (AUDIT_FIELD_LSM != null) {
			builder.append("AUDIT_FIELD_LSM=");
			builder.append(AUDIT_FIELD_LSM);
			builder.append(", ");
		}
		if (AUDIT_FIELD_MEMBER != null) {
			builder.append("AUDIT_FIELD_MEMBER=");
			builder.append(AUDIT_FIELD_MEMBER);
			builder.append(", ");
		}
		if (AUDIT_FIELD_MSGTYPE != null) {
			builder.append("AUDIT_FIELD_MSGTYPE=");
			builder.append(AUDIT_FIELD_MSGTYPE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OP != null) {
			builder.append("_AUDIT_FIELD_OP=");
			builder.append(_AUDIT_FIELD_OP);
			builder.append(", ");
		}
		if (AUDIT_FIELD_OP != null) {
			builder.append("AUDIT_FIELD_OP=");
			builder.append(AUDIT_FIELD_OP);
			builder.append(", ");
		}
		if (AUDIT_FIELD_SCONTEXT != null) {
			builder.append("AUDIT_FIELD_SCONTEXT=");
			builder.append(AUDIT_FIELD_SCONTEXT);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_TABLE != null) {
			builder.append("_AUDIT_FIELD_TABLE=");
			builder.append(_AUDIT_FIELD_TABLE);
			builder.append(", ");
		}
		if (AUDIT_FIELD_TCONTEXT != null) {
			builder.append("AUDIT_FIELD_TCONTEXT=");
			builder.append(AUDIT_FIELD_TCONTEXT);
			builder.append(", ");
		}
		if (DEVICE != null) {
			builder.append("DEVICE=");
			builder.append(DEVICE);
			builder.append(", ");
		}
		if (_KERNEL_DEVICE != null) {
			builder.append("_KERNEL_DEVICE=");
			builder.append(_KERNEL_DEVICE);
			builder.append(", ");
		}
		if (_KERNEL_SUBSYSTEM != null) {
			builder.append("_KERNEL_SUBSYSTEM=");
			builder.append(_KERNEL_SUBSYSTEM);
			builder.append(", ");
		}
		if (SEAT_ID != null) {
			builder.append("SEAT_ID=");
			builder.append(SEAT_ID);
			builder.append(", ");
		}
		if (_SYSTEMD_USER_SLICE != null) {
			builder.append("_SYSTEMD_USER_SLICE=");
			builder.append(_SYSTEMD_USER_SLICE);
			builder.append(", ");
		}
		if (_SYSTEMD_USER_UNIT != null) {
			builder.append("_SYSTEMD_USER_UNIT=");
			builder.append(_SYSTEMD_USER_UNIT);
			builder.append(", ");
		}
		if (_UDEV_DEVNODE != null) {
			builder.append("_UDEV_DEVNODE=");
			builder.append(_UDEV_DEVNODE);
			builder.append(", ");
		}
		if (_UDEV_SYSNAME != null) {
			builder.append("_UDEV_SYSNAME=");
			builder.append(_UDEV_SYSNAME);
			builder.append(", ");
		}
		if (USER_ID != null) {
			builder.append("USER_ID=");
			builder.append(USER_ID);
			builder.append(", ");
		}
		if (USER_INVOCATION_ID != null) {
			builder.append("USER_INVOCATION_ID=");
			builder.append(USER_INVOCATION_ID);
			builder.append(", ");
		}
		if (USER_UNIT != null) {
			builder.append("USER_UNIT=");
			builder.append(USER_UNIT);
			builder.append(", ");
		}
		if (WHERE != null) {
			builder.append("WHERE=");
			builder.append(WHERE);
			builder.append(", ");
		}
		if (AUDIT_FIELD_TCLASS != null) {
			builder.append("AUDIT_FIELD_TCLASS=");
			builder.append(AUDIT_FIELD_TCLASS);
			builder.append(", ");
		}
		if (PULSE_BACKTRACE != null) {
			builder.append("PULSE_BACKTRACE=");
			builder.append(PULSE_BACKTRACE);
			builder.append(", ");
		}
		if (AUDIT_FIELD_NAME != null) {
			builder.append("AUDIT_FIELD_NAME=");
			builder.append(AUDIT_FIELD_NAME);
			builder.append(", ");
		}
		if (AUDIT_FIELD_UUID != null) {
			builder.append("AUDIT_FIELD_UUID=");
			builder.append(AUDIT_FIELD_UUID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A10 != null) {
			builder.append("_AUDIT_FIELD_A10=");
			builder.append(_AUDIT_FIELD_A10);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A11 != null) {
			builder.append("_AUDIT_FIELD_A11=");
			builder.append(_AUDIT_FIELD_A11);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A12 != null) {
			builder.append("_AUDIT_FIELD_A12=");
			builder.append(_AUDIT_FIELD_A12);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A13 != null) {
			builder.append("_AUDIT_FIELD_A13=");
			builder.append(_AUDIT_FIELD_A13);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A14 != null) {
			builder.append("_AUDIT_FIELD_A14=");
			builder.append(_AUDIT_FIELD_A14);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A15 != null) {
			builder.append("_AUDIT_FIELD_A15=");
			builder.append(_AUDIT_FIELD_A15);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A16 != null) {
			builder.append("_AUDIT_FIELD_A16=");
			builder.append(_AUDIT_FIELD_A16);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A17 != null) {
			builder.append("_AUDIT_FIELD_A17=");
			builder.append(_AUDIT_FIELD_A17);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A18 != null) {
			builder.append("_AUDIT_FIELD_A18=");
			builder.append(_AUDIT_FIELD_A18);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A19 != null) {
			builder.append("_AUDIT_FIELD_A19=");
			builder.append(_AUDIT_FIELD_A19);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A20 != null) {
			builder.append("_AUDIT_FIELD_A20=");
			builder.append(_AUDIT_FIELD_A20);
			builder.append(", ");
		}
		if (GLIB_DOMAIN != null) {
			builder.append("GLIB_DOMAIN=");
			builder.append(GLIB_DOMAIN);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A22 != null) {
			builder.append("_AUDIT_FIELD_A22=");
			builder.append(_AUDIT_FIELD_A22);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A24 != null) {
			builder.append("_AUDIT_FIELD_A24=");
			builder.append(_AUDIT_FIELD_A24);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A21 != null) {
			builder.append("_AUDIT_FIELD_A21=");
			builder.append(_AUDIT_FIELD_A21);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A23 != null) {
			builder.append("_AUDIT_FIELD_A23=");
			builder.append(_AUDIT_FIELD_A23);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A8 != null) {
			builder.append("_AUDIT_FIELD_A8=");
			builder.append(_AUDIT_FIELD_A8);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_A9 != null) {
			builder.append("_AUDIT_FIELD_A9=");
			builder.append(_AUDIT_FIELD_A9);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_LADDR != null) {
			builder.append("_AUDIT_FIELD_LADDR=");
			builder.append(_AUDIT_FIELD_LADDR);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SADDR != null) {
			builder.append("_AUDIT_FIELD_SADDR=");
			builder.append(_AUDIT_FIELD_SADDR);
			builder.append(", ");
		}
		if (AUDIT_FIELD_PID != null) {
			builder.append("AUDIT_FIELD_PID=");
			builder.append(AUDIT_FIELD_PID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_PA != null) {
			builder.append("_AUDIT_FIELD_CAP_PA=");
			builder.append(_AUDIT_FIELD_CAP_PA);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_PE != null) {
			builder.append("_AUDIT_FIELD_CAP_PE=");
			builder.append(_AUDIT_FIELD_CAP_PE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_PI != null) {
			builder.append("_AUDIT_FIELD_CAP_PI=");
			builder.append(_AUDIT_FIELD_CAP_PI);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAP_PP != null) {
			builder.append("_AUDIT_FIELD_CAP_PP=");
			builder.append(_AUDIT_FIELD_CAP_PP);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_IPC_KEY != null) {
			builder.append("_AUDIT_FIELD_IPC_KEY=");
			builder.append(_AUDIT_FIELD_IPC_KEY);
			builder.append(", ");
		}
		if (GLIB_OLD_LOG_API != null) {
			builder.append("GLIB_OLD_LOG_API=");
			builder.append(GLIB_OLD_LOG_API);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_LPORT != null) {
			builder.append("_AUDIT_FIELD_LPORT=");
			builder.append(_AUDIT_FIELD_LPORT);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_CAPABILITY != null) {
			builder.append("_AUDIT_FIELD_CAPABILITY=");
			builder.append(_AUDIT_FIELD_CAPABILITY);
			builder.append(", ");
		}
		if (THREAD_ID != null) {
			builder.append("THREAD_ID=");
			builder.append(THREAD_ID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_SRC != null) {
			builder.append("_AUDIT_FIELD_SRC=");
			builder.append(_AUDIT_FIELD_SRC);
			builder.append(", ");
		}
		if (AUDIT_FIELD_UID != null) {
			builder.append("AUDIT_FIELD_UID=");
			builder.append(AUDIT_FIELD_UID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_AUDIT_ENABLED != null) {
			builder.append("_AUDIT_FIELD_AUDIT_ENABLED=");
			builder.append(_AUDIT_FIELD_AUDIT_ENABLED);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_AUDIT_PID != null) {
			builder.append("_AUDIT_FIELD_AUDIT_PID=");
			builder.append(_AUDIT_FIELD_AUDIT_PID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ENABLED != null) {
			builder.append("_AUDIT_FIELD_ENABLED=");
			builder.append(_AUDIT_FIELD_ENABLED);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ENFORCING != null) {
			builder.append("_AUDIT_FIELD_ENFORCING=");
			builder.append(_AUDIT_FIELD_ENFORCING);
			builder.append(", ");
		}
		if (AUDIT_FIELD_ENFORCING != null) {
			builder.append("AUDIT_FIELD_ENFORCING=");
			builder.append(AUDIT_FIELD_ENFORCING);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_ENTRIES != null) {
			builder.append("_AUDIT_FIELD_ENTRIES=");
			builder.append(_AUDIT_FIELD_ENTRIES);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_FAMILY != null) {
			builder.append("_AUDIT_FIELD_FAMILY=");
			builder.append(_AUDIT_FIELD_FAMILY);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OLD_ENABLED != null) {
			builder.append("_AUDIT_FIELD_OLD_ENABLED=");
			builder.append(_AUDIT_FIELD_OLD_ENABLED);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OLD_ENFORCING != null) {
			builder.append("_AUDIT_FIELD_OLD_ENFORCING=");
			builder.append(_AUDIT_FIELD_OLD_ENFORCING);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_PROG_ID != null) {
			builder.append("_AUDIT_FIELD_PROG_ID=");
			builder.append(_AUDIT_FIELD_PROG_ID);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_OLD != null) {
			builder.append("_AUDIT_FIELD_OLD=");
			builder.append(_AUDIT_FIELD_OLD);
			builder.append(", ");
		}
		if (AUDIT_FIELD_PERMISSIVE != null) {
			builder.append("AUDIT_FIELD_PERMISSIVE=");
			builder.append(AUDIT_FIELD_PERMISSIVE);
			builder.append(", ");
		}
		if (_AUDIT_FIELD_RES != null) {
			builder.append("_AUDIT_FIELD_RES=");
			builder.append(_AUDIT_FIELD_RES);
			builder.append(", ");
		}
		if (AUDIT_FIELD_SAUID != null) {
			builder.append("AUDIT_FIELD_SAUID=");
			builder.append(AUDIT_FIELD_SAUID);
			builder.append(", ");
		}
		if (AUDIT_FIELD_SPID != null) {
			builder.append("AUDIT_FIELD_SPID=");
			builder.append(AUDIT_FIELD_SPID);
			builder.append(", ");
		}
		if (AUDIT_FIELD_TPID != null) {
			builder.append("AUDIT_FIELD_TPID=");
			builder.append(AUDIT_FIELD_TPID);
			builder.append(", ");
		}
		if (ERRNO != null) {
			builder.append("ERRNO=");
			builder.append(ERRNO);
			builder.append(", ");
		}
		if (LEADER != null) {
			builder.append("LEADER=");
			builder.append(LEADER);
			builder.append(", ");
		}
		if (KERNEL_USEC != null) {
			builder.append("KERNEL_USEC=");
			builder.append(KERNEL_USEC);
			builder.append(", ");
		}
		if (SESSION_ID != null) {
			builder.append("SESSION_ID=");
			builder.append(SESSION_ID);
			builder.append(", ");
		}
		if (_SYSTEMD_OWNER_UID != null) {
			builder.append("_SYSTEMD_OWNER_UID=");
			builder.append(_SYSTEMD_OWNER_UID);
			builder.append(", ");
		}
		if (_SYSTEMD_SESSION != null) {
			builder.append("_SYSTEMD_SESSION=");
			builder.append(_SYSTEMD_SESSION);
			builder.append(", ");
		}
		if (USERSPACE_USEC != null) {
			builder.append("USERSPACE_USEC=");
			builder.append(USERSPACE_USEC);
		}
		builder.append("]");
		return builder.toString();
	}

}
