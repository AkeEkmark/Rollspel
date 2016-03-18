package controller;

import model.modelUtilities.ModelFacade;

public class Facade {
	public static ModelFacade modelFacade;
	
	public Facade(ModelFacade modelFacade) {
		this.modelFacade = modelFacade;
	}
	public static ModelFacade getModel() {
		return modelFacade;
	}
}
