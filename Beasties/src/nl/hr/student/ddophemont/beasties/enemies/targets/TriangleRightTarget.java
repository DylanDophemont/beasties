package nl.hr.student.ddophemont.beasties.enemies.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.GameObject;

import com.badlogic.gdx.math.Vector2;

public class TriangleRightTarget extends Target {

	public TriangleRightTarget( GameObject gameObject ) {
		super( ESymbol.TriangleRight, DrawArea.TargetTriangleRight(), gameObject );
	}

}
