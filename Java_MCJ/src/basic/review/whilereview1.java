package basic.review;

public class whilereview1 {

	public static void main(String[] args) {


		//1 ~ 100 사이의 정수 중 7의 배수의 가로로 출력해 보세요.
		//7의 배수의 합 및 개수를 구하시오.
		//(1부터 숫자를 하나씩 올려가면서 7의 배수 판별을 반복하면 됨)

		int a = 1, b = 0, c = 0;

		while(a<=100) {
			if(a%7==0) {
				b+=a;
				c++;
				System.out.print(a+" ");
			} 
			a++;
		}
			System.out.println();
			System.out.println(b);
			System.out.println("7의 배수의 개수: " + c + "개");


	}
}