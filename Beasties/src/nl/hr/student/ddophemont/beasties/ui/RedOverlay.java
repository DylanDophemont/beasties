package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;

public class RedOverlay extends GameObject {

	public RedOverlay( Vector2 position ) {
		super( position, DrawArea.red() );
		
		this.setBounds( 0, 0, Beasties.WIDTH, Beasties.HEIGHT);
	}

}
