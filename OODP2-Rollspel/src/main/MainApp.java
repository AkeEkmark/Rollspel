package main;

import java.util.ArrayList;
import java.util.List;

import controller.DungeonLocationBuilder;
import controller.Facade;
import controller.GameOutput;
import controller.states.DefaultState;
import controller.states.FightState;
import controller.states.StateInterface;
import model.characterModel.Hero;
import model.characterModel.Warrior;
import model.entitiesModel.Dagger;
import model.entitiesModel.DarkDemonLord;
import model.entitiesModel.HealingPotion;
import model.entitiesModel.Skeleton;
import model.entitiesModel.LeatherHarness;
import model.entitiesModel.Monster;
import model.entitiesModel.SpikeTrap;
import model.entitiesModel.Zweihander;
import model.modelUtilities.DungeonInstance;
import model.modelUtilities.DungeonModelFacade;
import model.modelUtilities.ModelFacade;
import model.roomModel.DungeonLocation;
import model.roomModel.Location;
import model.roomModel.MonsterLocation;
import view.Gui;

public class MainApp {

	public static void main(String[] args) {
		DungeonLocationBuilder dlb = new DungeonLocationBuilder();
		Hero character = new Warrior("Uffe");
		character.getInventory().setWeapon(new Dagger());
		character.getInventory().setArmour(new LeatherHarness());
		character.getInventory().addPotion(new HealingPotion(5));
		Monster skeleton = new Skeleton("A nasty Kobold with a candle on his head");
		Location firstRoom = dlb.buildLocation("A dark and smelly room with an aura of death and you see an exit to the north", skeleton, new Zweihander(), new SpikeTrap());
		System.out.println(firstRoom);
		System.out.println(firstRoom.getAvailableActions());
		List<Location> dungeonMap = new ArrayList<Location>();
		dungeonMap.add(firstRoom);
		Location secondRoom = dlb.buildLocation("A room filled with treasure", null, null, null);
		firstRoom.setNorthExit(secondRoom);
		dungeonMap.add(secondRoom);
		Location thirdRoom = dlb.buildLocation("Endboss room", new DarkDemonLord("The end boss"), null, null);
		secondRoom.setEastExit(thirdRoom);
		dungeonMap.add(thirdRoom);
		Location fourthRoom = dlb.buildLocation("A black hole", null, null, null);
		secondRoom.setWestExit(fourthRoom);
		dungeonMap.add(fourthRoom);
		DungeonInstance di = new DungeonInstance(dungeonMap);
		di.setCharacter(character);
		ModelFacade modelFacade = new DungeonModelFacade(di);
		Facade facade = new Facade(modelFacade);
		Gui gui = new Gui(modelFacade, facade);
		StateInterface state = new DefaultState(modelFacade);
		state.setDefaultState(state);
		state.interactionLoop();
	}

}
