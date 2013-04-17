package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.math.Vector2;

public class TriangleLeft extends Target {

	public TriangleLeft( Vector2 position ) {
		super( ESymbol.TriangleLeft, position, DrawArea.TargetTriangleLeft() );
	}

}
