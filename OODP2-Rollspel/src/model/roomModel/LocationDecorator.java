package model.roomModel;

public abstract class LocationDecorator extends Location {

	private Location location;
	public LocationDecorator(Location location){
		this.location = location;
		
	}
}
