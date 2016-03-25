package view;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.Factory.ActionBuilder;
import model.modelUtilities.ModelFacade;
import model.roomModel.Action;
import model.roomModel.Location;

public class GameButtonPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 7831184578457609697L;
	private ModelFacade modelFacade;
	private Location location;
	private ActionBuilder actionBuilder;
	
	public GameButtonPanel(ModelFacade modelFacade) {
		super();
		this.modelFacade = modelFacade;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		actionBuilder = new ActionBuilder(this);
		modelFacade.addObserver(this);
		location = modelFacade.getLocation();
		addButtons(location.getAvailableActions());	
		this.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		location = modelFacade.getLocation();
		removeButtons();
		addButtons(location.getAvailableActions());
	}

	private void addButtons(List<Action> availableActions) {
		for(Action a : availableActions) {
			a.accept(actionBuilder);
		}
		this.setVisible(true);
	}

	private void removeButtons() {
		removeAll();
		this.setVisible(false);
		
		
	}
	

}
