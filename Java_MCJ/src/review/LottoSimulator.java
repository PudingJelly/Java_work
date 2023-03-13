package review;

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


	public static int creatLotto(){
		/*
		 1~45 범위의 난수 6개를 생성하여
		 컬렉션 자료형에 모아서 리턴해 주세요.
		 무엇을 쓰든 상관하지 않겠습니다.
		 중복이 발생하면 안됩니다.
		 */
		//etc.util.random.LottoSimulator 참조
	} 
	//보너스 번호를 생성하는 메서드
	public static int creatBonusNum(???) {
		/*
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받은 후
		  당첨번호들을 피해서 보너스번호 하나만 뽑아주세요.
		  범위는 1~45 사이의 난수입니다.
		 */
	}

	//당첨 등수를 알려주는 메서드
	public static void checkLottoNum(???, ???, ???) {
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
	}		
}


