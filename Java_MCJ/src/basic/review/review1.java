package basic.review;

import java.util.Scanner;

public class review1 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 연산자가 잘못 입력 되었다면 연산자를 똑바로 입력하라고
		 결과를 말씀 해 주세요.
		 
		 정수1: 78
		 연산을 선택하세요 [ +, -, *, /]
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int a = sc.nextInt();
		
		System.out.print("연산자를 선택하세요 [+, -, *, /]: ");
		String c = sc.next();
		
		System.out.print("정수2: ");
		int b = sc.nextInt();

		switch(c) {
		
		case "+":
			System.out.printf("%d %s %d = %d", a,c,b,a+b);
			break;
		case "-":
			System.out.printf("%d %s %d = %d", a,c,b,a-b);
			break;
		case "*":
			System.out.printf("%d %s %d = %d", a,c,b,a*b);
			break;
		case "/":
			if(b == 0) {
				System.out.println("연산 할 수 없습니다");
				break;
			}
			System.out.printf("%d %s %d = %d", a,c,b,a/b);
			break;
		default:
			System.out.println("사칙연산 기호를 제대로 입력하세요");
		}
		sc.close();
		

	}

}
