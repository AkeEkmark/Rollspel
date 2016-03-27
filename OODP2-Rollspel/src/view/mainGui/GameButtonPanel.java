package view.mainGui;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import model.modelUtilities.ModelFacade;
import model.roomModel.Action;
import model.roomModel.Location;
import view.ActionButtonBuilder;

public class GameButtonPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 7831184578457609697L;
	private ModelFacade modelFacade;
	private Location location;
	private ActionButtonBuilder actionBuilder;
	
	public GameButtonPanel(ModelFacade modelFacade) {
		super();
		this.modelFacade = modelFacade;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		actionBuilder = new ActionButtonBuilder(this);
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
