package model.entitiesModel;

public class Quest {
	private String description;
	private boolean isDone = false;
	private boolean answeredRight = false;
	
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
	}
	
	public boolean getAnsweredRight() {
		return answeredRight;
	}
	
	public void setAnsweredRight() {
		answeredRight = true;
	}

}
