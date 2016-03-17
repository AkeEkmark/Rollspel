package controller.states;

import controller.GameOutput;
import model.modelUtilities.ModelFacade;
import model.roomModel.Action;
import model.roomModel.Location;

public class DefaultState implements StateInterface {
	private ModelFacade modelFacade;
	private Location location;
	
	public DefaultState(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
		this.location = modelFacade.getLocation();
	}

	@Override
	public void interactionLoop() {
		GameOutput.addGameText(modelFacade.getLocation().getDescription(), false);
		
		if (location.getAvailableActions().contains(Action.Fight)) {
			StateInterface state = new FightState(modelFacade.getMonster(), modelFacade.getCharacter());
			state.interactionLoop();
		}
		
		
	}

}