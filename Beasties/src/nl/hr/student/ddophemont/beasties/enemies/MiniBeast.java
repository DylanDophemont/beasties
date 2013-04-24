package nl.hr.student.ddophemont.beasties.enemies;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.enemies.targets.*;

import com.badlogic.gdx.math.Vector2;

public class MiniBeast extends Beast {

	
	public MiniBeast( Vector2 position, Vector2 velocity ) {
		super( position, velocity, DrawArea.MiniBeast() );
		
//		TODO: For each beast define the possible positions for targets		
//		new Vector2( 15, 20 );
		
		this.addTarget( new TriangleRightTarget( this ) );
	}

}
