package view;

import javax.swing.JFrame;

import controller.Facade;
import controller.states.DefaultState;
import controller.states.StateInterface;
import model.modelUtilities.ModelFacade;

public class Gui extends JFrame implements Runnable{
	private ModelFacade modelFacade;
	private Facade facade;

	private static final long serialVersionUID = 211431534849779406L;

	public Gui(ModelFacade modelFacade, Facade facade) {
		super();
		this.modelFacade = modelFacade;
		this.facade = facade;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setName("Rollspel");
		this.setSize(1000, 800);
		this.setLocationRelativeTo(null);
		
	}

	@Override
	public void run() {
		this.add(new GamePanel(modelFacade));
		this.setVisible(true);
		StateInterface state = new DefaultState(Facade.getModel());
		state.setDefaultState(state);
		state.interactionLoop();
	}
}
