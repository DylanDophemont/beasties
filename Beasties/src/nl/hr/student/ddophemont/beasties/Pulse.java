package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Pulse extends GameObject {

	private Vector2 _targetPosition;
	private Vector2 _distance;
	private float _radius;
	private boolean _hidden;
	private boolean _blink;
	private float _blinkInterval;
	private float _elapsedSeconds;
	
	public Pulse( Vector2 position ) {
		super( position, DrawArea.pulse() );
		
		_radius = DrawArea.pulse().getWidth()/2;
		_targetPosition = Vector2.Zero;
		_distance = Vector2.Zero;
		_hidden = false;
		_blink = false;
		_blinkInterval = 0;
		_elapsedSeconds = 0;
	}

	@Override
	public void draw(float delta) {
		this.rotate( 360/30 );
		if ( this.getRotation() >= 360 ) this.setRotation(0);
		
		for ( int i = 0; i < _distance.y/_radius; i++ ) {
			this.setScale( (i-(_distance.y/_radius))/(_distance.y/_radius) );
			this.setPosition( this.getX(), _targetPosition.y-(i*_radius) );
			if ( !_hidden ) super.draw(Beasties.spriteBatch);
		}
		
		this.setPosition( this.getX(), this.getY() );
	}

	public void show() {
		_blink = false;
		_hidden = false;
	}
	
	public void hide() {
		_blink = false;
		_hidden = true;
	}
	
	/**
	 * @param interval: Interval in milliseconds
	 */
	public void blinkOn( float interval ) {
		_blink = true;
		_hidden = false;
		_blinkInterval = interval/1000;
	}
	
	public void blinkOff() {
		_blink = false;
		_hidden = false;
	}
	
	@Override
	public void update(float delta) {
		_elapsedSeconds += delta;
		
		if ( _blink && _elapsedSeconds > _blinkInterval ) {
			_elapsedSeconds = 0;
			_hidden = !_hidden;
		}
		
		super.update(delta);
	}
	
	public void setTargetPosition( Vector2 position ) {
		_targetPosition = position;
		_distance = _targetPosition.sub( this.getPos() );
	}
	
}
