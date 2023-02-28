package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
	
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		
//		//게임인원 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임 인원(2 ~ 4)--> ");
		int playerNum = sc.nextInt();
		
		if(playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");
			return; //main 함수 종료.
		}
				
		
//		System.out.print("게임 인원을 입력하세요(2~4): \n");
//		System.out.print("> ");
//		int playNum = sc.nextInt();
//		int playcnt = playNum; //참가자 수를 세기 위한 변수 등록
//		int[] playNums = new int[playNum];  //참여 인원 등록을 위한 배열의 크기
		
//		if(playNum<2 && playNum>4) {
//			System.out.println("2~4명의 숫자를 입력하세요");
//		}
		
		//플레이어 이름 등록하고
		//배열을 하나 생성하여 플레이어들을 배치하시면 됩니다.
		//배열의 크기는 게임 참가자의 수와 동일합니다.
		
		System.out.println("\n플레이어의 이름을 등록할게요.");
		String[] players = new String[playerNum];
		for(int i=0; i<playerNum; i++) { // i<players.length; 사용 가능
			System.out.printf("%d번 플레이어 이름: ",i+1);
			players[i] = sc.next();
		}
		System.out.println(Arrays.toString(players) + " 참가!");
			
//		String[] names = new String[playNum]; //참여인원 이름 등록
//		for(int i=0; i<playNum; i++) {
//			System.out.printf("%d번째 참가자 이름을 입력하세요: \n",i+1);
//			System.out.print("> ");
//			String name = sc.next();
//			names[i]=name;	
//
//		} 
//		System.out.println(Arrays.toString(names));
//		
//		//실탄 개수 입력(1미만이면 안되고, 5초과도 안됩니다.)
		System.out.print("\n실탄 개수를 입력하세요.(6미만): ");
		int bullet = sc.nextInt();
		if(bullet < 1 || bullet > 5) {
			System.out.println("실탄수가 올바르지 않습니다. 게임을 종료합니다.");
			return;
		}
			
//		System.out.printf("실탄 개수를 입력하세요 (1~5): \n");
//		System.out.print("> ");
//		int bullet = sc.nextInt();
//		int bNums = bullet; //남은 총알의 개수를 세기 위한 변수 설정
//		if(bullet<1 && bullet>5) {
//			System.out.println("실탄 개수를 잘못 입력하였습니다.");
//		}
		
		//실탄을 탄창에 배치합니다.
		//난수를 생성하여 실탄을 탄창에 배치합니다.
		//false -> true로 바꾸는것이 실탄 장전입니다.
		//난수는 중복으로 발생할 가능성이 있기 때문에 중복 방지 로직을 세워서
		//같은 위치에 2개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		
//		boolean[] bulletPos = new boolean[6];
		boolean[] bulletPos = new boolean[6];
		int checkNum = 0; //실탄을 정확하게 장전한 횟수.
		while(checkNum < bullet) {
			int position = (int)(Math.random()*bulletPos.length);
			if(bulletPos[position]) {
				continue; // while문에서의 continue는 조건식이 발동 (for문은 증감식이 발동)
			} else {
				bulletPos[position] = true;
				checkNum++;
			}
		} //총알 배치 끝.

//		System.out.println(Arrays.toString(bulletPos));
		
//		for(int i=0; i<bullet; i++) {
//			int rn = (int)(Math.random()*5);
//			for(int j=0; j<bullet; j++) {
//				if(bulletPos[rn] == true) {
//					i--;
//					break;
//				} else {
//					bulletPos[rn]=true;
//					break;
//				}
//			}
//		}
		
//		System.out.println(Arrays.toString(blackPos));
//		System.out.println(blackPos.length);
		
		
		//실행 순서 정하기
		//난수를 이용하여 실행순서를 정합니다.
		//시작 인덱스를 난수로 정해서 돌아가게 해도 되고
		//아예 배치를 섞어도 상관없습니다.
		int startIdx = (int)(Math.random()*playerNum);
		System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n", players[startIdx]);
		
		
//		System.out.println("러시안 룰렛을 시작합니다.");
//		while(true) {
//			for(int i=0; i<names.length; i++) {
//				System.out.printf("%s님 차례입니다.\n",names[i]);
//				System.out.println("엔터를 누르면 시작합니다.");
//				String a = sc.nextLine();
//				System.out.println("빵!!");
//				if(bulletPos[i]==true) {
//					System.out.printf("%s님은 사망하셨습니다.\n",names[i]);
//					names[i]=names[i+1];
//					bulletPos[i]=bulletPos[i+1];
//					bNums--;
//					playcnt--;
//					break;
//				} else {
//					System.out.println("생존하였습니다.");
//					break;
//				}
//			}
//			
//		}
//	
//		System.out.println(Arrays.toString(names));
//		System.out.println(Arrays.toString(bulletPos));
			
		//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		//이 입력값은(enter)은 받아서 활용할 것이 아니기 때문에
		//따로 변수를 선언하지 않습니다.
		sc.nextLine();
		
		//최후의 1인이 남을 때까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때까지 게임을 진행해 주세요.
		//총알을 소모하면 true값을 false로 변경해 주세요.
		//사람이 한명 아웃되면 배열의 크기를 줄여주세요.
//		boolean flag = false;
		
		int realBulletPos = 0;
		while(true) {
			
			System.out.printf("\n\n[%s의 턴입니다!]\t탄창을 장전했습니다.\n",players[startIdx]);
			System.out.println("# 엔터를 누르면 격발합니다!");
			sc.nextLine();
			
			if(bulletPos[realBulletPos]) { //총알 격발!
				System.out.printf("\n빵!!!\n[%s]님이 사망하였습니다\n",players[startIdx]);
				bullet--;
				playerNum--;
				bulletPos[realBulletPos] = false; //총알이 소모되었으니 false로 변경.
				
				//지금 죽은 사람 기준으로 뒤에 있는 값을 한칸씩 땡기는 작업
				for(int i=startIdx; i<players.length-1; i++) {
					players[i]=players[i+1];
				}
				
				String[] temp = new String[players.length-1]; //new String[playerNum];
				
				for(int j=0; j<temp.length; j++) {
					temp[j] = players[j];
				}
				players = temp; temp = null;
				System.out.println("생존인원: " + Arrays.toString(players));
				
				if(players.length == 1) {
					System.out.println("최종 생존자는: " + players[0]);
					System.out.println("게임을 종료합니다.");
					break;
				} else if(bullet == 0) {
					System.out.println("총알이 다 떨어졌습니다");
					System.out.println("최종 생존자는: " + Arrays.toString(players));
					System.out.println("게임을 종료합니다.");
					break;
				} else {
					System.out.println("남은 인원이 게임을 재개합니다.");
					System.out.println("# 엔터를 눌러주세요!");
					
					sc.nextLine();
				}
				
			} else { //false였기에 생존!
				System.out.println("휴... 살았습니다.");
				startIdx++;
			}
			
			//플레이어가 생존 할 때마다 startIdx의 값을 하나씩 올리고 있는데.
			//맨 마지막 사람까지 생존했을 경우에는 다음 차례가 첫번째 사람이기 때문에
			//인덱스를 0으로 바꿔서 배열 맨 앞사람이 순서를 가질 수 있도록 처리.
			if(startIdx == playerNum) {
				startIdx = 0;
			} 
			realBulletPos++;
			System.out.println("참가자: " + players[startIdx]);
//			System.out.println("참가자: " + players[startIdx]);
		}
		sc.close();	
	}

}
