package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.IDrawable;
import nl.hr.student.ddophemont.beasties.IUpdatable;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

public abstract class DefaultScreen implements Screen, IDrawable, IUpdatable {

	protected Game game;
	
	private ArrayList<IDrawable> _drawables;
	
	public DefaultScreen( Game game ) {
		this.game = game;
		_drawables = new ArrayList<IDrawable>();
	}
	
	@Override
	public void render(float delta) {
		draw( delta );
		update( delta );
	}
	
	public void draw(float delta) {
		Gdx.gl.glClear( GL10.GL_COLOR_BUFFER_BIT );
		Gdx.gl.glClearColor( 0, 0, 0, 1 );
		
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

}
