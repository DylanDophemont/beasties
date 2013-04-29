package nl.hr.student.ddophemont.beasties.beasts.targets;

import nl.hr.student.ddophemont.beasties.DrawArea;
import nl.hr.student.ddophemont.beasties.ESymbol;
import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.beasts.Beast;

import com.badlogic.gdx.math.Vector2;

public abstract class Target extends GameObject {

	protected Beast beast;
	
	private ESymbol _type;
	private Vector2 _posOnObj;
	
	public Target( ESymbol symbolType, DrawArea drawArea, Beast beast )  {
		super( beast.getPos(), drawArea );
		
		this.beast = beast;
		
		_type = symbolType;
		_posOnObj = Vector2.Zero;
	}
	
	@Override
	public void update(float delta) {
		this.setPosition(
			beast.getPos().x + _posOnObj.x,
			beast.getPos().y + _posOnObj.y
		);
	}

	public ESymbol getType() {
		return _type;
	}
	
	public Vector2 getPositionOnObject() {
		return _posOnObj;
	}
	
	public void setPositionOnObject( Vector2 position ) {
		_posOnObj = position;
		
	}
	
	public void removeFromBeast() {
		beast.removeTarget( this );
	}
	
}
