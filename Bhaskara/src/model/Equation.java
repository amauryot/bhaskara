package model;

public class Equation {

	private double a;
	private double b;
	private double c;
	
	public void setCoefficients(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	private double delta() {
		return (b*b) - (4 * a * c);
	}
	
	public boolean isQuadratic() {
		return (a != 0);
	}
	
	public boolean hasRealRoots() {
		return (delta() >= 0);
	}
	
	public double calculateX1() {
		return (-b + Math.sqrt(delta())) / (2 * a);
	}
	
	public double calculateX2() {
		return (-b - Math.sqrt(delta())) / (2 * a);
	}
}
