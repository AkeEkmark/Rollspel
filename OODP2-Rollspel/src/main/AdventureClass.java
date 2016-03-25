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
import model.entitiesModel.DarkDemon;
import model.entitiesModel.DeathTrap;
import model.entitiesModel.DarkDemon;
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

public class AdventureClass {

	private List<Location> dungeonMap = new ArrayList<Location>();

	public AdventureClass() {

		
		DungeonLocationBuilder dlb = new DungeonLocationBuilder();

		Location firstRoom = dlb.buildLocation("start add description", null, null, null);

		dungeonMap.add(firstRoom);

		Location secondRoom = dlb.buildLocation(
				" A long narrow tunnel that descends towards the light of a room further ahead. /n You see a large chest in an alcove along the west wall and a room further to the north",
				new Skeleton("In the distant you hear footsteps echoing and a rattling sound. A skeleton prison guard becomes visible and he has spotted you. He draws his sword and screams in rage as he runs towards you in a furious attack. Prepare to fight!"), new Zweihander(), null);
		firstRoom.setNorthExit(secondRoom);
		dungeonMap.add(secondRoom);

		Location thirdRoom = dlb.buildLocation("add description trap room", null, null, new SpikeTrap());
		secondRoom.setNorthExit(thirdRoom);
		dungeonMap.add(thirdRoom);

		Location fourthRoom = dlb.buildLocation("You enter a hallway and a chandelier shines its dim light upon you. /n  There are two doors leading out from where you are, one to the east and another to the west. After a closer examination you find that each of the doors have inscriptions carved on them. /n The inscription on the east door reads as follows: /n What begins and has no end? And another inscription is carved on the west door: /n What is always coming but never arrives? /n You reckon that theese are riddles of some kind, which door do you choose?", null, null, null);
		// riddle sixtSense roll!? answer is decay and tomorrow
		thirdRoom.setNorthExit(fourthRoom);
		dungeonMap.add(fourthRoom);

		Location fifthRoom = dlb.buildLocation("As you enter through the gate and walk into a vast dark corridor, you are strucked by a nagging feeling that something is wrong.. Somehow you can sense the strong prescence of an evil omnipotent being who have set a trap by which its to late to escape from. You are surrounded by silence and darkness. Time and space is warped around you and as a result you are forever doomed to wander this corridor endlessly without purpose or meaning.", null, null, new DeathTrap());
		dungeonMap.add(fifthRoom);
		
		//room 6 was supposed to be wizard room, add if time permits..
		Location sixthRoom = dlb.buildLocation("A large oval chamber with an ornamented altar with mystical engravings in its centre. /n To the north you see a spiral staircase descending.", new DarkDemon("A man dressed in a black robe kneels in front of the altar with his back turned against you. /n An aura of evil surrounds the man and it grows stronger by the second. /n When the man becomes aware of your prescence he suddenly and swiftly turns towards you, At first glanze, he appears to be human but it sends a chill down your spine as his face is revealed and you look into his lifeless eyes. /n Its a dark demon and he spits in rage as he unsheatens a large black broadsword with strangely carved engravings. -filthy human, you will never leave this place alive, he hisses as he attacks you. /n Prepare to fight the Dark Demon Templar"), null, null);
		dungeonMap.add(sixthRoom);
		
		fourthRoom.setEastExit(fifthRoom);
		fourthRoom.setWestExit(sixthRoom);
		Location seventhRoom = dlb.buildLocation("The staircase descends underground and into a tunnel, you see a distant light far ahead. /n You run through the narrow passage which eventually leads you out in the open forest. /n Your heart is pounding and you are all sweaty. /n You hear a distant gong echoes from the castle in the background and your only hope is that there are no followers and that you will achieve your freedom at last.. /n To be continued...", null, null, null);
		dungeonMap.add(seventhRoom);
		sixthRoom.setNorthExit(seventhRoom);
		
		

	}

	public List<Location> getDungeonMap() {
		return dungeonMap;
	}
}
