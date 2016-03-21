package controller;

import model.entitiesModel.HealingPotion;
import model.modelUtilities.ModelFacade;

public class Facade {
	public static ModelFacade modelFacade;
	
	public Facade(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
	}
	public static ModelFacade getModel() {
		return modelFacade;
	}
	public void DrinkHealingPotion(HealingPotion potion){
		modelFacade.addHitpointsToCharacter(potion.drinkPotion());
	}
}
