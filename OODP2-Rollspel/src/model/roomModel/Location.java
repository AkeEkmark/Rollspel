package model.roomModel;

import java.util.List;

public abstract class Location {
	protected String description;
	protected Location northExit;
	protected Location eastExit;
	protected Location southExit;
	protected Location westExit;
	protected List<Action> availableActions;
}
