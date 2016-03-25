package view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.GameTextList;
import model.modelUtilities.GameText;

public class GameOutputPanel extends JPanel implements Observer, Runnable {

	private static final long serialVersionUID = -5929746236259538785L;
	private GameTextList<GameText> gameTextList;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	public GameOutputPanel(GameTextList<GameText> gameTextList) {
		super();
		this.setBackground(Color.white);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.gameTextList = gameTextList;
		run();
		

	}

	@Override
	public void update(Observable o, Object arg) {
		GameText gameText = gameTextList.get(gameTextList.size()-1);
		String s = gameText.getS();
		textArea.append(s+"\n");
		textArea.setCaretPosition(textArea.getDocument().getLength());

	}

	@Override
	public void run() {
		textArea = new JTextArea(20, 100);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(800, 600));
		gameTextList.addObserver(this);
		this.add(scrollPane);
		this.setVisible(true);
	}

}
