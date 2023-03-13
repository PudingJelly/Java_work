package review;

import java.util.Scanner;

public class Reveiw0224 {

	public static void main(String[] args) {

		String arr[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
				
		for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next(); // 배열에 숫자 입력
            for (int j = 0; j < i; j++) {
 
                if (arr[i].equals(arr[j])) {  // 중복검사
                    System.out.println("중복되는 수 입니다 다시입력하세요.  "
                    		+ "( 중복숫자 " + arr[j] + ")");
                    i--;
                }
            }
        }
        
        System.out.println("당신이 입력한 숫자는  :  ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
		
		sc.close();
		
		
		
		
		
		

	}

}
