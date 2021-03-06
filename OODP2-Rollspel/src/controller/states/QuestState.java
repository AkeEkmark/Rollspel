package controller.states;

import controller.Command.QuestCommand;
import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.MonsterIsDeadException;
import model.entitiesModel.Quest;
import model.modelUtilities.ModelFacade;

public class QuestState implements StateInterface {
	private Quest quest;
	private ModelFacade modelFacade;
	private StateInterface defaultState;

	public QuestState(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
		this.quest = modelFacade.getQuest();
	}

	@Override
	public void interactionLoop() {
		System.out.println("QuestState :"+this);
		QuestCommand questCommand = new QuestCommand(quest, defaultState);
		try {
			questCommand.execute();
		} catch (MonsterIsDeadException e) {
	
		} catch (CharacterIsDeadException e) {
			
		}

	}

	@Override
	public void changeState(StateInterface state) {
		state.interactionLoop();
	}

	@Override
	public void setDefaultState(StateInterface state) {
		defaultState = state;
	}

}
