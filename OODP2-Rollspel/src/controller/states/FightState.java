package controller.states;

import controller.GameOutput;
import controller.Command.FightCommand;
import model.characterModel.Hero;
import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;
import model.modelUtilities.ModelFacade;

public class FightState implements StateInterface, Runnable{
	private Monster monster;
	private Hero character;
	private ModelFacade modelFacade;
	private StateInterface defaultState;

	public FightState(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
		this.monster = modelFacade.getMonster();
		this.character = modelFacade.getCharacter();
	}

	@Override
	public void interactionLoop() {
		
	}

	@Override
	public void changeState(StateInterface state) {
		state.interactionLoop();
	}
	@Override
	public void setDefaultState(StateInterface state) {
		this.defaultState = state;
	}

	@Override
	public void run() {
		System.out.println("fightstate "+this);
		
		GameOutput.addGameText("\n"+monster.getDescription(), false);
		while(true) {
			FightCommand fight = new FightCommand(monster, character);
			try {
				fight.execute();
			} catch (MonsterIsDeadException e) {
				GameOutput.addGameText("The "+monster.getName()+" is dead", false);
				changeState(defaultState);
				break;
			} catch (CharacterIsDeadException e) {
				changeState(new DefeatState());
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
