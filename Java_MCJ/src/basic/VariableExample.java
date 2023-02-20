package basic;

public class VariableExample {

	public static void main(String[] args) {
		/*
		  # 변수 (Variable)
		  
		  1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		  2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라서 
		     적당한 데이터 타입을 선언해야 합니다.
		  ex) int: 4바이트의 정수, string: 문자열(문장)
		  3. 변수는 동일한 이름으로 중복 선언 할 수 없다.
		  4. 변수 내부의 값은 언제든지 변경이 가능하다.		  
		 */

		//변수의 선언: [자료형(데이터 타입)] [변수명]
		int age;
		
		//변수의 초기화: [변수명] = [값];
		age = 40;
		//"=": 할당한다라는 뜻으로 사용
		//좌측은 영역, 우측은 데이터(값)
		
		//변수의 값 참조(사용)
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 할 수 있다.
		//(처음 만들 때 한번만 가능)
		int score = 90;
//		int score = 95; 이건 실행 불가(변수의 중복선언 허용 되지 않음)
		//변수는 하나당 값을 하나밖에 가지지 못하기 때문에
		//기존값은 소멸하고 새로운 값이 할당 된다.
		score = 95;
		System.out.println(score);
		
		//변수에는 다른 변수의 값도 저장이 가능함.
		int myScore = score - 20;
		System.out.println(myScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능함.
//		int count = "한번" (문자이므로 불가능함)
//		int count = 23.5; (정수가 아닌 실수이므로 불가능함)
//		String str = 100; (문자가 아닌 숫자이므로 불가능함)
		
		//변수는 자료형(데이터타입)이 달라도 이름이 동일하다면
		//중복 선언 할 수 없다.
		String name = "홍길동";
//		int name = 1004; (이름이 동일하여 불가능)
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능함.
//		int result = myScore + num; (X)
		int result;
//		System.out.println(result); (X)
		
		
		
	}

}
