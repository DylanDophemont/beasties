package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.enemies.BeastSpawner;
import nl.hr.student.ddophemont.beasties.enemies.MiniBeast;
import nl.hr.student.ddophemont.beasties.enemies.abilities.MoveFastAbility;
import nl.hr.student.ddophemont.beasties.screens.DefaultScreen;
import nl.hr.student.ddophemont.beasties.ui.Background;

import com.badlogic.gdx.math.Vector2;

public class Level {

//	private BeastSpawner _beastSpawner;
	private DefaultScreen _gameScreen;
	
	public Level( DefaultScreen gameScreen ) {
		_gameScreen = gameScreen;
		
		// Add the background
		_gameScreen.addGameObject( new Background( new Vector2( Beasties.WIDTH/2f, Beasties.HEIGHT/2f ) ) );
		
		_gameScreen.addGameObject( new BeastSpawner( _gameScreen ) );
		
		// Add the beast spawner
		/*MiniBeast b = new MiniBeast( new Vector2( Beasties.WIDTH/2f, Beasties.HEIGHT ), new Vector2( 0, -1 ) );
		b.addAbility( new MoveFastAbility( b ) );
		_gameScreen.addGameObject( b );*/
		
		// Add the players base
		_gameScreen.addGameObject( new SatelliteDish( new Vector2( 40, 3 ) ) );
	}

}
