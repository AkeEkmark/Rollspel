package model.roomModel;

import model.entitiesModel.Trap;

public class TrapLocation extends LocationDecorator {
	private Trap trap;

	public TrapLocation(Location location, Trap trap) {
		super(location);
		this.trap = trap;
	}

	public Trap getTrap() {
		return trap;
	}

}