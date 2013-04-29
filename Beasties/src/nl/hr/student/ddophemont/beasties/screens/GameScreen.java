package nl.hr.student.ddophemont.beasties.screens;

import java.util.ArrayList;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.IGameObject;
import nl.hr.student.ddophemont.beasties.Level;
import nl.hr.student.ddophemont.beasties.Beasties;
import nl.hr.student.ddophemont.beasties.beasts.targets.Target;
import nl.hr.student.ddophemont.beasties.ui.TriangleButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleDownButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleLeftButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleRightButton;
import nl.hr.student.ddophemont.beasties.ui.TriangleUpButton;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends DefaultScreen {

	private Level _lvl;
	
	private ArrayList<TriangleButton> _buttons;
	
	public GameScreen( Game game ) {
		super( game );
		
		_lvl = new Level( this );
		
		float tw = DrawArea.triangleBtnRight().getWidth();
		
		_buttons = new ArrayList<TriangleButton>();
		_buttons.add( new TriangleLeftButton( new Vector2( 0, 0 ) ) );
		_buttons.add( new TriangleUpButton( new Vector2( tw, 0 ) ) );
		_buttons.add( new TriangleDownButton( new Vector2( tw*2, 0 ) ) );
		_buttons.add( new TriangleRightButton( new Vector2( tw*3, 0 ) ) );
		
		this.addGameObject( new ArrayList<IGameObject>( _buttons ) );
	}

	public boolean touchDown(int x, int y, int pointer, int button) {
		Beasties.camera.unproject( this.touchPoint.set( x, y, 0 ) );
		
		for ( TriangleButton btn : _buttons ) {
			if ( btn.isPressed( touchPoint.x, touchPoint.y ) ) {
				_firePulseOntoTarget( btn.getType() );
			}
		}
		
		return super.touchDown(x, y, pointer, button);
	}
	
	public boolean touchUp(int x, int y, int pointer, int button) {
		for ( TriangleButton btn : _buttons ) {
			btn.isNotPressed();
		}
		
		return super.touchDown(x, y, pointer, button);
	}

	@Override
	public boolean keyDown(int keycode) {
		switch ( keycode ) {
			case 19: // up
				_getButtonBySymbol( ESymbol.TriangleUp ).down();
				_firePulseOntoTarget( ESymbol.TriangleUp);
				break;
			case 20: // down
				_getButtonBySymbol( ESymbol.TriangleDown ).down();
				_firePulseOntoTarget( ESymbol.TriangleDown);
				break;
			case 21: // left
				_getButtonBySymbol( ESymbol.TriangleLeft ).down();
				_firePulseOntoTarget( ESymbol.TriangleLeft);
				break;
			case 22: // right
				_getButtonBySymbol( ESymbol.TriangleRight ).down();
				_firePulseOntoTarget( ESymbol.TriangleRight);
				break;
		}
		
		return super.keyDown(keycode);
	}
	
	@Override
	public boolean keyUp(int keycode) {
		for ( TriangleButton t : _buttons ) {
			t.up();
		}
		return super.keyUp(keycode);
	}

	private TriangleButton _getButtonBySymbol( ESymbol symbol ) {
		for ( TriangleButton btn : _buttons ) {
			if ( btn.getType() == symbol ) return btn;
		}
		return null;
	}
	
	private void _firePulseOntoTarget( ESymbol symbol ) {
		Target t = _lvl.getSatelliteDish().fireOnClosestTarget( symbol );
		if ( t != null ) {
			t.removeFromBeast();
		}
	}
	
}
