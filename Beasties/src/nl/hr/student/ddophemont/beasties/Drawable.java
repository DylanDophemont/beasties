package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Drawable implements IDrawable {

	public static final float DRAWABLE_SCALE = 2;	
	
	private static Texture _texture;
	
	private DrawArea _drawArea;
	private TextureRegion _texReg;
	private Rectangle _rectangle;
	private float _scale;
	public Vector2 _pos;
	
	public float rotation;
	
	public Drawable( Vector2 position, DrawArea drawArea ) {
		if ( _texture == null ) {
			// TODO: create some kind of exception or error if the texture is not set
			// "Please set the texture first before creating childs of the Drawable class. Use the static method Drawable.setTexture(Texture texture) to solve this issue." 
		}
		
		_drawArea = drawArea;
		_texReg = new TextureRegion( _texture, _drawArea.x(), _drawArea.y(), _drawArea.width(), _drawArea.height() );
		_pos = position;
		_scale = DRAWABLE_SCALE;
		rotation = 0;
		
		_rectangle = new Rectangle( _pos.x - _drawArea.width()/2*DRAWABLE_SCALE, _pos.y - _drawArea.height()/2*DRAWABLE_SCALE, _drawArea.width()*DRAWABLE_SCALE, _drawArea.height()*DRAWABLE_SCALE );
	}


	public static void setTexture(Texture texture) {
		_texture = texture;
	}
	
	@Override
	public void draw(float delta) {
		Beasties.spriteBatch.draw(
			_texReg,
			_pos.x,
			_pos.y,
			_drawArea.width()/2*DRAWABLE_SCALE,
			_drawArea.height()/2*DRAWABLE_SCALE,
			_drawArea.width(),
			_drawArea.height(),
			_scale,
			_scale,
			rotation
		);
	}
	
	public Rectangle currentRectangle() {
		return _rectangle;
	}
	
	private void _updateRectangle() {
		_rectangle.x = _pos.x - _drawArea.width()/_scale*DRAWABLE_SCALE;
		_rectangle.y = _pos.y - _drawArea.height()/_scale*DRAWABLE_SCALE;
		_rectangle.width = _drawArea.width()*_scale*DRAWABLE_SCALE;
		_rectangle.height = _drawArea.height()*_scale*DRAWABLE_SCALE;
	}

	public float getScale() {
		return _scale;
	}

	public void setScale( float scale ) {
		_scale = _scale;
		_updateRectangle();
	}
	
	public Vector2 getPos() {
		return _pos;
	}

	public void setPos( Vector2 position ) {
		_pos = position;
		_updateRectangle();
	}
	
}