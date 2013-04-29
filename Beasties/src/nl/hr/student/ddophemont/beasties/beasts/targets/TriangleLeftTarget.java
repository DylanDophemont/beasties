package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.beasts.Beast;

public class TriangleLeftTarget extends Target {

	public TriangleLeftTarget( Beast beast ) {
		super( ESymbol.TriangleLeft, DrawArea.targetTriangleLeft(), beast );
	}

}
