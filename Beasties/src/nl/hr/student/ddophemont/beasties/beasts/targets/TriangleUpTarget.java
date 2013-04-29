package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.beasts.Beast;

public class TriangleUpTarget extends Target {

	public TriangleUpTarget( Beast beast ) {
		super( ESymbol.TriangleUp, DrawArea.targetTriangleUp(), beast );
	}

}
