package nl.hr.student.ddophemont.beasties.ui;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public abstract class TriangleButton extends Button {

	private ESymbol _type;
	
	public TriangleButton( Vector2 position, DrawArea drawArea, ESymbol type ) {
		super(position, drawArea);
		
		_type = type;

		this.setColor( 1, 1, 1, .5f );
	}

	@Override
	public boolean isPressed(float x, float y) {
		if ( super.isPressed(x, y) ) {
			this.setColor( 1, 1, 1, 1 );
			return true;
		} else {
			this.setColor( 1, 1, 1, .5f );
			return false;
		}
	}
	
	public void down() {
		this.pressed = true;
		this.setColor( 1, 1, 1, 1 );
	}
	
	public void up() {
		this.pressed = false;
	}

	public void update(float delta) {
		if ( !pressed &&  this.getColor().a > .5f ) {
			Color c = this.getColor();
			c.a -= .02f;
			this.setColor( c );
		}
	}

	public ESymbol getType() {
		return _type;
	}
	
}
