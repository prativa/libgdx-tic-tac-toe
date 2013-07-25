package Sceene;

import View.WorldHandler;
import View.WorldRender;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.me.mygdxgame.MainClass;

public class GameScreen  implements Screen {

	MainClass game;
	WorldHandler world;
	WorldRender render;
	 float dt = Gdx.graphics.getRawDeltaTime();
	
	public GameScreen(MainClass game) {
		// TODO Auto-generated constructor stub
		this.game = game;
		world = new WorldHandler(game);
		render = new WorldRender(world);
	}
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		world.update(dt);
		render.render();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		world.update(dt);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	public MainClass getGame() {
		return game;
	}
	public void setGame(MainClass game) {
		this.game = game;
	}
	public WorldHandler getWorld() {
		return world;
	}
	public void setWorld(WorldHandler world) {
		this.world = world;
	}
	public WorldRender getRender() {
		return render;
	}
	public void setRender(WorldRender render) {
		this.render = render;
	}
	public float getDt() {
		return dt;
	}
	public void setDt(float dt) {
		this.dt = dt;
	}

}

