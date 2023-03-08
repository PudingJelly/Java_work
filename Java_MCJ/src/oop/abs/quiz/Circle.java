package oop.abs.quiz;

public class Circle extends Shape {

		public Circle(String name, double a) {
		super(name, a);
	}

	@Override
	public double getArea() {
		System.out.println("반지름이 4인 원의 넓이: " + getA()*getA()*Math.PI);
		return getA()*getA()*Math.PI ;
	}
	
}
