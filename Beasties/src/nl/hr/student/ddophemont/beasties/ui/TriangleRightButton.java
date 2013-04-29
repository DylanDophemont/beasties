package nl.hr.student.ddophemont.beasties.ui;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;

import com.badlogic.gdx.math.Vector2;

public class TriangleRightButton extends TriangleButton {

	public TriangleRightButton( Vector2 position ) {
		super( position, DrawArea.triangleBtnRight(), ESymbol.TriangleRight );
	}

}
