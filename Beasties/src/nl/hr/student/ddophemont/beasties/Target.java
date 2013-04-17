package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.math.Vector2;

public abstract class Target extends Drawable {

	private ESymbol _type;
	
	public Target( ESymbol symbolType, Vector2 position, DrawArea drawArea )  {
		super( position, drawArea );
		_type = symbolType;
	}
	
	public ESymbol type() {
		return _type;
	}
	
}
