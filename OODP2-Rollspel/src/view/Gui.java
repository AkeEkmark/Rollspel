package view;

import javax.swing.JFrame;

import controller.Facade;
import model.modelUtilities.ModelFacade;

public class Gui extends JFrame {
	private ModelFacade modelFacade;
	private Facade facade;

	private static final long serialVersionUID = 211431534849779406L;

	public Gui(ModelFacade modelFacade, Facade facade) {
		super();
		this.modelFacade = modelFacade;
		this.facade = facade;
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		
	}
	
	public void start() {
		this.add(new GamePanel(modelFacade));
	}
}
