package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.Beasties;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public abstract class GameObject extends Sprite implements IGameObject {

	private static Texture _texture;
	public Vector2 _pos;
	
	public float rotation;
	
	public GameObject( Vector2 position, DrawArea drawArea ) {
		super( new TextureRegion( _texture, drawArea.getX(), drawArea.getY(), drawArea.getWidth(), drawArea.getHeight() ) );
		
		_pos = position;
		
		rotation = 0;
		
		setBounds( _pos.x, _pos.y, this.getWidth(), this.getHeight() );
		setOrigin( this.getWidth()/2f, this.getHeight()/2f );
	}

	public static void setDrawableTexture( Texture texture ) {
		_texture = texture;
	}

	public Vector2 getPos() {
		return _pos;
	}

	public void setPos( Vector2 position ) {
		this.setPosition( _pos.x, _pos.y );
	}
	
	@Override
	public void draw(float delta) {
		super.draw( Beasties.spriteBatch );
	}

	@Override
	public void update(float delta) {}

}