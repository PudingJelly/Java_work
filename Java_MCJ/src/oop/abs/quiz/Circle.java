package oop.abs.quiz;

public class Circle extends Shape {

	private int rad;
	
	public Circle(String name, int rad) {
		super(name);
		this.rad = rad;
	}

	@Override
	public double getArea() {
		return rad * rad * Math.PI ;
	}

}
