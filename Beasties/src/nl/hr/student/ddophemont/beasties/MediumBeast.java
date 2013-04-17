package nl.hr.student.ddophemont.beasties;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;

public class MediumBeast extends Beast {

	public MediumBeast( Vector2 position, Vector2 velocity, DrawArea drawArea, ArrayList<Target> hp, ArrayList<IAbility> abilities ) {
		super( position, velocity, DrawArea.MediumBeast(), hp, abilities );
	}

}
