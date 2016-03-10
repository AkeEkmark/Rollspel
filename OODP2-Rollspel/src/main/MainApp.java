package main;

import java.util.ArrayList;
import java.util.List;

import controller.states.DefaultState;
import controller.states.FightState;
import controller.states.StateInterface;
import model.characterModel.Character;
import model.characterModel.Warrior;
import model.entitiesModel.Kobold;
import model.entitiesModel.Monster;
import model.modelUtilities.DungeonInstance;
import model.roomModel.DungeonLocation;
import model.roomModel.Location;
import model.roomModel.MonsterLocation;
import view.Gui;

public class MainApp {

	public static void main(String[] args) {
		Character character = new Warrior("Uffe");
		Monster kobold = new Kobold("A nasty Kobold with a candle on his head");
		Location firstRoom = new DungeonLocation();
		firstRoom = new MonsterLocation(firstRoom, kobold);
		List<Location> dungeonMap = new ArrayList<Location>();
		dungeonMap.add(firstRoom);
		DungeonInstance di = new DungeonInstance(dungeonMap, character);
		StateInterface state = new DefaultState();
		System.out.println("You wake up in a dark room");
		System.out.println("Suddenly you are attacked!");
		state = new FightState(kobold, character);
		state.interactionLoop();
	}

}
