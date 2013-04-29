package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.beasts.Beast;

public class TriangleRightTarget extends Target {

	public TriangleRightTarget( Beast beast ) {
		super( ESymbol.TriangleRight, DrawArea.targetTriangleRight(), beast );
	}

}
