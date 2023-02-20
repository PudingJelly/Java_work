package basic;

public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙(안 지킬 시 에러 발생 할 수 있음)
		//1. 식별자의 이름은 중복을 허용하지 않는다.
		//그리고, 대/소문자를 철저하게 구분한다.
		//관례적으로 숫자는 소문자, class는 대문자
		
		int age = 35;
//		int age = 40; (X)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자의 이름은 숫자로 지정하거나 숫자로 시작하면 안된다.
//		int 700 = 365; (X)
//		int 7number = 7; (X)
		int number7 = 7;
		int num7ber = 7;
		
		//3. 식별자 이름에 공백을 포함 할 수 없다.
//		int my birth day = 19881202; (X) 공백이 들어가면 서로 다른 변수로 작용함
		int mybirthday = 19881202;
		int myBirthDay = 19881202; //camel case
		
		//4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)뿐이나, 사용을 권장하지 않음
		//저 특수문자들은 사용하기로 약속한 곳이 지정되어 있음.
		String $hello_ = "안녕";
					
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능함.
		//키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자이다.
//		String class = "클래스"; (X)
//		String Class = "클래스"; (헷갈리기 때문에 권장하지 않음)
		String className = "클래스";
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능하다.
		//하지만, 사용을 권장하지 않음
		int 숫자 = 10;
		String 明 = "홍길동";
		System.out.println(숫자);
		System.out.println(明);
		
		//변수명 지어주는 사이트 (검색해서 들어가기)
		//자바 데이터타입 (검색해서 들어가기)
		
				
	}

}
