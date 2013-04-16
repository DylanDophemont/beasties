package nl.hr.student.ddophemont.beasties;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Drawable implements IDrawable {

	private static Texture _texture;
	
	private DrawArea _drawArea;
	private TextureRegion _texReg;

	public Vector2 pos;
	public float scale;
	public float rotation;
	
	public Drawable( Vector2 position, DrawArea drawArea ) {
		if ( _texture == null ) {
			//throw new Exception("Please set the texture first before creating childs of the Drawable class. Use the static method Drawable.setTexture(Texture texture) to solve this issue.");
		}
		
		_drawArea = drawArea;
		_texReg = new TextureRegion( _texture, _drawArea.x(), _drawArea.y(), _drawArea.width(), _drawArea.height() );
		pos = position;
		scale = 1;
		rotation = 0;
	}

	public static void setTexture(Texture texture) {
		_texture = texture;
	}
	
	@Override
	public void draw(float delta) {
		Beasties.spriteBatch.draw(
			_texReg,
			pos.x,
			pos.y,
			_drawArea.width()/2,
			_drawArea.height()/2,
			_drawArea.width(),
			_drawArea.height(),
			scale,
			scale,
			rotation
		);
	}
	
	public Rectangle collisionRectangle() {
		return new Rectangle( _drawArea.x(), _drawArea.y(), _drawArea.width(), _drawArea.height() );
	}
	
}