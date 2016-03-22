package view;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.characterModel.Hero;
import model.characterModel.Inventory;

public class InventoryPanel extends JPanel implements Observer {

	private Inventory inventory;
	private JLabel weapon;
	private JLabel armour;
	private JLabel potions;
	private JLabel heading;
	private static final long serialVersionUID = 9197983443064064295L;
	
	public InventoryPanel(Inventory inventory) {
		super();
		this.inventory = inventory;
		this.setVisible(true);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setPreferredSize(new Dimension(150, 800));
		inventory.addObserver(this);
		heading = new JLabel("<html><h1>Inventory</h1></html>");
		weapon = new JLabel("Weapon : "+inventory.getWeapon().getName());
		armour = new JLabel("Armour : "+inventory.getArmour().getName());
		add(heading);
		add(weapon);
		add(armour);
	}



	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
