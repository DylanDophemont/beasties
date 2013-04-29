package nl.hr.student.ddophemont.beasties;

public class DrawArea {

	private int _x;
	private int _y;
	private int _width;
	private int _height;

	public DrawArea( int x, int y, int width, int height ) {
		_x = x;
		_y = y;
		_width = width;
		_height = height;
	}

	public int getX() {
		return _x;
	}

	public void setX(int x) {
		_x = x;
	}
	
	public int getY() {
		return _y;
	}

	public void setY(int y) {
		_y = y;
	}

	public int getWidth() {
		return _width;
	}

	public void setWidth(int width) {
		_width = width;
	}
	
	public int getHeight() {
		return _height;
	}

	public void setHeight(int height) {
		_height = height;
	}
	
	public String toString () {
		return "x: " + _x + ", y: " + _y + ", width: " + _width + ", height: " + _height;
	}
	
	/* Predefined DrawAreas */
	
	public static DrawArea triangleBtnUp() {
		return new DrawArea( 63, 1, 30, 30 );
	}
	
	public static DrawArea triangleBtnDown() {
		return new DrawArea( 95, 1, 30, 30 );
	}
	
	public static DrawArea triangleBtnLeft() {
		return new DrawArea( 1, 1, 30, 30 );
	}
	
	public static DrawArea triangleBtnRight() {
		return new DrawArea( 32, 1, 30, 30 );
	}
	
	public static DrawArea targetTriangleUp() {
		return new DrawArea( 187, 15, 6, 6 );
	}
	
	public static DrawArea targetTriangleDown() {
		return new DrawArea( 187, 22, 6, 6 );
	}
	
	public static DrawArea targetTriangleLeft() {
		return new DrawArea( 187, 1, 6, 6 );
	}
	
	public static DrawArea targetTriangleRight() {
		return new DrawArea( 187, 8, 6, 6 );
	}
	
	public static DrawArea startBtn() {
		return new DrawArea( 125, 1, 61, 30 );
	}
	
	public static DrawArea miniBeast() {
		return new DrawArea( 1, 32, 34, 34 );
	}
	
	public static DrawArea mediumBeast() {
		return new DrawArea( 36, 32, 104, 73 );
	}
	
	public static DrawArea background() {
		return new DrawArea( 194, 1, 120, 192 );
	}
	
	public static DrawArea reloadIndicatorBackground() {
		return new DrawArea( 141, 32, 25, 11 );
	}
	
	public static DrawArea reloadIndicatorForeground() {
		return new DrawArea( 141, 44, 25, 11 );
	}
	
	public static DrawArea base() {
		return new DrawArea( 141, 56, 40, 49 );
	}
	
	public static DrawArea black() {
		return new DrawArea( 234, 15, 4, 4 );
	}
	
	public static DrawArea red() {
		return new DrawArea( 77, 19, 4, 4 );
	}
	
	public static DrawArea pulse() {
		return new DrawArea( 167, 32, 4, 4 );
	}
	
}
