package controller.Command;

import controller.Facade;
import controller.GameOutput;
import model.modelUtilities.ModelFacade;
import model.roomModel.Location;

public class LootCommand implements CommandInterface {
	private ModelFacade modelFacade;
	private Location currentLoc;
	
	public LootCommand() {
		this.modelFacade = Facade.getModel();
		currentLoc = modelFacade.getLocation();
	}
	@Override
	public void execute()  {
		modelFacade.loot(currentLoc.getLoot());
		GameOutput.addGameText(currentLoc.getLoot().lootDesc()+"\n", false);
	}
}
