package main;

import java.util.ArrayList;
import java.util.List;

import controller.GameOutput;
import controller.states.DefaultState;
import controller.states.FightState;
import controller.states.StateInterface;
import model.characterModel.Hero;
import model.characterModel.Warrior;
import model.entitiesModel.Kobold;
import model.entitiesModel.Monster;
import model.modelUtilities.DungeonInstance;
import model.modelUtilities.DungeonModelFacade;
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
		DungeonInstance di = new DungeonInstance(dungeonMap, character);
		Gui gui = new Gui(new DungeonModelFacade(di));
		StateInterface state = new DefaultState();
		state.interactionLoop();
		GameOutput.addGameText("You wake up in a dark room", false);
		GameOutput.addGameText("Suddenly you are attacked", false);
		state = new FightState(kobold, character);
		state.interactionLoop();
		
		
	}

}
