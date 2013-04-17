package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.math.Vector2;

public class TriangleUp extends Target {

	public TriangleUp( Vector2 position ) {
		super( ESymbol.TriangleUp, position, DrawArea.TargetTriangleUp() );
	}

}
