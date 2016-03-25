package controller;

import model.modelUtilities.GameText;

public class GameOutput implements Runnable {
	private static GameOutput gameOutPut = null;
	private static GameTextList<GameText> gameText;
	
	private GameOutput() {
		gameOutPut = this;
		gameText =  new GameTextList<GameText>();
	}
	
	public static GameOutput getInstance() {
		if (gameOutPut == null) {
			new GameOutput();
		}
		return gameOutPut;
		
	}
	public static void addGameText(String s, boolean animated){
		getInstance().getTextList().add(new GameText(s, animated));
		
	}
	
	public GameTextList<GameText> getTextList() {
		return gameText;
		
	}

	@Override
	public void run() {
		new GameOutput();
		
	}
}
