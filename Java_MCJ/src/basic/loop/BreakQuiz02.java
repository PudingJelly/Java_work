package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {

		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
		 */

		Scanner sc = new Scanner(System.in);

		//		System.out.println("# 1부터 100까지의 숫자 중 어떤 수가 설정되었을까요?");
		//		int rn = (int)((Math.random()*100)+1);
		//		int cnt1=0;
		//		
		//		outer: while(true) {
		//			int answer = sc.nextInt();
		//			cnt1++;
		//			if(rn > answer) {
		//				
		//				System.out.println("UP");
		//			} 
		//			else if (rn == answer) {
		//				if(cnt1<=7) {
		//					System.out.println("승리!");
		//					break outer;
		//				}
		//			} else if(rn < answer){
		//				System.out.println("DOWN");
		//				
		//				if(cnt1>7) {
		//					System.out.println("패배! 계속 진행해보세요");
		//				}
		//			} else {
		//				System.out.println("DOWN");
		//				
		//				if(cnt1>7) {
		//					System.out.println("패배! 계속 진행해보세요");
		//				}
		//			}
		//		}
		//		sc.close();



		System.out.println("*** UP & DOWN 게임 ***");
		System.out.println("# 1부터 100까지의 정수 중 어느 숫자가 선택 되었을까요?");

		int secret = (int)((Math.random()*100)+1);
		int count = 0;

		while(true ) {
			System.out.println("> ");
			int answer1 = sc.nextInt();
			count++;

			if(answer1<1 || answer1>100) {
				System.out.println("범위 내에 숫자를 다시 입력하세요!");
				continue;
			}

			if(answer1>secret) {
				System.out.println("DOWN!!");

			} else if(answer1<secret) {
				System.out.println("UP!!");

			} else {
				System.out.println("정답입니다");
				System.out.println(count + "번 만에 맞추셨네요");
				if(count <=7) {
					System.out.println("승리했습니다!");
				} else {
					System.out.println("패배했습니다");
				}
				break;
			}

			if(count<7) {
				System.out.println("정답 입력 기회" + (7-count) + "번 남음!");
			} else {
				System.out.println("정답 기회 모두 소진");
				System.out.println("계속 정답을 맞춰보세요");
			}


		}
		sc.close();












	}
}
