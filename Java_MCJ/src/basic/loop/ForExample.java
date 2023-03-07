package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
//		int i = 1;
//		int total = 0;
//		while (i<=10) {
//			total += i;
//			i++;
//		}
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
					
		} 
		System.out.println(total);
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력하세요
		
		for(int x=1; x<=200; x++) {
			if(x%6 == 0 && x%12 != 0) {
				System.out.print(x + " ");
			}
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구하세요
		int count = 0;
		for(int i=1; i<=60000; i++) {
			if(i%177 == 0) {
				count++;
			}
		}
		System.out.print(count + "개\n");
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요
		//팩토리얼) 5! = 5*4*3*2*1
		
		Scanner sc =new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int	n = 1; 
//		for(int i=1; i<=num; i++) {
//		n *= i;
//		}
		
		for(int i=num; i>=1; i--) {
			n *= i;
		}
		System.out.printf("%d!: %d\n",num,n);
		sc.close();
	}

}










