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
	
	/* Predefined DrawAreas */
	
	public static DrawArea TriangleBtnUp() {
		return new DrawArea( 63, 1, 30, 30 );
	}
	
	public static DrawArea TriangleBtnDown() {
		return new DrawArea( 95, 1, 30, 30 );
	}
	
	public static DrawArea TriangleBtnLeft() {
		return new DrawArea( 1, 1, 30, 30 );
	}
	
	public static DrawArea TriangleBtnRight() {
		return new DrawArea( 32, 1, 30, 30 );
	}
	
	public static DrawArea TargetTriangleUp() {
		return new DrawArea( 187, 1, 6, 6 );
	}
	
	public static DrawArea TargetTriangleDown() {
		return new DrawArea( 187, 8, 6, 6 );
	}
	
	public static DrawArea TargetTriangleLeft() {
		return new DrawArea( 187, 15, 6, 6 );
	}
	
	public static DrawArea TargetTriangleRight() {
		return new DrawArea( 187, 22, 6, 6 );
	}
	
	public static DrawArea StartBtn() {
		return new DrawArea( 125, 1, 61, 30 );
	}
	
	public static DrawArea MiniBeast() {
		return new DrawArea( 1, 32, 34, 34 );
	}
	
	public static DrawArea MediumBeast() {
		return new DrawArea( 36, 32, 104, 73 );
	}
	
	public static DrawArea Background() {
		return new DrawArea( 194, 1, 120, 192 );
	}
	
	public static DrawArea ReloadIndicatorBackground() {
		return new DrawArea( 141, 32, 25, 11 );
	}
	
	public static DrawArea ReloadIndicatorForeground() {
		return new DrawArea( 141, 44, 25, 11 );
	}
	
	public static DrawArea Base() {
		return new DrawArea( 141, 56, 40, 49 );
	}
	
	public static DrawArea Black() {
		return new DrawArea( 234, 15, 4, 4 );
	}
	
}
