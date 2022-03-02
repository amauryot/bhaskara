package view.subpanel.equation;

public enum TextFieldEquation {

	A(0, 10, 30, 40, 25),
	B(1, 110, 30, 40, 25),
	C(2, 200, 30, 40, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldEquation(int index, int x, int y, int width, int height) {
		this.index = index;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int index() {
		return index;
	}
	
	public int x() {
		return x;
	}
	
	public int y() {
		return y;
	}
	
	public int width() {
		return width;
	}
	
	public int height() {
		return height;
	}
}
