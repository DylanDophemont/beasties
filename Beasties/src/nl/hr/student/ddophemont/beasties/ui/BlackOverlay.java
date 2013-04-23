package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;

public class BlackOverlay extends GameObject {

	public BlackOverlay( Vector2 position, float alpha ) {
		super( position, DrawArea.Black() );
		
		this.setBounds( 0, 0, Beasties.WIDTH, Beasties.HEIGHT);
		this.setColor( 1, 1, 1, alpha );
	}

}
