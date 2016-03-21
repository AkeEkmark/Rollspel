package controller.Command;

import model.characterModel.CharacterIsDeadException;
import model.characterModel.Hero;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Trap;
import model.modelUtilities.Die;

public class TrapCommand implements CommandInterface {
	private Die d20 = new Die(20);
	private Hero hero;
	private Trap trap;
	public TrapCommand(Hero character, Trap trap){
		this.trap = trap;
		this.hero = character;
	}
	@Override
	public void execute() throws MonsterIsDeadException, CharacterIsDeadException {
		

	}

}
