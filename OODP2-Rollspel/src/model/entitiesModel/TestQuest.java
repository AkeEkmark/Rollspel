package model.entitiesModel;

public class TestQuest extends Quest {

	public TestQuest(String description) {
		super(description);
		super.rightAnswer = "1";
		super.answeredRightDesc = "right";
		super.answeredWrongDesc = "wrong";
	}

}
