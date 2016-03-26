package model.entitiesModel;

import java.util.Observable;

public class Quest extends Observable{
	protected String description;
	protected boolean isDone = false;
	protected boolean answeredRight = false;
	protected String rightAnswer;
	protected String answeredRightDesc;
	protected String answeredWrongDesc;
	protected String playerAnswer;
	
	public String getPlayerAnswer() {
		return playerAnswer;
	}
	public void setPlayerAnswer(String answer) {
		this.playerAnswer = answer;
	}

	public Quest(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	public boolean isDone() {
		return isDone;
	}
	
	public void setDone() {
		isDone = true;
		setChanged();
		notifyObservers();
	}
	
	public boolean getAnsweredRight() {
		return answeredRight;
	}
	
	public void setAnsweredRight() {
		answeredRight = true;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public String getAnsweredRightDesc() {
		return answeredRightDesc;
	}

	public String getAnsweredWrongDesc() {
		return answeredWrongDesc;
	}

}
