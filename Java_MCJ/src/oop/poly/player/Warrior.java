package oop.poly.player;




public class Warrior extends Player {

	int rage;
	
	Warrior(String name){
		// 모든 객체 생성자에는 super()가 내장되어 있다.
		// 자식 객체가 생성 될 때는 부모의 객체도 생성이 되어야 
		// 부모의 속성과 기능이 실존하게 되고, 물려 줄 수가 있기 때문입니다.
		super(name);
		this.rage = 60;
	}
	
	public void rush(Player target) {
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 
		 - rush의 대상은 모든 직업들 입니다.
		 
		 - 만약 rush의 대상이 전사라면 10의 피해를 받고,
		  마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
		  
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
		 
		 - 남은 체력도 출력해 주세요.
		 
		 - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
		 */
//		if(this == target) {
//			System.out.println("자기자신에게는 사용할 수 없습니다.");
//			return;
//		}
//		System.out.printf("%s이(가) %s에게 돌진을 사용합니다.\n",this.name,target.name);
//		
//		if(target instanceof Warrior) {
//			target.hp -= 10; 
//			System.out.printf("나의 체력: %d, 상대의 체력: %d\n",this.hp,target.hp);
//			
//		} else if (target instanceof Mage) {
//			target.hp -= 20; 
//			System.out.printf("나의 체력: %d, 상대의 체력: %d\n",this.hp,target.hp);
//		
//		} else if (target instanceof Hunter) {
//			target.hp -= 20; 
//			System.out.printf("나의 체력: %d, 상대의 체력: %d\n",this.hp,target.hp);
//		}
		
		System.out.printf("%s님이 %s님에게 돌진을 사용하였습니다\n",this.name,target.name);
		if(target instanceof Warrior) {
			target.hp -= 10; 
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n",target.name);
			
		} else if (target instanceof Mage) {
			target.hp -= 20; 
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n",target.name);
		
		} else if (target instanceof Hunter) {
			target.hp -= 15; 
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n",target.name);
			
		}
		System.out.printf("%s님의 남은 체력은 %d 입니다.\n",target.name,target.hp);
		System.out.println("=================================");
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	
	
		
	
	
}
