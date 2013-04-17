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

	public int x() {
		return _x;
	}

	public void x(int x) {
		_x = x;
	}
	
	public int y() {
		return _y;
	}

	public void y(int y) {
		_y = y;
	}

	public int width() {
		return _width;
	}

	public void width(int width) {
		_width = width;
	}
	
	public int height() {
		return _height;
	}

	public void height(int height) {
		_height = height;
	}
	
	/* Predefined DrawAreas */
	
	public static DrawArea TriangleUp() {
		return new DrawArea( 63, 1, 30, 30 );
	}
	
	public static DrawArea TriangleDown() {
		return new DrawArea( 95, 1, 30, 30 );
	}
	
	public static DrawArea TriangleLeft() {
		return new DrawArea( 1, 1, 30, 30 );
	}
	
	public static DrawArea TriangleRight() {
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
	
	public static DrawArea BackGround() {
		return new DrawArea( 194, 1, 120, 192 );
	}
	
}
