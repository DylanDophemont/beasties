package ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.Drawable;

public class Button extends Drawable {

	private boolean _btnPressed;
	
	public Button( Vector2 position ) {
		super( position, DrawArea.StartBtn() );
		
		_btnPressed = false;
	}
	
	public void btnPressed() {
		_btnPressed = true;
	}

}
