package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = -7735657295401153043L;

	public GamePanel(String name) {
		super();
		this.setVisible(true);
		this.setName(name);
		this.setBackground(Color.gray);
		this.add(new JButton("GoNorth"));
		this.add(new GameOutputPanel(GameOutput.getInstance()));
	}

}
