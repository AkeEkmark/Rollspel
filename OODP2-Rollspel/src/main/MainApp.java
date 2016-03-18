package main;

import java.util.ArrayList;
import java.util.List;

import controller.Facade;
import controller.GameOutput;
import controller.states.DefaultState;
import controller.states.FightState;
import controller.states.StateInterface;
import model.characterModel.Hero;
import model.characterModel.Warrior;
import model.entitiesModel.DarkDemonLord;
import model.entitiesModel.Kobold;
import model.entitiesModel.Monster;
import model.modelUtilities.DungeonInstance;
import model.modelUtilities.DungeonModelFacade;
import model.modelUtilities.ModelFacade;
import model.roomModel.DungeonLocation;
import model.roomModel.Location;
import model.roomModel.MonsterLocation;
import view.Gui;

public class MainApp {

	public static void main(String[] args) {
		Hero character = new Warrior("Uffe");
		Monster kobold = new Kobold("A nasty Kobold with a candle on his head");
		Location firstRoom = new DungeonLocation("A dark and smelly room with an aura of death and you see an exit to the north");
		firstRoom = new MonsterLocation(firstRoom, kobold);
		List<Location> dungeonMap = new ArrayList<Location>();
		dungeonMap.add(firstRoom);
		Location secondRoom = new DungeonLocation("A room filled with treasure");
		firstRoom.setNorthExit(secondRoom);
		dungeonMap.add(secondRoom);
		Location thirdRoom = new DungeonLocation("Endboss room");
		thirdRoom = new MonsterLocation(thirdRoom, new DarkDemonLord("The end boss"));
		secondRoom.setEastExit(thirdRoom);
		dungeonMap.add(thirdRoom);
		Location fourthRoom = new DungeonLocation("A black hole");
		secondRoom.setWestExit(fourthRoom);
		dungeonMap.add(fourthRoom);
		DungeonInstance di = new DungeonInstance(dungeonMap, character);
		ModelFacade modelFacade = new DungeonModelFacade(di);
		Facade facade = new Facade(modelFacade);
		Gui gui = new Gui(modelFacade);
		StateInterface state = new DefaultState(modelFacade);
		state.setDefaultState(state);
		state.interactionLoop();
	}

}
