package oop.poly.car;

public class Tesla extends Car {

	@Override
	void run() {
		
		System.out.println("테슬라는 전기차지롱~");
	}

	void enterMembership() {
		System.out.println("테슬라 멤버십에 가입합니다.");
	}
}
