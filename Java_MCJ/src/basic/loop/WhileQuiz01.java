package basic.loop;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력
		
		
		//1000의 약수의 개수를 구하세요
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int n = 1;
		int c = 0;
		while(n<=30000) {
			
			if(n % 258 == 0) {
				c++;
			} 
			n++;	
		}
		System.out.print(c + "개");
		System.out.println();
		
		int a = 1, b = 0;
		while(a <= 1000) {
			if(1000 % a == 0) {
				b++;		
			}a++;
		}
		System.out.println(b);
		
		//1000의 약수의 개수와 합
		int d = 1, e = 0, f = 0;
		while(d<=1000) {
			if(1000 % d == 0) {
				e = e + d;
				f++;
			}
			d++;
		}
		System.out.println("약수의 합은 " + e);
		System.out.println("약수의 개수는 " + f);
		

	}

}
