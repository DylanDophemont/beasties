package nl.hr.student.ddophemont.beasties.enemies.abilities;

import nl.hr.student.ddophemont.beasties.enemies.Beast;

public abstract class Ability {

	private Beast _beast;
	
	public Ability( Beast beast ) {
		_beast = beast;
	}
	
	public abstract void performAbility( float delta );
	
}
