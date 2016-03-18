package controller.Command;

import controller.Facade;
import model.modelUtilities.ModelFacade;
import model.roomModel.Location;

public class MoveCommand implements CommandInterface {
	private ModelFacade modelFacade;
	private Location currentLoc;

	public MoveCommand() {
		this.modelFacade = Facade.getModel();
		currentLoc = modelFacade.getLocation();
	}

	@Override
	public void execute() {
		
	}

	public void goNorth() {
		modelFacade.moveCharacter(currentLoc.getNorthExit());
	}

	public void goEast() {
		modelFacade.moveCharacter(currentLoc.getEastExit());
	}

	public void goWest() {
		modelFacade.moveCharacter(currentLoc.getWestExit());
		
	}

}
