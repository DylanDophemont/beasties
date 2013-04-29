package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.Beasties;

public class Background extends GameObject {

	public Background( Vector2 position ) {
		super( new Vector2( Beasties.WIDTH/2f - DrawArea.background().getWidth()/2f, Beasties.HEIGHT/2f - DrawArea.background().getHeight()/2f ), DrawArea.background() );
	}

}
