package view;

import javax.swing.JFrame;

import model.modelUtilities.ModelFacade;

public class Gui extends JFrame{

	private static final long serialVersionUID = 211431534849779406L;

	public Gui(ModelFacade modelFacade) {
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(800, 600);
		this.add(new GamePanel(modelFacade));
	}
}
