package controller.states;

import controller.GameOutput;
import controller.Command.FightCommand;
import model.characterModel.Hero;
import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;

public class FightState implements StateInterface {
	Monster monster;
	Hero character;

	
	public FightState(Monster monster, Hero character) {
		this.monster = monster;
		this.character = character;
				
	}

	@Override
	public void interactionLoop() {
		while(true) {
			FightCommand fight = new FightCommand(monster, character);
			try {
				fight.execute();
			} catch (MonsterIsDeadException e) {
				GameOutput.addGameText("The monster is dead", false);
				new DefaultState().interactionLoop();
				break;
			} catch (CharacterIsDeadException e) {
				new DefeatState().interactionLoop();
				break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
