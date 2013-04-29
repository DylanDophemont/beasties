package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;

public abstract class Button extends GameObject {

	protected boolean pressed;
	
	public Button( Vector2 position, DrawArea drawArea ) {
		super( position, drawArea );
		
		pressed = false;
	}
	
	public boolean isPressed( float x, float y ) {
		pressed = true;
		return this.getBoundingRectangle().contains( x, y );
	}
	
	public void isNotPressed() {
		pressed = false;
	}

}