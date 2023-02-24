package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		   지속적으로 문제를 출제한 후 정답을 입력받으세요.
		   사용자가 0을 입력하면 반복문을 탈출시키세요.

		   2. 종료 이후에 정답 횟수와 오답 횟수를 입력하세요

		 *** 연산 퀴즈 ***
		   #종료하시려면 0을 입력해 주세요.
		   27 + 22 = ???
		   >49
		   정답입니다!
		   79 - 36 = ???
		   >43
		   정답입니다!
		   93 + 25 = ???
		   >88
		   오답입니다!
		 */
		Scanner sc = new Scanner(System.in);
//
//		int a = (int)(Math.random()*100+1);
//		int b = (int)(Math.random()*100+1);
//		int c = (int)(Math.random()+2);
//		int result = 0;
//		int cnt1 = 0;
//		int cnt2 = 0;
//		
//		System.out.println("*** 연산 퀴즈 ***");
//		System.out.println("#종료하시려면 0을 입력해 주세요.");
//		System.out.printf("%d",a);
//		
//		while(true) {
//			if(c==0) {
//				System.out.print(" + ");
//				result = a+b;
//			} else {
//				System.out.print(" - ");
//				result = a-b;
//			} 
//			System.out.printf("%d = ???\n",b);
//			System.out.print("> \n");
//			int answer = sc.nextInt();
//			
//			if(answer==result) {
//				System.out.println("정답입니다!");
//				cnt1++;
//			} else if(answer!=result) {
//				System.out.println("오답입니다!");
//				cnt2++;
//			} else if(answer==0) {
//				System.out.printf("정답개수= %d",cnt1);
//				System.out.printf("오답개수= %d",cnt2);
//				break;
//			}
//		} 
		
		int cCount = 0;
		int iCount = 0;
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		while(true) {
			int rn1 = (int)((Math.random()*100)+1);
			int rn2 = (int)((Math.random()*100)+1);
			int rn3 = (int)(Math.random()*2);
			int correct;
			
			if(rn3 == 0) {
				System.out.printf("%d + %d = ???\n",rn1,rn2);
				correct = rn1+rn2;
			} else {
				System.out.printf("%d - %d = ???\n",rn1,rn2);
				correct = rn1-rn2;
			}
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == correct) {
				System.out.println("정답입니다!");
				cCount++;
			} else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("오답입니다!");
				iCount++;
			}
			
			
		}
		System.out.printf("================================\n");
		System.out.printf("정답 횟수: %d 회\n", cCount);
		System.out.printf("오답 횟수: %d 회\n", iCount);
		
		sc.close();
		




	}

}
