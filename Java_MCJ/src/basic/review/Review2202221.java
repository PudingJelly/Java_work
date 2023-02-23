package basic.review;

public class Review2202221 {

	public static void main(String[] args) {
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int j = 1;
		int count = 0;
		
		while(j <= 30000) {
			if(j % 258 == 0) {
				count++;
			}
			j++;
		}
		System.out.println("1~30000중 258의 배수의 개수: " + count);
		
		
		//1000의 약수의 개수를 구하시오
		
		int k = 1;
		int cnt = 0;
		
		while(k <= 1000) {
			if(1000 % k == 0) {
				cnt++;
			}
			k++;

		}
		
		System.out.printf("1000의 약수의 개수는 %d개\n", cnt);
		

	}

}
