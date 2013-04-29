package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.GameObject;
import nl.hr.student.ddophemont.beasties.screens.MenuScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Beasties extends Game {
	
	public static final int HEIGHT = 192;
	public static final int WIDTH = 120;
	public static final float ASPECT_RATIO = (float)WIDTH/(float)HEIGHT;
	
	public static OrthographicCamera camera;
	public static SpriteBatch spriteBatch;
	
	private Rectangle _viewport;
	
	@Override
	public void create() {
		GameObject.setDrawableTexture( new Texture( "data/beasties_spritesheet.png" ) );
	
		spriteBatch = new SpriteBatch();
		camera = new OrthographicCamera( WIDTH, HEIGHT);
		camera.position.set( WIDTH/2, HEIGHT/2, 0 );
		camera.setToOrtho( false, WIDTH, HEIGHT );
		
		setScreen( new MenuScreen( this ) );
	}
	
	@Override
	public void render() {
		camera.update();
        Gdx.gl.glViewport( (int) _viewport.x, (int) _viewport.y, (int) _viewport.width, (int) _viewport.height );
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		crop( width, height );
		super.resize(width, height);
	}

	public void crop( int width, int height ) {
		Vector2 crop = new Vector2( 0, 0 );
		
		float scale = 1f;
		
		float scaleH = (float)height/(float)Beasties.HEIGHT;
		float scaleW = (float)width/(float)Beasties.WIDTH;
		
		if ( scaleH < scaleW ) {
			scale = scaleH;
		} else {
			scale = scaleW;
		}
		
	    crop.y = (height - Beasties.HEIGHT*scale)/2f;
	    crop.x = (width - Beasties.WIDTH*scale)/2f;
		
		float w = (float)Beasties.WIDTH*scale;
		float h = (float)Beasties.HEIGHT*scale;
		_viewport = new Rectangle(crop.x, crop.y, w, h);
	}

}