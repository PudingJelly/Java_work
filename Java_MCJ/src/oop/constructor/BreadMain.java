package oop.constructor;

public class BreadMain {
/*
 - 객체를 생성하지 않았을 때의 예시를 보고
  빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
  클래스 이름은 Bread로 통일 하겠습니다.
  
  - BreadMain에서 똑같이 피자빵, 초코케이크의 정보를
  호출 해보세요. (생성자는 여러분들 맘대로~)
 */
	
	
	public static void main(String[] args) {
	
		Bread pizza = new Bread();
		pizza.name = "피자빵";
		pizza.ingredient = "토마토소스, 페퍼로니";
		pizza.price = 500;
		pizza.showInfo();
		
//		Bread pizzaBread = new Bread("피자빵", "토마토소스, 페퍼로니", 500);
//		pizzaBread.showInfo();
				
		Bread chocoCake = new Bread("초코케이크", "밀가루, 초콜렛", 1500);
		chocoCake.showInfo();

	}

}
