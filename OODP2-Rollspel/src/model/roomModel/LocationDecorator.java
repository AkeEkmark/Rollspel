package model.roomModel;

public abstract class LocationDecorator extends Location {

	protected Location location;
	public LocationDecorator(Location location){
		super(location.description);
		this.location = location;
		
	}
	public String toString() {
		return location.toString()+"<"+this.getClass().getName()+">";
	}

}
