package oop.abs.quiz;

public class Rect extends Shape {

	private int a;
	
	public Rect(String name, int a) {
		super(name);
		this.a = a;
	}

	@Override
	public double getArea() {
		return a*a;
	}
	
}
