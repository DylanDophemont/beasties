package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.Level;
import nl.hr.student.ddophemont.beasties.enemies.Beasties;
import nl.hr.student.ddophemont.beasties.enemies.MiniBeast;
import nl.hr.student.ddophemont.beasties.enemies.abilities.Ability;
import nl.hr.student.ddophemont.beasties.enemies.abilities.MoveFastAbility;
import nl.hr.student.ddophemont.beasties.enemies.targets.Target;
import nl.hr.student.ddophemont.beasties.enemies.targets.TriangleUpTarget;
import nl.hr.student.ddophemont.beasties.ui.Button;
import nl.hr.student.ddophemont.beasties.ui.TriangleDownButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleLeftButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleRightButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleUpButton;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class GameScreen extends DefaultScreen {

	private Level lvl;
	
	private ArrayList<Button> _buttons;
	
	public GameScreen( Game game ) {
		super( game );
		
		lvl = new Level( this );
		
		float tw = DrawArea.TriangleBtnRight().getWidth();
		
		_buttons = new ArrayList<Button>();
		_buttons.add( new TriangleLeftButton( new Vector2( 0, 0 ) ) );
		_buttons.add( new TriangleUpButton( new Vector2( tw, 0 ) ) );
		_buttons.add( new TriangleRightButton( new Vector2( tw*2, 0 ) ) );
		_buttons.add( new TriangleDownButton( new Vector2( tw*3, 0 ) ) );
		
		this.addGameObject( new ArrayList<GameObject>( _buttons ) );
	}

	public boolean touchDown(int x, int y, int pointer, int button) {
		Beasties.camera.unproject( this.touchPoint.set( x, y, 0 ) );
		
		for ( Button btn : _buttons ) {
			btn.isPressed( touchPoint.x, touchPoint.y );
		}
		
		return super.touchDown(x, y, pointer, button);
	}
	
	public boolean touchUp(int x, int y, int pointer, int button) {
		for ( Button btn : _buttons ) {
			btn.isNotPressed();
		}
		
		return super.touchDown(x, y, pointer, button);
	}
	
}
