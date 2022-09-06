package autodraw.gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import autodraw.gui.pages.Home;
import autodraw.gui.pages.Settings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.util.Map;

public class Window implements ActionListener {
	JFrame frame;
	Map<String, JPanel> pages;

	public Window() {
		frame = new JFrame("Drawing Interface");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setTitle("AutoDraw");
		frame.setVisible(true);
		frame.add(getVersionDetails());

		initiateFrame();
		generatePages();
		// showPage("home");
	}
	
	private void initiateFrame() {
		frame.getContentPane().setBackground(new Color(240, 240, 242));
		frame.setLayout(new FlowLayout());
	}

	private void generatePages() {
		pages = Map.of(
			"home", new Home(this),
			"settings", new Settings(this)
		);
	}

	private void showPage(String page) {
		JPanel centeredPannel = new JPanel(new GridBagLayout());
		centeredPannel.add(pages.get(page));

		frame.setContentPane(centeredPannel);
		frame.revalidate();
		frame.repaint();
	}

	private JPanel getVersionDetails() {
		String versions = "Interface: V1.0.0\n" +
			"Upload Server: V1.0.0\n" +
			"Pin Controller: V1.0.0";
		JLabel versionDetails = new JLabel(versions);
		
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.add(versionDetails, BorderLayout.LINE_END);

		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(bottomPanel, BorderLayout.PAGE_END);
		mainPanel.setPreferredSize(new Dimension(400, 400));
		return mainPanel;
	}

	public JButton makeLinkButton(String text, String location) {
		JButton button = Utils.makeButton(text);
		button.addActionListener(this);
		button.setActionCommand(location);
		return button;
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		showPage(e.getActionCommand());
	}
}
