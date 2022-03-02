package view.subpanel.roots;

public enum LabelRoots {

	X1(85, 30, 45, 25, "X1  ="),
	X2(85, 65, 45, 25, "X2  =");
	
	private int x;
	private int y;
	private int width;
	private int height;
	private String title;
	
	private LabelRoots(int x, int y, int width, int height, String title) {
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
