package model.modelUtilities;

import model.roomModel.Location;
import model.characterModel.Character;
public interface LocationInstance {
	public void moveCharacter(Location nextRoom);
	public Location getCurrentLocation();
	public Character getCharacter();

	
}
