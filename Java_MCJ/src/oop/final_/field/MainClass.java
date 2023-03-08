package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
	
		Person kim = new Person("김철수");
		
//		kim.nation = "미국"; name을 final로 지정했기 때문에 할당 자체가 되지 않음
//		kim.name = "김마이클"; 객체가 생성되자마자 필드값(final)을 넣었기 때문에 할당 할 수 없음
		kim.age = 30;
		
		Person park =  new Person("박영희");
//		park.nation = "영국"; (X)
//		park.name = "박영국"; (X)
		
		System.out.println(kim.name);
	}

}
