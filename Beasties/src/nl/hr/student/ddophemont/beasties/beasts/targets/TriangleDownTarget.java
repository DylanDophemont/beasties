package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.GameObject;

import com.badlogic.gdx.math.Vector2;

public class TriangleDownTarget extends Target {

	public TriangleDownTarget( GameObject gameObject ) {
		super( ESymbol.TriangleDown, DrawArea.TargetTriangleDown(), gameObject );
	}

}
