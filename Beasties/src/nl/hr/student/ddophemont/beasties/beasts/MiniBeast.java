package nl.hr.student.ddophemont.beasties.beasts;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.beasts.targets.*;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class MiniBeast extends Beast {

	public MiniBeast( Vector2 position, Vector2 velocity ) {
		super( position, velocity, DrawArea.MiniBeast() );

		this.setOrigin( 18, 24 );
		
		this.addTargetLocation( new Vector2( 15, 20 ) );
	}

}
