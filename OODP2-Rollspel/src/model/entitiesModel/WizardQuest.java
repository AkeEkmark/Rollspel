package model.entitiesModel;

public class WizardQuest extends Quest {

	public WizardQuest(String description) {
		super(description);
		super.rightAnswer = "7";
		super.answeredRightDesc = "The wizard grunts. I guess you got lucky this time, move on lucky traveller. "
				+ "He points you towards an exit door to the north";
		super.answeredWrongDesc = "As you tell the wizard your answer and awaits his reaction you feel the "
				+ "ground underneath you starts to bend. Your body feels numb and a dark malodorous swamp "
				+ "emerges under you as you start to sink slowly into the mud beneath you. "
				+ "You try to amass all your strength in a last effort to withstand the force that are pulling you down, "
				+ "in agony you scream for help but your pleas go unanswered and the last thing you hear as you "
				+ "sink deeper and deeper in the dark swamp is the wizards mad laughter. You are weighted down by the mud that now fills your lungs";
	}

}
