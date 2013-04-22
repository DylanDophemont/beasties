package nl.hr.student.ddophemont.beasties.screens;

import nl.hr.student.ddophemont.beasties.Level;

import com.badlogic.gdx.Game;

public class GameScreen extends DefaultScreen {

	private Level lvl;
	
	public GameScreen() {
		lvl = new Level( this );
	}

}
