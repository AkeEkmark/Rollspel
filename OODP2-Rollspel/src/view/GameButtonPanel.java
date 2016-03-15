package view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GameButtonPanel extends JPanel {
	
	public GameButtonPanel() {
		super();
		this.setVisible(true);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(new JButton("Go North"));
		this.add(new JButton("Loot"));
		this.add(new JButton("Go North adasd asda asdasd asd asd asd a sdasd "));
	}
	

}
