package view;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformationPanel extends JPanel {

	private static final long serialVersionUID = -3071268708346186062L;
	
	public InformationPanel() {
		super();
		this.setPreferredSize(new Dimension(400, 100));
		add(new JLabel("<html><h1>Welcome to Rollspel!</h1><br>"
				+ "<p>Choose a name and a class and venture forth!</p></html>"));
		this.setVisible(true);
	}
}
