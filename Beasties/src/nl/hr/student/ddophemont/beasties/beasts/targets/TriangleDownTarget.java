package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.beasts.Beast;

public class TriangleDownTarget extends Target {

	public TriangleDownTarget( Beast beast ) {
		super( ESymbol.TriangleDown, DrawArea.targetTriangleDown(), beast );
	}

}
