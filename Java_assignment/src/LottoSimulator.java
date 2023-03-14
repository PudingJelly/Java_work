

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
		
		Set<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			int num = r.nextInt(45)+1;
			lotto.add(num);
		}
		List<Integer> winNum = new ArrayList<>(lotto);
		Collections.sort(winNum);
		return winNum;
	} //로또번호 생성 및 정렬 끝.
	
	//보너스 번호를 생성하는 메서드
	public static int creatBonusNum(List<Integer> winNums) {
		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받은 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아주세요.
		  범위는 1~45 사이의 난수입니다.
		 */
		
		Set<Integer> bonus = new HashSet<>();
		while(true) {
			int bonusNum = r.nextInt(45)+1;
			if(!winNums.contains(bonusNum)) 
				return bonusNum;
		}
	}//보너스 번호 생성 끝.

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNum(List<Integer> winNums, 
			List<Integer>buyNums, int bonus) {
		
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
		int count = 0; // 몇개가 당첨 되었는지 확인 해 줄 변수
		for(int i=0; i<winNums.size(); i++) {
			if(winNums.get(i).equals(buyNums.get(i))){
				count++;
			}
		}//당첨번호와 구매한 로또의 번호 일치 갯수 확인
		
		if(count == 6) prizel1++; //6개 1등
		
		else if(count == 5) {
			boolean flag = false;
			for(int i=0; i<buyNums.size(); i++){
				if(buyNums.get(i) == bonus){
					flag = true; prizel2++;
				}
			}// 5개+보너스 2등
			if(!flag) prizel3++; //5개 3등
		} 
		
		else if(count == 4) prizel4++; //4개 4등
		else if(count == 3) prizel5++; //3개 5등
		else failCnt++; //꽝
	}
	
	public static void main(String[] args) {

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정
		//보너스번호도 하나 고정시키세요.
				
		/*
		 - 1등이 당첨 될 때까지 반복문을 돌립니다.
		 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
		  반복문을 종료합니다.
		 - 로또를 구매하기 위한 금액도 출력하세요. (long)
		 */
		List<Integer> winNums = creatLotto(); //당첨 로또 번호 고정
//		System.out.println(winNums); 당첨 번호 생성 확인용
		
		int bonusNum = creatBonusNum(winNums); //보너스 번호 고정
//		System.out.println(bonusNum); 보너스 번호 생성 확인용
		long buyCheck = 0; // 로또 구매 횟수 확인을 위한 변수 설정
		long buyMoney = 0; // 로또 구매 가격 확인을 위한 변수 설정
		
		while(true) {
			System.out.println(buyCheck + 1 + "번째 로또 구매");
			List<Integer> buyLottos = creatLotto(); //로또번호 생성(구매)
			checkLottoNum(winNums, buyLottos, bonusNum); //구매한 로또 당첨 확인
			buyCheck++;	//구매횟수 카운팅		
			buyMoney += 1000;
			
			if(prizel1 == 1) {
				System.out.println("=============================");
				System.out.println(winNums); //당첨번호 확인용
				System.out.println("보너스번호: " + bonusNum); //보너스 번호 확인용
				System.out.println(buyLottos); //구매한 로또 번호 확인용
				break;
			}  
		} //1등이 나오기까지 무한 구매 후 1등이 나오면 반복문 종료 끝.
		
		System.out.println("1등 당첨!!!!");
		System.out.println("2등 당첨 횟수: " + prizel2 + "회");
		System.out.println("3등 당첨 횟수: " + prizel3 + "회");
		System.out.println("4등 당첨 횟수: " + prizel4 + "회");
		System.out.println("5등 당첨 횟수: " + prizel5 + "회");
		System.out.println("꽝 당첨 횟수: " + failCnt + "회");
		System.out.println("1등이 나오기까지 로또 구매 수량: " + buyCheck + "장");
		System.out.println("1등이 나오기까지 로또 구매 금액: " + buyMoney + "원");
	}		
}


