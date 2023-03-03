package oop.inherit.good;

/*
 # 자식 클래스, 하위 클래스(Child class, Sub class)
 
 - 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
  자식 클래스라고 합니다.
  
 - 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에 
  키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.
 */


public class Warrior extends Player {

	int rage;
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
}
