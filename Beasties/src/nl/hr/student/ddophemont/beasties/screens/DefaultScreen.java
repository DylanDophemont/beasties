package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.IDrawable;
import nl.hr.student.ddophemont.beasties.IUpdatable;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

public abstract class DefaultScreen implements Screen, InputProcessor, IDrawable, IUpdatable {

	protected Game game;
	
	private ArrayList<IDrawable> _drawables;
	
	public DefaultScreen( Game game ) {
		this.game = game;
		_drawables = new ArrayList<IDrawable>();
		
		Gdx.input.setInputProcessor( this );
	}
	
	@Override
	public void render(float delta) {
		draw( delta );
		update( delta );
	}
	
	public void draw(float delta) {
		Gdx.gl.glClearColor( 0, 0, 0, 1 );
		Gdx.gl.glClear( GL10.GL_COLOR_BUFFER_BIT );
		
		Beasties.spriteBatch.begin();
		for ( IDrawable drawable : _drawables ) {
			drawable.draw( delta );
		}
		Beasties.spriteBatch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

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
	
	public void addDrawable( IDrawable drawable ) {
		_drawables.add( drawable );
	}
	
	public void removeDrawable( IDrawable drawable ) {
		_drawables.remove( drawable );
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int x, int y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int x, int y, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int x, int y, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchMoved(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
