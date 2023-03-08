package oop.abs.quiz;

public class Rect extends Shape {

	public Rect(String name, double a) {
		super(name,a);
	}

	@Override
	public double getArea() {
		System.out.println("길이가 5인 정사각형의 넓이: " + getA()*getA());
		return getA()*getA();
	}
	
}
