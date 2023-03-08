package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	
	Player() {
		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name) {
		this(); // 같은 클래스의 다른 생성자를 호출하는 문법.
		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name;
	}
		
	Player(String name, int hp){
		this(name); 
		System.out.println("Player의 3번 생성자 호출!");
		this.hp = hp;
	}
		
	void attack(Player target) {
//		System.out.println("target: " + target);
//		System.out.println("this: " + this);
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
			
		System.out.printf("%s이(가) %s을(를) 공격합니다.\n",this.name,target.name);
			
		target.hp -= 10; 
		this.hp += 5;
		System.out.printf("나의 체력: %d, 상대의 체력: %d\n",this.hp,target.hp);
	}

	void characterInfo() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
//		System.out.println("지금 이 메서드를 호출한 객체의 이름: " + this.name);
	}
}
