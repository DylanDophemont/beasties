package nl.hr.student.ddophemont.beasties.enemies;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.enemies.abilities.Ability;
import nl.hr.student.ddophemont.beasties.enemies.targets.Target;
import nl.hr.student.ddophemont.beasties.enemies.targets.TriangleUpTarget;

import com.badlogic.gdx.math.Vector2;

public class MediumBeast extends Beast {

	public MediumBeast( Vector2 position, Vector2 velocity, DrawArea drawArea ) {
		super( position, velocity, DrawArea.MediumBeast() );
		
		this.addTarget( new TriangleUpTarget( this ) );
	}

}
