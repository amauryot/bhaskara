package view.subpanel.roots;

public enum TextFieldRoots {

	A(0, 140, 30, 65, 25),
	B(1, 140, 65, 65, 25);
	
	private int index;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private TextFieldRoots(int index, int x, int y, int width, int height) {
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
