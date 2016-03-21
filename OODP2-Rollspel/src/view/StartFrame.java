package view;

import javax.swing.JFrame;

import controller.Facade;

public class StartFrame extends JFrame {

	private static final long serialVersionUID = -6184805931775692675L;

	public StartFrame(Facade facade, Gui gui) {
		super();
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(400, 400);
		this.setLocationRelativeTo(gui);
		this.add(new ChoicePanel(facade));
		repaint();
	}
}
