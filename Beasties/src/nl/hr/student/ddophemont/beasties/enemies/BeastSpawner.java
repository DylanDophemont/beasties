package nl.hr.student.ddophemont.beasties.enemies;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.IGameObject;
import nl.hr.student.ddophemont.beasties.screens.DefaultScreen;

public class BeastSpawner implements IGameObject {

	private DefaultScreen _screen;
	private float _elapsedSeconds;
	private float _spawnSpeed;
	private Vector3 _spawnArea;
	
	public BeastSpawner( DefaultScreen screen, Vector3 spawnArea ) {
		_screen = screen;
		_elapsedSeconds = 0;
		_spawnSpeed = .5f;
		_spawnArea = spawnArea;
	}
	
	public void setSpawnSpeed( float speed ) {
		_spawnSpeed = speed;
	}
	
	@Override
	public void update(float delta) {
		_elapsedSeconds += delta;
		if ( _elapsedSeconds > _spawnSpeed ) {
			_elapsedSeconds = 0;
			
			// Spawn beast
			_screen.addGameObject( new MiniBeast( new Vector2( Beasties.WIDTH/2f, Beasties.HEIGHT ), new Vector2( 0, -1 ) ) );
		}
	}

	@Override
	public void draw(float delta) {
		// Do nothing
	}

}
