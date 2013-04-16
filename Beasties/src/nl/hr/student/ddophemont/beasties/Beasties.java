package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.screens.EndScreen;
import nl.hr.student.ddophemont.beasties.screens.GameScreen;
import nl.hr.student.ddophemont.beasties.screens.MenuScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Beasties extends Game {
	
	private MenuScreen menuScreen;
	private GameScreen gameScreen;
	private EndScreen endScreen;
	
	public static SpriteBatch spriteBatch;
	
	@Override
	public void create() {
		Drawable.setTexture( new Texture( "data/beasties_pixelart.png" ) );
		spriteBatch = new SpriteBatch();
		
		menuScreen = new MenuScreen( this );
//		gameScreen = new GameScreen( this );
//		endScreen = new EndScreen( this );
		
		setScreen( menuScreen );
	}

}
