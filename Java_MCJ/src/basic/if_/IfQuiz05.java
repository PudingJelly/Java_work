package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		/*
		 # 국어, 영어, 수학 점수를 각각 입력 받아서
		   평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		   평균이 90점이 넘는다면, 다시 한 번 조건을 검사해서
		   95~100 → A+
		   94~90 → A0
		   80점대는 B, 70점대는 C, 60점대는 D, 나머지는
		   모두 F 처리하시면 됩니다. (100점이 만점)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("국어: ");
		int ko = sc.nextInt();
		System.out.print("영어: ");
		int en = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();

		double avg = (double)(ko + en + math) / 3;
		
		String grade;
		
		if(avg>=90) {
//			if(avg>100){
//           system.out.print("잘못된 점수입니다.");
//		    }
			
			if(100 >= avg && avg >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if(avg >= 80) {
			grade = "B";
		} else if(avg >= 70) {
			grade = "C";
		} else if(avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("==============================");
		System.out.printf("평균 점수는 %.1f 입니다.\n",avg);
		System.out.println("당신의 학점은 " + grade + "입니다.");
		System.out.println("==============================");
				
	sc.close();

	}

}













