package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.ui.Button;
import nl.hr.student.ddophemont.beasties.ui.StartButton;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;


public class MenuScreen extends DefaultScreen {
	
	private ArrayList<Button> _buttons;
	
	public MenuScreen() {
		_buttons = new ArrayList<Button>();
		
		Button startBtn = new StartButton( new Vector2( Beasties.WIDTH/2 - DrawArea.StartBtn().getWidth()/2f, Beasties.HEIGHT/2 - DrawArea.StartBtn().getHeight()/2f ) );
		_buttons.add( startBtn );
		
		this.addGameObject( startBtn );
	}

	public boolean touchDown( int x, int y, int pointer, int button ) {
		Vector3 touchPos = new Vector3();
		touchPos.set( x, y, 0);
		Beasties.camera.unproject(touchPos);

		for ( Button btn : _buttons ) {
			btn.isPressed( touchPos.x, touchPos.y );
		}
		
		return super.touchDown( x, y, pointer, button );
	}

	public void update( float delta ) {
		for ( Button btn : _buttons ) {
			btn.rotation += 9;
		}
	}

}
