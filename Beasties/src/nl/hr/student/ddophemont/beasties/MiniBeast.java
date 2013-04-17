package nl.hr.student.ddophemont.beasties;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;

public class MiniBeast extends Beast {

	public MiniBeast( Vector2 position, Vector2 velocity, ArrayList<Target> hp, ArrayList<IAbility> abilities ) {
		super( position, velocity, DrawArea.MiniBeast(), hp, abilities );
	}

}
