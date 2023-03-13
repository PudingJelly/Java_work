package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {

	static Random r = new Random();
	static int prizel1 = 0; // 1등 당첨 횟수를 세 줄 변수
	static int prizel2 = 0; // 2등 당첨 횟수를 세 줄 변수
	static int prizel3 = 0; // 3등 당첨 횟수를 세 줄 변수
	static int prizel4 = 0; // 4등 당첨 횟수를 세 줄 변수
	static int prizel5 = 0; // 5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; // 꽝 당첨 횟수를 세 줄 변수


	public static List<Integer> creatLotto(){
		/*
		 1~45 범위의 난수 6개를 생성하여
		 컬렉션 자료형에 모아서 리턴해 주세요.
		 무엇을 쓰든 상관하지 않겠습니다.
		 중복이 발생하면 안됩니다.
		 */

		Set<Integer> wins = new HashSet<>();
		while(wins.size() < 6) {
			int num = r.nextInt(45)+1;
			wins.add(num);
		}
		List<Integer> list = new ArrayList<>(wins);
		Collections.sort(list);
		return list;
	} //로또번호 생성

	//보너스 번호를 생성하는 메서드
	public static int creatBonusNum(List<Integer> wins) {
		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받은 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아주세요.
		  범위는 1~45 사이의 난수입니다.
		 */
		Set<Integer> bonus = new HashSet<>();
		while(true) {
			int bonusNum = r.nextInt(45)+1;
			if(!wins.contains(bonusNum)) {
				return bonusNum;
			}
		}
	}// 보너스번호 생성

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNum(List<Integer> wins, List<Integer> buyLottos, int bonusNum) {
	/*
	 매개값으로 당첨번호집합, 구매한 로또번호집합, 보너스번호를 받습니다.
	 내 로또 번호와 당첨번호를 비교하여
	 일치하는 횟수를 세 주신 후 등수를 판단하세요.
	 판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
	 6개 전부 일지 -> 1등
	 5개일치 + 보너스번호 일치 -> 2등
	 5개번호만 일치 -> 3등
	 4개번호만 일치 -> 4등
	 3개번호만 일치 -> 5등
	 나머지 -> 꽝
	 */
				
		int count=0;

		for(int i=0; i<wins.size(); i++) {
			for(int j=0; j<buyLottos.size(); j++) {
				if(buyLottos.get(i).equals(wins.get(j))) {
					count++;
				}
			}
		}//구매한 로또가 당첨번호가 몇개 맞았는지 확인 위한 반복문 종료

		if(count == 6) prizel1++; // 6개 맞았을 경우 1등 당첨 횟수 카운트

		else if (count == 5) {
			boolean flag = false;
			for(int i=0; i<buyLottos.size(); i++) {
				if(buyLottos.get(i) == bonusNum) {
					flag = true; prizel2++;
				}
			} //5개+보너스 2등 당첨 횟수 카운트
			if(!flag) prizel3++;  
		} // 5개만 맞았을 때 3등 당첨 횟수 카운트
			
			else if (count == 4) prizel4++; // 4개 맞았을때 4등 당첨 횟수 카운트  
			else if (count == 3) prizel5++; // 3개 맞았을 때 5등 당첨 회수 카운트
			else failCnt++; // 3개 미만일 때  당첨X 횟수 카운트
	}
	
	public static void main(String[] args) {

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정
		//보너스번호도 하나 고정시키세요.
		
		List<Integer> winNum = creatLotto(); //당첨 번호 고정
		int bonusNum = creatBonusNum(winNum); //보너스 번호 고정
				
		long buy = 1; // 구매개수 확인 위한 변수 설정
		while(true) {
			/*
			 - 1등이 당첨 될 때까지 반복문을 돌립니다.
			 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
			  반복문을 종료합니다.
			 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */
			System.out.println(buy + "번째 로또 구매중");
			List<Integer> buyLottos = creatLotto();
			checkLottoNum(winNum, buyLottos, bonusNum);
			if(prizel1 == 1) {
				System.out.println("1등 당첨!");
				System.out.println("2등 당첨 횟수: " + prizel2);
				System.out.println("3등 당첨 횟수: " + prizel3);
				System.out.println("4등 당첨 횟수: " + prizel4);
				System.out.println("5등 당첨 횟수: " + prizel5);
				System.out.println("꽝 당첨 횟수: " + failCnt);
				System.out.println("1등 당첨되기 위해 구매한 로또 수량 : " + buy + "장");
				System.out.println("1등이 나올 때까지 사용한 금액: " + (long)buy*1000 + "원");
				break;
			}
			buy++;
		}
	}
}


