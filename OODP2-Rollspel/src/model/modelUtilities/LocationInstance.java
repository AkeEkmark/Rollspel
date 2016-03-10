package model.modelUtilities;

import model.roomModel.Location;

public interface LocationInstance {
	public void moveCharacter(Location nextRoom);
	public Location currentLocation();
	
	
}
