package view.startGui;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NamePanel extends JPanel {
	private NameField nameField;
	private static final long serialVersionUID = 2044931640783769335L;

	public NamePanel() {
		super();
		this.setPreferredSize(new Dimension(400, 50));
		nameField = new NameField(20);
		add(new JLabel("<html><h2>Name</h2></html>"));
		add(nameField);
		this.setVisible(true);
		
	}

	public String getCharName() {
		return nameField.getText();
	}

}
