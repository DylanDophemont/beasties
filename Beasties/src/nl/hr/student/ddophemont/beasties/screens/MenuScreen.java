package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.SatelliteDish;
import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.enemies.Beasties;
import nl.hr.student.ddophemont.beasties.ui.Background;
import nl.hr.student.ddophemont.beasties.ui.BlackOverlay;
import nl.hr.student.ddophemont.beasties.ui.Button;
import nl.hr.student.ddophemont.beasties.ui.StartButton;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;


public class MenuScreen extends DefaultScreen {
	
	private ArrayList<Button> _buttons;
	
	public MenuScreen( Game game ) {
		super( game );
		
		_buttons = new ArrayList<Button>();
		
		Button startBtn = new StartButton( new Vector2( Beasties.WIDTH/2 - DrawArea.StartBtn().getWidth()/2f, Beasties.HEIGHT/2 - DrawArea.StartBtn().getHeight()/2f ) );
		_buttons.add( startBtn );
		
		this.addGameObject( new Background( new Vector2( Beasties.WIDTH/2f, Beasties.HEIGHT/2f ) ) );
		this.addGameObject( new  SatelliteDish( new Vector2( 40, 3 ) ) );
		this.addGameObject( new BlackOverlay( new Vector2( Beasties.WIDTH/2f, Beasties.HEIGHT/2f ), .7f ) );
		
		this.addGameObject( new ArrayList<GameObject>( _buttons ) );
	}

	public boolean touchDown( int x, int y, int pointer, int button ) {
		Beasties.camera.unproject( this.touchPoint.set( x, y, 0 ) );

		for ( Button btn : _buttons ) {
			if ( btn.isPressed( touchPoint.x, touchPoint.y ) ) {
				game.setScreen( new GameScreen( game ) );
			}
		}
		
		return super.touchDown( x, y, pointer, button );
	}

	public void update( float delta ) {
		for ( Button btn : _buttons ) {
			//btn.rotation += 9;
		}
	}

}
