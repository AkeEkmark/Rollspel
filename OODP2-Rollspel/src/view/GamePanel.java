package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import controller.GameOutput;
import model.modelUtilities.ModelFacade;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = -7735657295401153043L;

	public GamePanel(ModelFacade modelFacade) {
		super();
		this.setLayout(new BorderLayout());
		this.add(new GameOutputPanel(GameOutput.getInstance().getTextList()), BorderLayout.CENTER);
		this.add(new GameButtonPanel(modelFacade), BorderLayout.SOUTH);
		this.add(new CharacterStatsPanel(modelFacade.getCharacter()), BorderLayout.NORTH);
		this.add(new InventoryPanel(modelFacade.getCharacter().getInventory()), BorderLayout.WEST);
		this.setVisible(true);
	}
}
