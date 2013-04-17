package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.Drawable;
import nl.hr.student.ddophemont.beasties.ui.Button;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;


public class MenuScreen extends DefaultScreen {
	
	private ArrayList<Button> _buttons;
	
	public MenuScreen( Game game ) {
		super( game );
		
		_buttons = new ArrayList<Button>();
		
		Button startBtn = new Button( new Vector2( 0, 0 ) );
		startBtn.pos.y = Gdx.graphics.getHeight()/2;
		startBtn.pos.x = Gdx.graphics.getWidth()/2;
		
		addDrawable( startBtn );
		_buttons.add( startBtn );
	}

	public boolean touchDown(int x, int y, int pointer, int button) {
		Gdx.app.log("DEBUG", "You touched me!");
		return super.touchDown(x, y, pointer, button);
	}

	public void update(float delta) {
		for ( Button btn : _buttons ) {
			//btn.rotation += 9;
		}
	}

}
