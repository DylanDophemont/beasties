package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.Drawable;

public abstract class Button extends Drawable {

	public Button( Vector2 position, DrawArea drawArea ) {
		super( position, drawArea );
	}
	
	public abstract void isPressed( float x, float y );

}
