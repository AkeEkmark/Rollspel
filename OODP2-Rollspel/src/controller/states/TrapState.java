package controller.states;

import controller.Command.TrapCommand;
import model.characterModel.CharacterIsDeadException;
import model.characterModel.Hero;
import model.entitiesModel.MonsterIsDeadException;
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
		if(!trap.hasTriggered()){
			TrapCommand t = new TrapCommand(character, trap);
			try {
				try {
					t.execute();
				} catch (MonsterIsDeadException e) {
					e.printStackTrace();
				}
	
			} catch (CharacterIsDeadException e) {
				changeState(new DefeatState());
			}
			
		} else{
			changeState(defaultState);
		}

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
