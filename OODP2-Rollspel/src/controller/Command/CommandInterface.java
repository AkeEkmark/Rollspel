package controller.Command;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.MonsterIsDeadException;

public interface CommandInterface {
	public void execute() throws MonsterIsDeadException, CharacterIsDeadException;
}
