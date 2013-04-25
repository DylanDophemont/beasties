package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.GameObject;

import com.badlogic.gdx.math.Vector2;

public class TriangleUpTarget extends Target {

	public TriangleUpTarget( GameObject gameObject ) {
		super( ESymbol.TriangleUp, DrawArea.TargetTriangleUp(), gameObject );
	}

}
