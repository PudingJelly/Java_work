package basic;

public class PlusMinusOperator {

	public static void main(String[] args) {
		
		//증감 연산자 (++,--)
		//변수의 값을 단순히 하나 올리거나 내릴 때 사용한다.
		
		int i = 1;
		int j = i++; //후위 연산 (선연산 후증감)
		int k = i--;
		System.out.println("i의값: " + i);
		System.out.println("j의값: " + j);
		System.out.println("k의값: " + k);
		
		System.out.println("----------------------------------");
		
		int x = 1;
		int y = ++x; //전위 연산 (선증감 후연산)
		int z = --x;
		
		System.out.println("x의값: " + x);
		System.out.println("y의값: " + y);
		System.out.println("z의값: " + z);
		
		int a = 3;
		int b = a++ + 5 * 3;
		System.out.println(b);
		System.out.println(a);
		
		
		
	}

}
