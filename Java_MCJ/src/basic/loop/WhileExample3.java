package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		/*
		 - 정수 1개를 입력 받아서 해당 정수가 소수(prime number)
		   인지 판별하시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		int a = 1, b = 0;
		while(a <= num) {
			if(num % a == 0) {
				b++;
			} 
			a++;
		} if(b == 2) { // 1은 소수가 아님
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}

		
//		int i = 1; //소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어 볼 변수.
//		int count = 0; //나누어 떨어진 횟수를 기억할 변수.
//		
//		while(i <= num) {
//			if(num % i == 0) {
//				count++;
//			}
//			i++;
//		}
//		
//		if(count == 2) {
//			System.out.println(num + "은(는) 소수입니다.");
//		}
//		else {
//			System.out.println(num + "은(는) 소수가 아닙니다.");
//		}
		
		System.out.println("==============================");
		
		int j = 2; //1은 모든 수의 약수이기 때문에 배제하였음
		while(num % j != 0) {
			j++;
		} 
		
		System.out.println(num == j ? "소수입니다" : "소수가 아닙니다" );
		sc.close();
	}	

}
