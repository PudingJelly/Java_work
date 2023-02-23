package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		//2~19까지의 난수를 생성하셔서 구구단을 출력해보세요. (for)
		//19행까지 출력하세요.
		
		int rn =(int)((Math.random()*18)+2);
		System.out.println("*** 구구단 " + rn + "단 ***");
				
		int i = 0;
		for(int a=1; a<=19; a++) {
			i = rn * a;
			System.out.printf("%d x %d = %d\n", rn,a,i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}












