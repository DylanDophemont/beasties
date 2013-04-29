package nl.hr.student.ddophemont.beasties.ui;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.screens.GameScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class StartButton extends Button {

	public StartButton( Vector2 position ) {
		super(position, DrawArea.startBtn() );
	}
	
}
