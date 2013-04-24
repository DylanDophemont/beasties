package nl.hr.student.ddophemont.beasties.enemies;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.IUpdatable;
import nl.hr.student.ddophemont.beasties.enemies.abilities.Ability;
import nl.hr.student.ddophemont.beasties.enemies.abilities.NoAbility;
import nl.hr.student.ddophemont.beasties.enemies.targets.Target;

import com.badlogic.gdx.math.Vector2;

public abstract class Beast extends GameObject implements IUpdatable {

	private ArrayList<Target> _targets;
	private ArrayList<Ability> _abilities;
	
	private Vector2 _vel;
	
	public Beast( Vector2 position, Vector2 velocity, DrawArea drawArea ) {
		super(position, drawArea);
		_targets = new ArrayList<Target>();
		_abilities = new ArrayList<Ability>();
		_vel = velocity;
	}

	@Override
	public void update(float delta) {
		this.setPos(getPos().add(_vel));
		
		for ( Target t : _targets ) {
			t.update( delta );
		}
		
		for ( Ability a : _abilities ) {
			a.performAbility( delta );
		}
	}
	
	@Override
	public void draw(float delta) {
		super.draw(delta);
		
		for ( Target t : _targets ) {
			t.draw( delta );
		}
	}

	public void addTarget( Target target ) {
		_targets.add( target );
	}
	
	public void removeTargets() {
		_targets.removeAll( _targets );
	}

	public void addAbility( Ability ability ) {
		_abilities.add( ability );
	}
	
	public void removeAbilities() {
		_abilities.removeAll( _abilities );
		_abilities.add( new NoAbility( this ) );
	}
	
}