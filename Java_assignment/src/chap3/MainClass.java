package chap3;

public class MainClass {

	public static void main(String[] args) {

		/*
		  > MyCart 클래스를 완성시킨 후에 MyCart 객체를 생성합니다. 초기 금액은 2100원으로 지정합니다.
		 
		  MyCart 객체의 buy 메서드를 호출하여 tv, radio, computer 객체들을 전달해 보세요. 
		  모든 물건들이 제대로 담기는 지 확인 후 카트 내부 정보를 출력하면 됩니다.
		 
		  그 후에, MyCart의 소지금을 적게 설정하여 금액이 부족할 시 물건이 담기지 않는지도 확인해 보세요.
		 */

		MyCart mc = new MyCart(2100);
		Product Tv = new Tv();
		Product Radio = new Radio();
		Product Computer = new Computer();
		
		mc.Buy(Computer);
		mc.Buy(Tv);
		mc.Buy(Radio);

	}

}
