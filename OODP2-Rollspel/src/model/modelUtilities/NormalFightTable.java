package model.modelUtilities;

public class NormalFightTable implements FightTable {

	@Override
	public int hitPointsFromGap(int gap) {
		if (gap > 20) {
			return 500;
		} else if (gap > 16) {
			return 22;
		} else if (gap > 14) {
			return 16;
		} else if (gap > 12) {
			return 12;
		} else if (gap > 10) {
			return 10;
		} else if (gap > 8) {
			return 6;
		} else if (gap > 6) {
			return 5;
		} else if (gap > 4) {
			return 4;
		} else if (gap > 2) {
			return 3;
		} else if (gap > 1) {
			return 2;
		} else if (gap > 0) {
			return 1;
		}
		return 0;
	}

}
