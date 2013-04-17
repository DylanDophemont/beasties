package nl.hr.student.ddophemont.beasties;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;

public abstract class Beast extends Drawable implements IUpdatable {

	private ArrayList<Target> _hp;
	private ArrayList<IAbility> _abilities;
	
	private Vector2 _vel;
	
	public Beast( Vector2 position, Vector2 velocity, DrawArea drawArea, ArrayList<Target> hp, ArrayList<IAbility> abilities ) {
		super(position, drawArea);
		_hp = hp;
		_abilities = abilities;
		_vel = velocity;
	}

	@Override
	public void update(float delta) {
		pos.add(_vel);
		
		for ( IAbility a : _abilities ) {
			a.performAbility();
		}
	}

	
	
}