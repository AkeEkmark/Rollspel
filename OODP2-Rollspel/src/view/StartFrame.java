package view;

import javax.swing.JFrame;

import controller.Facade;

public class StartFrame extends JFrame {

	private static final long serialVersionUID = -6184805931775692675L;
	private ChoicePanel choicePanel;

	public StartFrame(Facade facade, Gui gui) {
		super();
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(400, 400);
		this.setLocationRelativeTo(gui);
		choicePanel = new ChoicePanel(facade, gui);
		this.add(choicePanel);
		repaint();
		this.setVisible(true);
	}
}
