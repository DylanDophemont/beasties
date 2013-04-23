package nl.hr.student.ddophemont.beasties.ui;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;

import com.badlogic.gdx.math.Vector2;

public class TriangleUpButton extends TriangleButton {

	public TriangleUpButton( Vector2 position ) {
		super( position, DrawArea.TriangleBtnUp(), ESymbol.TriangleUp );
	}

}
