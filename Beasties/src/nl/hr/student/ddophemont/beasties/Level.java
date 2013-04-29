package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.beasts.BeastSpawner;
import nl.hr.student.ddophemont.beasties.screens.DefaultScreen;
import nl.hr.student.ddophemont.beasties.ui.Background;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class Level {

	private SatelliteDish _satelliteDish;
	
	public Level( DefaultScreen gameScreen ) {
		// Add the background
		gameScreen.addGameObject( new Background( new Vector2( Beasties.WIDTH/2f, Beasties.HEIGHT/2f ) ) );
		
		// Add the beast spawner
		gameScreen.addGameObject( new BeastSpawner( gameScreen, new Vector3( Beasties.WIDTH/2-30, Beasties.HEIGHT, 60 ) ) );
		
		// Add the players base
		_satelliteDish = new SatelliteDish( new Vector2( 40, 3 ), gameScreen );
		gameScreen.addGameObject( _satelliteDish );
	}
	
	public SatelliteDish getSatelliteDish() {
		return _satelliteDish;
	}

}
