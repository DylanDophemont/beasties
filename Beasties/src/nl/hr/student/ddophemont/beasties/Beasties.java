package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.screens.EndScreen;
import nl.hr.student.ddophemont.beasties.screens.GameScreen;
import nl.hr.student.ddophemont.beasties.screens.MenuScreen;

import com.badlogic.gdx.Game;

public class Beasties extends Game {
	
	private MenuScreen menuScreen;
	private GameScreen gameScreen;
	private EndScreen endScreen;
	
	@Override
	public void create() {
		menuScreen = new MenuScreen( this );
//		gameScreen = new GameScreen( this );
//		endScreen = new EndScreen( this );
		
		setScreen( menuScreen );
	}
}
