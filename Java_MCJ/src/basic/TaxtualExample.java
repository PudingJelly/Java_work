package basic;

public class TaxtualExample {

	public static void main(String[] args) {
	
		char c1 = 'A'; //단일 문자만 가능, 홑따옴표 사용(쌍따옴표 불가능)
		System.out.println(c1);
				
		char c2 = 65;
		System.out.println(c2);
		
		char c3 = 44032;
		System.out.println(c3); //유니코드에 맞는 문자 표현 
		//char는 2byte 까지만 허용
		/*
		 # 문자열을 저장 할 수 있는 데이터 타입 String
		 - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입.
		 - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
		 기본 데이터 타입처럼 사용(사실은 객체 타입)
		 */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 + s2);
		//자바에서는 문자열의 덧셈 연산을 지원한다.
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출된다.
		
		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같다.
		System.out.println("-----------------------------------------");
		System.out.println(100+100);
		System.out.println("100"+"100");
		System.out.println("100"+100);
		System.out.println(3.14+"hi");
		
		int month = 10;
		int day = 13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 " + month + "월 " + day + "일 입니다.");
		
		
		
		
		
		
				
		
	}
}
