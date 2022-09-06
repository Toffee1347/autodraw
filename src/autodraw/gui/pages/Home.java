package autodraw.gui.pages;

import javax.swing.JLabel;

import autodraw.gui.Page;
import autodraw.gui.Window;

public class Home extends Page {
	public Home(Window window) {
		super(window);

		add(new JLabel("AutoDraw", JLabel.CENTER));
		add(window.makeLinkButton("Start", "start"));
		add(window.makeLinkButton("Settings", "settings"));
	}
}
