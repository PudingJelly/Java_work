package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 1. 주민등록번호 13자리를 입력받습니다.
		 2. 주민등록번호는 -을 포함하여 받을 예정입니다.
		 3. 13자리가 아니라면 다시 입력 받습니다.
		 4. 남자인지 여자인지를 구분해서 출력 해주세요.
		 */


		Scanner sc = new Scanner(System.in);
		
		outer: while(true) {
			System.out.println("주민등록번호 13자리를 입력해주세요");
			System.out.print("> ");
			String ssn = sc.next();
		
			ssn = ssn.replace("-", "");
		
			if(ssn.length() != 13) {
				System.out.println("주민등록 번호는 13자리 입니다.");
			} else {
				switch(ssn.charAt(6)) {
				
				case '1': case '3':
					System.out.println("남자입니다.");
					break outer;
					
				case '2': case '4':
					System.out.println("여자입니다.");
					break outer;
					
				default:
					System.out.println("잘못 입력 하였습니다.");
				}
			}
		}
		sc.close();
		
		
//		String nums;
//		while(true) {
//			System.out.println("주민등록번호 13자리를 '-' 포함하여 입력해주세요");
//			System.out.print("> ");
//			nums = sc.next();
//
//			if(nums.length() != 14) {
//				System.out.println("13자리가 아닙니다 다시 입력 해주세요");
//				continue;
//			} else {
//				System.out.println("주민등록 번호가 등록되었습니다.");
//			}
//			char pn = nums.charAt(7);
//
//			if('1' == pn || '3' == pn){
//				System.out.println("남자입니다.");
//				break;
//			} else if ('2' == pn || '4' == pn) {
//				System.out.println("여자입니다.");
//				break;
//			} else {
//				System.out.println("주민등록 번호가 잘못 되었습니다.");
//				break;
//			}
//		}
//		sc.close();
	}

}
