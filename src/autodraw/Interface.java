package autodraw;

import autodraw.gui.Window;

public class Interface {
	Logger logger;
	Window frame;

	public Interface() {
		this.logger = new Logger();
		this.logger.info("Starting interface");
		this.frame = new Window();
	}

	public static void main(String[] args) {
		new Interface();
	}
}
