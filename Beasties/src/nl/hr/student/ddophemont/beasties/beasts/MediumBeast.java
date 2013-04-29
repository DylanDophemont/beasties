package nl.hr.student.ddophemont.beasties.beasts;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.beasts.targets.TriangleUpTarget;
import nl.hr.student.ddophemont.beasties.screens.DefaultScreen;

import com.badlogic.gdx.math.Vector2;

public class MediumBeast extends Beast {

	public MediumBeast( Vector2 position, Vector2 velocity, DrawArea drawArea, DefaultScreen gameScreen ) {
		super( position, velocity, DrawArea.mediumBeast(), gameScreen );
		
		this.addTarget( new TriangleUpTarget( this ) );
	}

}
