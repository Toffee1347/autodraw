package autodraw.gui;

import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import java.awt.Color;

public class Utils {
	public static JButton makeButton(String text) {
		JButton button = new JButton(text);
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(51, 122, 183));
		Border line = new LineBorder(new Color(46, 109, 164), 1, true);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		button.setBorder(compound);
		return button;
	}
}
