package protoType.scheduler.Util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {
	private static Logger logger = LogManager.getLogger("protoType");

	public static void setInfoLog(String logStr) {
		logger.info("[Info]" + logStr);
	}

	public static void setErrorLog(String logStr) {
		logger.error("[error]" + logStr);
	}
}
