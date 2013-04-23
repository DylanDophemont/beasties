package nl.hr.student.ddophemont.beasties.ui;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;

import com.badlogic.gdx.math.Vector2;

public class TriangleDownButton extends TriangleButton {

	public TriangleDownButton( Vector2 position ) {
		super( position, DrawArea.TriangleBtnDown(), ESymbol.TriangleDown );
	}

}
