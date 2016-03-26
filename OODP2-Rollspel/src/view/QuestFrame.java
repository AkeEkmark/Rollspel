package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.entitiesModel.Quest;

public class QuestFrame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -4601307154001802491L;
	private Quest quest;
	private JPanel questionPanel;
	private JLabel questionLabel;
	private JTextField questionAnswerField;

	public QuestFrame(Quest quest) {
		super();
		this.quest = quest;
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		addPanel(quest);
		this.setVisible(true);
	}

	private void addPanel(Quest quest) {
		questionPanel = new JPanel();
		questionLabel = new JLabel("<html><p>"+quest.getDescription()+"</p></html>");
		questionPanel.add(questionLabel);
		questionAnswerField = new JTextField(10);
		questionPanel.add(questionAnswerField);
		questionPanel.setVisible(true);
		add(questionPanel);
		questionAnswerField.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		quest.setPlayerAnswer(questionAnswerField.getText());
		quest.setDone();
		this.dispose();
	}

}
