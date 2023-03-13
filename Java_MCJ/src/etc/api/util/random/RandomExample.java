package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수난수: 0.0이상 1.0미만 (0.0 <= ~ < 1.0)
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수난수: nextInt();
		int i = r.nextInt(); // 범위를 지정하지 않았을 때 int의 전체 범위가 설정됨
		System.out.println(i);
		
		//0~5까지의 정수 난수 생성 (끝값이 미만으로 인식됨)
		int j = r.nextInt(6);
		System.err.println(j);
		
		//10~100까지의 정수 난수 생성
		int k = r.nextInt(91) + 10;
		System.out.println(k);
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
		
	}
}
