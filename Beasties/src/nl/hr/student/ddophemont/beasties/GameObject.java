package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class GameObject extends Sprite implements IDrawable, IUpdatable {

	protected static Game game;
	
	private static float _drawScale;
	
	private static Texture _texture;
	
	private DrawArea _drawArea;
	private float _scale;
	public Vector2 _pos;
	
	public float rotation;
	
	public GameObject( Vector2 position, DrawArea drawArea ) {
		super( new TextureRegion( _texture, drawArea.getX(), drawArea.getY(), drawArea.getWidth(), drawArea.getHeight() ) );
		
//		_drawArea = drawArea;
//		_texReg = new TextureRegion( _texture, _drawArea.x(), _drawArea.y(), _drawArea.width(), _drawArea.height() );
		_pos = position;
		
		_drawScale = _scale = 1f;
		rotation = 0;
		
		setBounds( _pos.x, _pos.y, this.getWidth(), this.getHeight() );
		setOrigin( this.getWidth()/2f, this.getHeight()/2f );
		//setPosition( _pos.x, _pos.y );
		
		//_rectangle = new Rectangle( _pos.x - _drawArea.width()/2, _pos.y - _drawArea.height()/2, _drawArea.width(), _drawArea.height() );
	}

	public static void setDrawableTexture( Texture texture ) {
		_texture = texture;
	}
	
	public static void setGame( Game game ) {
		GameObject.game = game;
	}

	public float getScale() {
		return _scale;
	}

	public void setScale( float scale ) {
		_scale = scale;
		this.scale( _scale );
	}

	public Vector2 getPos() {
		return _pos;
	}

	public void setPos( Vector2 position ) {
		_pos = position;
		this.setPosition( _pos.x, _pos.y );
	}
	
	public static void setDrawScale( float scale ) {
		_drawScale = scale;
	}
	
	@Override
	public void draw(float delta) {
		super.draw( Beasties.spriteBatch );
	}
	
	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		
	}
	
}