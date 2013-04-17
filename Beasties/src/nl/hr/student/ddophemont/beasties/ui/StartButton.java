package nl.hr.student.ddophemont.beasties.ui;

import nl.hr.student.ddophemont.beasties.DrawArea;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class StartButton extends Button {

	public StartButton( Vector2 position ) {
		super(position, DrawArea.StartBtn() );
	}

	@Override
	public void isPressed( float x, float y ) {
		if ( currentRectangle().contains( x, y ) ) {
			//Beasties.setScreen( Beasties.GameScreen );
			Gdx.app.log("DEBUG", "isPressed!");
		}
	}

}
