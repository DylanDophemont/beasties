package nl.hr.student.ddophemont.beasties.ui;

import com.badlogic.gdx.math.Vector2;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;

public class Background extends GameObject {

	public Background( Vector2 position ) {
		super( new Vector2( Beasties.WIDTH/2f - DrawArea.Background().getWidth()/2f, Beasties.HEIGHT/2f - DrawArea.Background().getHeight()/2f ), DrawArea.Background() );
	}

}
