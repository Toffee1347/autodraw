package autodraw.gui;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Page extends JPanel {
	protected Window window;

	public Page(Window window) {
		super();
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		setBackground(new Color(253, 253, 255));
		setBorder(new EmptyBorder(20, 20, 20, 20));
		this.window = window;
	}
}
