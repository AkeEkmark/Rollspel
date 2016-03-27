package main;

import controller.Facade;
import controller.GameOutput;
import model.modelUtilities.DungeonInstance;
import model.modelUtilities.DungeonModelFacade;
import model.modelUtilities.ModelFacade;
import view.mainGui.Gui;
import view.startGui.StartFrame;

public class MainApp {

	public static void main(String[] args) {
		AdventureClass adventure = new AdventureClass();
		GameOutput gameOutput = GameOutput.getInstance();
		Thread outPutThread = new Thread(gameOutput);
		outPutThread.setPriority(10);
		outPutThread.start();
		DungeonInstance di = new DungeonInstance(adventure.getDungeonMap());
		ModelFacade modelFacade = new DungeonModelFacade(di);
		Facade facade = new Facade(modelFacade);
		Gui gui = new Gui(modelFacade, facade);
		StartFrame start = new StartFrame(facade, gui);
		start.start();
	}

}
