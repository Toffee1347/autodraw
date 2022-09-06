package autodraw;

import java.time.LocalDateTime;

public class Logger {
	public Logger() {
		this.info("Logger initialized");
	}

	private static String getTime() {
		LocalDateTime now = LocalDateTime.now();
		return now.getHour() + ":" + now.getMinute() + ":" + now.getSecond();
	}

	private static void log(String message, String level) {
		System.out.println("[" + level + "][" + Logger.getTime() + "] " + message);
	}

	public void info(String message) {
		Logger.log(message, "info");
	}
	public void warn(String message) {
		Logger.log(message, "warn");
	}
	public void error(String message, Error error) {
		Logger.log(error == null ? message : message + "\n" + error, "error");
	}
}
