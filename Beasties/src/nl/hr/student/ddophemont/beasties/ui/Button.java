package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.Drawable;

public class Button extends Drawable {

	public Button( Vector2 position ) {
		super( position, DrawArea.StartBtn() );
	}
	
	public void btnPressed() {
		
	}

}
