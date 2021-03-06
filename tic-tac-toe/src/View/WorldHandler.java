package View;

import com.badlogic.gdx.Gdx;
import com.me.mygdxgame.MainClass;

public class WorldHandler {
	MainClass game;

	public int[] positionItem = new int[9];
	public int winner = 0;

	public WorldHandler(MainClass game) {
		// TODO Auto-generated constructor stub
		this.game = game;
		Gdx.input.setInputProcessor(new InputProcessor(this));

		for (int i = 0; i < positionItem.length; i++) {
			positionItem[i] = 99;
		}

	}

	public void update(float dt) {
		// TODO Auto-generated method stub
		checkForWinner();
	}

	private boolean checkForWinner() {
		// TODO Auto-generated method stub
		if (positionItem[0] == 0 && positionItem[1] == 1
				&& positionItem[2] == 2) {
			winner = 1;
			return true;
		}
		if (positionItem[3] == 3 && positionItem[4] == 4
				&& positionItem[5] == 5) {
			winner = 1;
			return true;
		}
		if (positionItem[6] == 6 && positionItem[7] == 7
				&& positionItem[8] == 8) {
			winner = 1;
			return true;
		}
		if (positionItem[4] == 4) {
			if (positionItem[0] == 0 && positionItem[8] == 8) {
				winner = 1;
				return true;
			}
		}
		if (positionItem[4] == 4) {
			if (positionItem[2] == 2 && positionItem[6] == 6) {
				winner = 1;
				return true;
			}
		} else if (positionItem[0] == 0 && positionItem[3] == 3
				&& positionItem[6] == 6) {
			winner = 1;
			return true;
		}
		if (positionItem[1] == 1 && positionItem[4] == 4
				&& positionItem[7] == 7) {
			winner = 1;
			return true;
		}
		if (positionItem[2] == 2 && positionItem[5] == 5
				&& positionItem[8] == 8) {
			winner = 1;
			return true;
		}

		// O checking
		if (positionItem[0] == 9 && positionItem[1] == 10
				&& positionItem[2] == 11) {
			winner = 2;
			return true;
		}
		if (positionItem[3] == 12 && positionItem[4] == 13
				&& positionItem[5] == 14) {
			winner = 2;
			return true;
		}
		if (positionItem[6] == 15 && positionItem[7] == 16
				&& positionItem[8] == 17) {
			winner = 2;
			return true;
		}
		if (positionItem[4] == 13) {
			if (positionItem[0] == 9 && positionItem[8] == 17) {
				winner = 2;
				return true;

			}
		}
		if (positionItem[4] == 13) {
			if (positionItem[2] == 11 && positionItem[6] == 15) {
				winner = 2;
				return true;

			}
		}
		if (positionItem[0] == 9 && positionItem[3] == 12
				&& positionItem[6] == 15) {
			winner = 2;
			return true;
		}
		if (positionItem[1] == 10 && positionItem[4] == 13
				&& positionItem[7] == 16) {
			winner = 2;
			return true;
		}
		if (positionItem[2] == 11 && positionItem[5] == 14
				&& positionItem[8] == 17) {
			winner = 2;
			return true;
		}

		winner = 0;
		return false;
	}

	public int[] getPositionItem() {
		return positionItem;
	}

	public void setPositionItem(int[] positionItem) {
		this.positionItem = positionItem;
	}

}
