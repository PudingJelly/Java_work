package review;

public class Review220223 {

	public static void main(String[] args) {

		//		int i = 1;
		//		int total = 0;
		//		while (i<=10) {
		//			total += i;
		//			i++;

		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
		}
		System.out.println(total);

		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력하세요

		for(int a=1; a<=200; a++) {
			if(a%6 == 0 && a%12 != 0) {
				System.out.print(a + " ");
			}
		}


		//1~60000까지의 정수 중 177의 배수의 개수를 구하세요

		int count = 0;
		for(int a=1; a<=60000; a++) {
			if(a%177==0) {
				count++;
			}
		}
		System.out.println();
		System.out.println(count + "개");
		System.out.println("========================================");

		//입력받은 정수까지의 팩토리얼 값을 구하세요
		//팩토리얼) 5! = 5*4*3*2*1

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요: ");

//		int num = sc.nextInt();
//		int i = 1;
//		for(int n=1; n<=num; n++) {
//			i *= n; //i = i*n
//		}
//		System.out.println(i);
//
//		for(int n=num; n>=1; n--) {
//			i*=n;// i= i*n
//		}
//		System.out.println(i);


		//2~19까지의 난수를 생성하셔서 구구단을 출력해보세요. (for)
		//19행까지 출력하세요.

		int rn1 = (int)(Math.random()*18+2);
		int f = 0;
		for(int a=1; a<=19; a++) {
			f = rn1*a;
			System.out.printf("%dx%d=%d\n",rn1,a,f);
		}

	}

}
