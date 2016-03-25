package controller.Command;

import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Quest;
import view.QuestFrame;

public class QuestCommand implements CommandInterface {
	private Quest quest;

	public QuestCommand(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void execute() throws MonsterIsDeadException, CharacterIsDeadException {
		QuestFrame questFrame = new QuestFrame(quest);
		int answer = questFrame.getAnswer();
	}

}
