package controller.states;

import controller.Command.TrapCommand;
import model.characterModel.CharacterIsDeadException;
import model.characterModel.Hero;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Trap;
import model.modelUtilities.ModelFacade;

public class TrapState implements StateInterface {
	private ModelFacade modelFacade;
	private StateInterface defaultState;
	private Trap trap;
	private Hero character;
	
	public TrapState(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
		this.trap = modelFacade.getTrap();
		this.character = modelFacade.getCharacter();
	}

	@Override
	public void interactionLoop() {
		System.out.println("TrapState "+this);
		if(!trap.hasTriggered()){
			TrapCommand t = new TrapCommand(character, trap);
			try {
				t.execute();
			} catch (MonsterIsDeadException e) {
				e.printStackTrace();
				return;
			} catch (CharacterIsDeadException e) {
				changeState(new DefeatState());
				return;
			}
		} 
		changeState(defaultState);
	}

	@Override
	public void changeState(StateInterface state) {
		state.interactionLoop();
	}

	@Override
	public void setDefaultState(StateInterface state) {
		this.defaultState = state;
	}
}
