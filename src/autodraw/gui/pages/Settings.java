package autodraw.gui.pages;

import autodraw.gui.Page;
import autodraw.gui.Window;

public class Settings extends Page {
	Window window;

	public Settings(Window window) {
		super(window);

		add(window.makeLinkButton("Teeafswefasegst", "home"));
		add(window.makeLinkButton("Back", "home"));
	}
}
