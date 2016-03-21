package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class NamePanel extends JPanel {
	private NameField nameField;
	private static final long serialVersionUID = 2044931640783769335L;

	public NamePanel() {
		super();
		this.setVisible(true);
		this.setPreferredSize(new Dimension(400, 50));
		nameField = new NameField(20);
		add(new JLabel("<html><h2>Name</h2></html>"));
		add(nameField);
		
	}

	public String getCharName() {
		return nameField.getText();
	}

}
