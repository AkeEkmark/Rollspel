package view;


import java.util.Observable;
import java.util.Observer;
import model.characterModel.Hero;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CharacterStatsPanel extends JPanel implements Observer{

	private static final long serialVersionUID = -6114308614123193068L;
	
	private Hero character;
	private JLabel name;
	private JLabel characterClass;
	private JLabel hitpoints;
	private JLabel strength;
	private JLabel intelligence;
	private JLabel agility;
	
	public CharacterStatsPanel(Hero character) {
		super();
		this.setVisible(true);
		this.character = character;
		character.addObserver(this);
		name = new JLabel("Name : "+character.getName());
		characterClass = new JLabel("Class : "+character.getCharacterClass());
		hitpoints = new JLabel("Hitpoints : "+character.getHitpoints());
		strength = new JLabel("Strength : "+character.getStrength());
		agility = new JLabel("Agility : "+character.getAgility());
		intelligence = new JLabel("Intelligence : "+character.getIntelligence());
		add(name);
		add(characterClass);
		add(hitpoints);
		add(strength);
		add(agility);
		add(intelligence);
	}

	@Override
	public void update(Observable o, Object arg) {
		hitpoints.setText("Hitpoints : "+character.getHitpoints());
		strength.setText("Strength : "+character.getStrength());
		agility.setText("Agility : "+character.getAgility());
		intelligence.setText("Intelligence : "+character.getIntelligence());
	}

}
