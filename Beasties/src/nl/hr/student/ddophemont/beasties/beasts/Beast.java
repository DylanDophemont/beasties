package nl.hr.student.ddophemont.beasties.beasts;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.IUpdatable;
import nl.hr.student.ddophemont.beasties.beasts.abilities.Ability;
import nl.hr.student.ddophemont.beasties.beasts.abilities.NoAbility;
import nl.hr.student.ddophemont.beasties.beasts.targets.Target;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public abstract class Beast extends GameObject implements IUpdatable {

	private ArrayList<Vector2> _targetLocations;
	
	private ArrayList<Target> _targets;
	private ArrayList<Ability> _abilities;
	
	private Vector2 _vel;
	
	private Vector2 _topSpeed;
	
	private float _drawDistance;
	
	public Beast( Vector2 position, Vector2 velocity, DrawArea drawArea ) {
		super(position, drawArea);
		
		_targetLocations = new ArrayList<Vector2>();
		
		_targets = new ArrayList<Target>();
		_abilities = new ArrayList<Ability>();
		_vel = velocity;
		_topSpeed = velocity.cpy();
		
		_drawDistance = 0;
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
	public void draw( float delta ) {
		super.draw(delta);
		
		_drawDistance( delta );
		
		for ( Target t : _targets ) {
			t.draw( delta );
		}
	}
	
	private void _drawDistance( float delta ) {
		if ( _drawDistance >= 0 && _drawDistance < 1 ) _drawDistance = 1-((this.getY()-this.getHeight()*2f)*2f)/(Beasties.HEIGHT);
		if ( _drawDistance < 0 ) _drawDistance = 0;
		if ( _drawDistance > 1 ) _drawDistance = 1;
		
		this.setScale( _drawDistance );
//		_vel.x = .1f+(_vel.x*_drawDistance);
		_vel.y = (_topSpeed.y/3)+_topSpeed.y*_drawDistance;
		Gdx.app.log("DEBUG", _vel.toString());
		this.setColor( _drawDistance, _drawDistance, _drawDistance, 1);
	}

	public boolean addTarget( Target target ) {
		if ( _targets.isEmpty() ) {
			target.setPositionOnObject( _targetLocations.get(0) );
			_targets.add( target );
			return true;
		} else {
			for ( int ti = 0; ti < _targets.size(); ti++ ) {
				for ( int tli = 0; tli < _targetLocations.size(); tli++ ) {
					if ( !_targets.get( ti ).getPositionOnObject().equals( _targetLocations.get( tli ) ) ) {
						target.setPositionOnObject( _targetLocations.get( tli ) );
						_targets.add( target );
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public boolean targetLocationsFree() {
		return _targets.size() != _targetLocations.size();
	}
	
	public void removeTargets() {
		_targets.removeAll( _targets );
	}

	public void addAbility( Ability ability ) {
		_abilities.add( ability );
	}
	
	public void removeAbilities() {
		_abilities.removeAll( _abilities );
//		_abilities.add( new NoAbility( this ) );
	}
	
	protected void addTargetLocation( Vector2 p ) {
		_targetLocations.add( p );
	}
	
	protected void addTargetLocation( ArrayList<Vector2> targetLocations ) {
		_targetLocations.addAll( targetLocations );
	}

	@Override
	public void setScale(float scaleXY) {
		for ( Target t : _targets ) {
			t.setScale(scaleXY);
		}
		super.setScale(scaleXY);
	}

	@Override
	public void setScale(float scaleX, float scaleY) {
		for ( Target t : _targets ) {
			t.setScale(scaleX, scaleY);
		}
		super.setScale(scaleX, scaleY);
	}
	
	
}