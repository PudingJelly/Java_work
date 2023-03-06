package oop.this_super;

public class MainClass {

	public static void main(String[] args) {
	
		Player p1 = new Player();
		p1.name = "전사1";
//		System.out.println("p1의 주소값: " + p1);
		p1.characterInfo();
		System.out.println("=======================");
		
		Player p2 = new Player("전사2"); 
//		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println();
		
		Player p3 = new Player("전사3",200);
		p3.characterInfo();
			

	}

}
