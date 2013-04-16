package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.Drawable;

import ui.Button;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;


public class MenuScreen extends DefaultScreen {
	
	private ArrayList<Button> _buttons;
	
	public MenuScreen( Game game ) {
		super( game );
		
		_buttons = new ArrayList<Button>();
		
		Button startBtn = new Button( new Vector2( 30, Gdx.graphics.getHeight() - 30  ) );
		addDrawable( startBtn );
		_buttons.add( startBtn );
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

	public void update(float delta) {
		for ( Button btn : _buttons ) {
			//btn.rotation += 9;
		}
	}

}
