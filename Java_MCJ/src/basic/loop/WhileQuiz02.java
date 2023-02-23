package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
	public static void main(String[] args) {

		//입력받은 수의 약수의 총합을 구하세요.
		//입력받은 값: 12 -> 1 2 3 4 5 12 ->
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력받은 값: ");
		int num = sc.nextInt();
		
		int a = 1, b = 0, c = 0;
		while(a <= num) {
			
			if(num % a == 0) {
				c = a + b;
				
				System.out.print(c + " ");
			}
			a++;
		}
		System.out.println();
		System.out.printf("입력받은 값의 약수의 총 합: %d", b);
		

		



	}
}




