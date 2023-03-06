package oop.overloading;

public class Calculator {
	
	/*
	 # 오버로딩(중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
	  생성자를 여러개 중복해서 선언할 수 있게 해주는 문법
	
	- 오버로딩 적용 조건
	1. 매개변수의 데이터 타입이 다를 것! 
				or
	2. 매개변수의 전달 순서가 다를 것! 
				or
	3. 매개변수의 개수가 다를 것!
	 */
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
//	void inputData(int b, int a) {} (X)
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (X) 정수매개값 한개를 받는 메서드가 이미 선언 되었음
	
//	int inputData(int number) 
//	return 0;
//	} (X) 반환 유형(return type)은 오버로딩에 영향을 미치지 못합니다.
	
//	void calcRectArea(double a) {
//		System.out.print("정사각형의 넓이: ");
//		System.out.println(a*a+ "㎠");
//		System.out.println(Math.pow(a, 2)+ "㎠");
//		return;
//	}
//	void calcRectArea(int a, int b) { // a = 가로, b = 세로
//		System.out.print("직사각형의 넓이: ");
//		System.out.println(a*b + "㎠");
//		return;
//	}
//	void calcRectArea(int a, int b, int c) { //a = 윗변, b = 밑변, c = 높이
//		System.out.print("사다리꼴의 넓이: ");
//		System.out.println((a+b)*c/2 + "㎠");
//		return;
		
		
	int calcRectArea(int r) {
		return r*r;
	}
	
	int calcRectArea(int width, int height) {
		return width*height;
	}
	
	int calcRectArea(int ceil, int floor, int height) {
		return (ceil + floor)*height/2;
	}
	
	
	
	

}
