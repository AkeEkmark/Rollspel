package controller.states;

import controller.Command.FightCommand;
import model.characterModel.Character;
import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.Monster;
import model.entitiesModel.MonsterIsDeadException;

public class FightState implements StateInterface {
	Monster monster;
	Character character;

	
	public FightState(Monster monster, Character character) {
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
				System.out.println("The monster is dead");
				break;
			} catch (CharacterIsDeadException e) {
				System.out.println("You life and adventure ends here");
				break;
			}
		}
	}

}
