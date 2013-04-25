package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.GameObject;
import com.badlogic.gdx.math.Vector2;

public abstract class Target extends GameObject {

	protected GameObject gameObject;
	
	private ESymbol _type;
	private Vector2 _posOnObj;
	
	public Target( ESymbol symbolType, DrawArea drawArea, GameObject gameObject )  {
		super( gameObject.getPos(), drawArea );
		
		this.gameObject = gameObject;
		
		_type = symbolType;
		_posOnObj = Vector2.Zero;
	}
	
	@Override
	public void update(float delta) {
		this.setPosition(
			gameObject.getPos().x + _posOnObj.x,
			gameObject.getPos().y + _posOnObj.y
		);
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
