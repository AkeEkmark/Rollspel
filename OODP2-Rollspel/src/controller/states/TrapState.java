package controller.states;

import model.characterModel.Hero;
import model.entitiesModel.Trap;
import model.modelUtilities.ModelFacade;

public class TrapState implements StateInterface {
	ModelFacade modelFacade;
	private StateInterface defaultState;
	Trap trap;
	Hero character;
	
	public TrapState(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
		this.trap = modelFacade.getTrap();
		this.character = modelFacade.getCharacter();
	}

	@Override
	public void interactionLoop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeState(StateInterface state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDefaultState(StateInterface state) {
		// TODO Auto-generated method stub

	}

}
