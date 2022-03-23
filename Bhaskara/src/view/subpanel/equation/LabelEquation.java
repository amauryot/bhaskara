package view.subpanel.equation;

public enum LabelEquation {

	A(55,  30, 45, 25, "X²  +"),
	B(155, 30, 35, 25, "X  +" ),
	C(245, 30, 35, 25, "=  0" );
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelEquation(int x, int y, int width, int height, String title) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.title = title;
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
	
	public String title() {
		return title;
	}
}
