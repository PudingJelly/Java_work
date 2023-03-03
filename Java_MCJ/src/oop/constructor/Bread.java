package oop.constructor;

public class Bread {

	String name;
	String ingredient;
	int price;
	
	Bread(){}
	
	Bread(String bName, String bIngredient, int bPrice) {
		name = bName;
		ingredient = bIngredient;
		price = bPrice;
	}
	
	void showInfo() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵이름: " + name);
		System.out.println("주재료: " + ingredient);
		System.out.println("가격: " + price + "원");
		System.out.println("==============================");
	}
	
	
}
