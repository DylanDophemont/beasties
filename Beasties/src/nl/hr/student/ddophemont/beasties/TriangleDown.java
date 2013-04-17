package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.math.Vector2;

public class TriangleDown extends Target {

	public TriangleDown( Vector2 position ) {
		super( ESymbol.TriangleDown, position, DrawArea.TargetTriangleDown() );
	}

}
