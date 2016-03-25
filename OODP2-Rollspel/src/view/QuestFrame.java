package view;

import javax.swing.JFrame;

import model.entitiesModel.Quest;

public class QuestFrame extends JFrame {
	
	private static final long serialVersionUID = -4601307154001802491L;
	private Quest quest;

	public QuestFrame(Quest quest) {
		super();
		this.quest = quest;
	}

	public int getAnswer() {
		return 0;
	}

}
