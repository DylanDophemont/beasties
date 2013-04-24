package nl.hr.student.ddophemont.beasties.enemies.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.enemies.Beast;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public abstract class Target extends GameObject {

	protected GameObject gameObject;
	
	private ESymbol _type;
	
	public Vector2 _posOnObj;
	
	public Target( ESymbol symbolType, DrawArea drawArea, GameObject gameObject )  {
		super( Vector2.Zero, drawArea );
		_type = symbolType;
		
		this.gameObject = gameObject;
		
		_posOnObj = Vector2.Zero;
	}
	
	public void update(float delta) {
		this.setPosition(
			(gameObject.getPos().x + _posOnObj.x),
			(gameObject.getPos().y + _posOnObj.y)
		);
		
		super.update(delta);
	}

	public ESymbol type() {
		return _type;
	}
	
	public Vector2 getPositionOnObject() {
		return _posOnObj;
	}
	
	public void setPositionOnObject( Vector2 position ) {
		_posOnObj = position;
	}
	
}
