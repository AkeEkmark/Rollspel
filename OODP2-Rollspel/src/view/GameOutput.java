package view;

public class GameOutput {
	private static GameOutput gameOutPut = null;
	
	private GameOutput() {
		gameOutPut = this;
	}
	
	public static GameOutput getInstance() {
		if (gameOutPut == null) {
			new GameOutput();
		}
		return gameOutPut;
		
	}
}
