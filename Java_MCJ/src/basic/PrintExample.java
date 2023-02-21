package basic;

public class PrintExample {

	public static void main(String[] args) {

		//자바의 표준 출력 방식은 크게 3가지
		//1. 개행(줄바꿈)을 포함하지 않는 print() 문장 출력 후 커서가 바로 뒤에 위치
		//2. 자동으로 개행(줄바꿈)을 포함해 주는 println() 문장 출력 후 커서가 다음 줄에 위치
				
		System.out.print("안녕하세요");
		System.out.println("Hello~");
		System.out.print("안녕히 가세요\n");
		System.out.println("bye bye~~~");
		
		//3. 형식 지정 표준 출력 함수 printf()
		//서식 문자를 이용해서 문자열을 완성시킨 후,
		//서식 문자에 들어갈 값을 지정해서 출력하는 방식.
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
		//12월 25일은 크리스마스 입니다.
				
		System.out.println(month + "월 " + day + "일은 "+ anni + " 입니다");
		System.out.printf("%d월 %d일은 %s 입니다 \t\n", month, day, anni);
		
		/*
		 # 포맷팅 서식 문자 종류
		 %d: 부호가 있는 정수 데이터 (decimal)
		 %f: 실수 데이터 (floation point)
		 %s: 문자열 (String)
		 
		 # 탈출 코드 (escape code) → printf에만 동작하는게 아님
		 - 반드시 따옴표(문자열) 내에 위치해야 한다
		 - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호이다
		 \n: 줄 개행 명령
		 \t: 가로 공백 (스페이스 4칸의 가로 공백)
		 */
		
		//실수를 포현하는 서식문자 %f
		//%.[자리수를 지정하는 숫자]f → 원하는 자리수까지 표현
		//%라는 문자 자체를 표현할 때는 %% 쓰면 된다
		double rate = 64.126;
		System.out.printf("합격률은 %.3f%% 입니다", rate);
		
		
		
		
	}

}
