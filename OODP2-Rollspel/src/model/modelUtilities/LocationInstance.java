package model.modelUtilities;

import model.roomModel.Location;
import model.characterModel.Hero;
public interface LocationInstance {
	public void moveCharacter(Location nextRoom);
	public Location getCurrentLocation();
	public void setCharacter(Hero character);
	public Hero getCharacter();

	
}
