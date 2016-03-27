package controller.Command;

import java.util.Observable;
import java.util.Observer;

import controller.GameOutput;
import controller.states.DefeatState;
import controller.states.StateInterface;
import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Quest;
import view.QuestFrame;

public class QuestCommand implements CommandInterface, Observer {
	private Quest quest;
	private StateInterface defaultState;

	public QuestCommand(Quest quest, StateInterface defeaultState) {
		this.quest = quest;
		this.defaultState = defeaultState;
		quest.addObserver(this);
	}

	@Override
	public void execute() throws MonsterIsDeadException, CharacterIsDeadException {
		QuestFrame questFrame = new QuestFrame(quest);
		questFrame.start();
	}

	@Override
	public void update(Observable o, Object arg) {
		if(quest.getPlayerAnswer().equals(quest.getRightAnswer())) {
			GameOutput.addGameText(quest.getAnsweredRightDesc(), false);
			defaultState.interactionLoop();
			
		}
		else {
			GameOutput.addGameText(quest.getAnsweredWrongDesc(), false);
			DefeatState defeat = new DefeatState();
			defeat.interactionLoop();
		}
	}

}
