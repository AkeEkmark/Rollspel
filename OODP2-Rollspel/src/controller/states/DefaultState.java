package controller.states;

import java.util.Observable;
import java.util.Observer;

import controller.GameOutput;
import model.modelUtilities.ModelFacade;
import model.roomModel.Action;
import model.roomModel.Location;

public class DefaultState implements StateInterface, Observer {
	private ModelFacade modelFacade;
	private Location location;
	private StateInterface defaultState;
	
	public DefaultState(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
		this.location = modelFacade.getLocation();
		modelFacade.addObserver(this);
	}

	@Override
	public void interactionLoop() {
		System.out.println("defaultstate "+this);
		GameOutput.addGameText(modelFacade.getLocation().getDescription(), false);		
		if (location.getAvailableActions().contains(Action.Fight)) {
			if (modelFacade.monsterIsAlive()) {
				FightState fight = new FightState(modelFacade);
				fight.setDefaultState(defaultState);
				changeState(fight);		
			}
		}
		if(location.getAvailableActions().contains(Action.Trap)){
			if(!modelFacade.trapHasTriggerd()){
				TrapState trap = new TrapState(modelFacade);
				trap.setDefaultState(defaultState);
				changeState(trap);
			}
		}
	}
	@Override
	public void changeState(StateInterface state) {
		state.interactionLoop();
	}

	@Override
	public void update(Observable o, Object arg) {
		location = modelFacade.getLocation();
		interactionLoop();
	}

	@Override
	public void setDefaultState(StateInterface state) {
		this.defaultState = state;
		
	}

}