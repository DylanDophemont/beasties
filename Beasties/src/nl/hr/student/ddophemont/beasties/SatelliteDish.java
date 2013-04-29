package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.beasts.Beast;
import nl.hr.student.ddophemont.beasties.beasts.targets.Target;
import nl.hr.student.ddophemont.beasties.screens.DefaultScreen;
import nl.hr.student.ddophemont.beasties.ui.RedOverlay;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class SatelliteDish extends GameObject {

//	private ESymbol _target;
	
	private float _elapsedSeconds;
	private float _firingRate;
	
	private boolean _allowedToShoot;
	private boolean _firePulse;
	
	private RedOverlay _lightEffect;
	private Pulse _pulse;
	
	private DefaultScreen _gameScreen;
	
	public SatelliteDish( Vector2 position ) {
		super(position, DrawArea.base() );
		_init();
	}
	
	public SatelliteDish( Vector2 position, DefaultScreen gameScreen ) {
		super(position, DrawArea.base() );
		_init();
		
		_gameScreen = gameScreen;
		
		_pulse = new Pulse( this.getPos().add( this.getWidth()/2-DrawArea.pulse().getWidth()/2, this.getHeight() ) );
		_pulse.setTargetPosition( new Vector2(  Beasties.WIDTH, Beasties.HEIGHT ) );
		_pulse.hide();
		
		_gameScreen.addGameObject( _pulse );
	}

	private void _init() {
		_elapsedSeconds = 0;
		_firingRate = .5f;
		_allowedToShoot = true;
		_firePulse = false;
	}
	
	@Override
	public void update(float delta) {
		_elapsedSeconds += delta;
		
		if ( _elapsedSeconds > _firingRate ) {
			_elapsedSeconds = 0;
			if ( _allowedToShoot && _firePulse ) {
				 _firePulse = false;
				 _allowedToShoot = false;
				_pulse.blinkOn( 15 );
			} else if ( !_allowedToShoot && !_firePulse ) {
				_allowedToShoot = true;
				_pulse.hide();
			}
		}
		
		super.update(delta);
	}
	
	public Target fireOnClosestTarget( ESymbol target ) {
		if ( _allowedToShoot ) {
//			_target = target;
			_firePulse = true;
			_elapsedSeconds = _firingRate;
			
			Beast b = (Beast) _gameScreen.getFirstGameObject( Beast.class.getSimpleName() );
			
			if ( b != null ) {
				return b.getTargetBySymbol( target );
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
