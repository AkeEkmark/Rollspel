package view.mainGui;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.characterModel.Inventory;

public class InventoryPanel extends JPanel implements Observer {

	private Inventory inventory;
	private JLabel weapon;
	private JLabel weaponBonus;
	private JLabel armour;
	private JLabel armourBonus;
	private JLabel heading;
	private static final long serialVersionUID = 9197983443064064295L;
	
	public InventoryPanel(Inventory inventory) {
		super();
		this.inventory = inventory;
		this.setVisible(true);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setPreferredSize(new Dimension(200, 800));
		inventory.addObserver(this);
		heading = new JLabel("<html><h1>Inventory</h1></html>");
		weapon = new JLabel("Weapon : "+inventory.getWeapon().getName());
		weaponBonus = new JLabel("Attackbonus : "+inventory.getWeapon().getModifier());
		armour = new JLabel("Armour : "+inventory.getArmour().getName());
		armourBonus = new JLabel("Armour absorbs : "+inventory.getArmour().getModifier()+" damage");
		add(heading);
		add(weapon);
		add(weaponBonus);
		add(armour);
		add(armourBonus);
	}

	@Override
	public void update(Observable o, Object arg) {
		weapon.setText("Weapon : "+inventory.getWeapon().getName());
		weaponBonus.setText("Attackbonus : "+inventory.getWeapon().getModifier());
		armour.setText("Armour : "+inventory.getArmour().getName());
		armourBonus.setText("Armour absorbs : "+inventory.getArmour().getModifier()+" damage");	
	}
}
