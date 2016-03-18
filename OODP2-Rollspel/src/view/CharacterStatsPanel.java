package view;


import java.util.Observable;
import java.util.Observer;
import model.characterModel.Hero;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharacterStatsPanel extends JPanel implements Observer{

	private static final long serialVersionUID = -6114308614123193068L;
	
	private Hero character;
	private JLabel hitpoints;
	private JLabel name;
	private JLabel strength;
	private JLabel strengthNbr;
	
	
	public CharacterStatsPanel(Hero character) {
		super();
		this.setVisible(true);
		this.character = character;
		character.addObserver(this);
		name = new JLabel("Name : "+character.getName());
		hitpoints = new JLabel("Hitpoints : "+character.getHitpoints());
		strength = new JLabel("Strength :");
		strengthNbr = new JLabel(""+character.getStrength());
		add(name);
		add(hitpoints);
		add(strength);
		add(strengthNbr);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		name.setText("Name : "+character.getName());
		hitpoints.setText("Hitpoints : "+character.getHitpoints());
		strengthNbr.setText(""+character.getStrength());
		repaint();
		
	}

}
