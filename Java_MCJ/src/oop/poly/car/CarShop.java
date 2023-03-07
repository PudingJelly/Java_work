package oop.poly.car;

public class CarShop {

	/*
	 - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는 
	  객체인지를 검사할 때 사용하는 연산자 입니다.
	  
	 - intstanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수 있는지를
	  물어봐서 그렇다면 true, 그렇지 않다면 false를 도출 합니다. 
	 */
	
	public void carPrice(Car c) {
		if(c instanceof Sonata) {
			System.out.println("소나타의 가격은 3000만원 입니다.");

		} else if (c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7000만원 입니다.");
			
		} else if (c instanceof Porsche) {
			System.out.println("포르쉐의 가격은 2억4천만원 입니다.");
			
		} else {
			System.out.println("없어 안팔아 사지마");
		}
	}
	
	
	
	
}
