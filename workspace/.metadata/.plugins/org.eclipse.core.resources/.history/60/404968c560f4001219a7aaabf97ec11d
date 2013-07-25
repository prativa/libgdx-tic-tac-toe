package View;

import Sceene.GameScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.me.mygdxgame.MainClass;

public class WorldHandler {
	MainClass game;
	
	public int PostionArrayX;
	public int PostionArrayY;
	TextButton button;

	
	public WorldHandler(MainClass game) {
		// TODO Auto-generated constructor stub
	this.game = game;
	

	}


	public void update(float dt) {
		// TODO Auto-generated method stub
		PostionArrayX=9;
		PostionArrayY=9;
		
		
	}
	public void buttons(){
		TextButtonStyle style = new TextButtonStyle();
	
		
		button = new TextButton("Play!", style);
		button.setWidth(400);
		button.setHeight(100);
		button.setX(Gdx.graphics.getWidth() / 2 - button.getWidth() / 2);
		button.setY(Gdx.graphics.getHeight() / 2 - button.getHeight() / 2);

		button.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				return true;
			}

			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				game.setScreen(new GameScreen(game));
			}
		});
	}

}
