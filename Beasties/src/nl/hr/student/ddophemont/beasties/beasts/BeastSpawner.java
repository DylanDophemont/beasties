package nl.hr.student.ddophemont.beasties.beasts;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.IGameObject;
import nl.hr.student.ddophemont.beasties.beasts.targets.Target;
import nl.hr.student.ddophemont.beasties.beasts.targets.TriangleDownTarget;
import nl.hr.student.ddophemont.beasties.beasts.targets.TriangleLeftTarget;
import nl.hr.student.ddophemont.beasties.beasts.targets.TriangleRightTarget;
import nl.hr.student.ddophemont.beasties.beasts.targets.TriangleUpTarget;
import nl.hr.student.ddophemont.beasties.screens.DefaultScreen;

public class BeastSpawner implements IGameObject {

	private DefaultScreen _screen;
	private float _elapsedSeconds;
	private float _spawnSpeed;
	private Vector3 _spawnArea;
	
	public BeastSpawner( DefaultScreen screen, Vector3 spawnArea ) {
		_screen = screen;
		_elapsedSeconds = 0;
		_spawnSpeed = 1;
		_spawnArea = spawnArea;
	}
	
	/**
	 * @param speed: Speed in milliseconds
	 */
	public void setSpawnSpeed( float speed ) {
		_spawnSpeed = speed/1000;
	}
	
	@Override
	public void update(float delta) {
		_elapsedSeconds += delta;
		
		// Spawn beast
		if ( _elapsedSeconds > _spawnSpeed ) {
			_elapsedSeconds = 0;
			
			float randX = _spawnArea.x + (float)Math.random() * _spawnArea.z;
			int randT = (int)(Math.random()*4);
			
			Beast b = new MiniBeast( new Vector2( randX-DrawArea.miniBeast().getWidth()/2, _spawnArea.y ), new Vector2( 0, -.4f ), _screen );
			
			while ( b.targetLocationsFree() ) {
				Target t = new TriangleDownTarget( b );
				switch ( randT ) {
					case 0:
						t = new TriangleUpTarget( b );
						break;
					case 1:
						t = new TriangleDownTarget( b );
						break;
					case 2:
						t = new TriangleLeftTarget( b );
						break;
					case 3:
						t = new TriangleRightTarget( b );
						break;
				}
				b.addTarget( t );
			}
			
			_screen.addGameObject( b );
		}
	}

	@Override
	public void draw(float delta) {
		// Do nothing
	}

}
