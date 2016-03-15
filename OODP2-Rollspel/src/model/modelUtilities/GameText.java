package model.modelUtilities;

public class GameText {
	private String s;
	private boolean animated;

	public GameText(String s, boolean animated) {
		this.s = s;
		this.animated = animated;
	}

	public String getS() {
		return s;
	}

	public boolean isAnimated() {
		return animated;
	}

}
