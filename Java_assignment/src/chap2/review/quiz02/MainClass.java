package chap2.review.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car c = new Car("Porsche"); // Car 객체 모델 생성
		c.setSpeed(100);          // 시동을 걸지 않은 상태에서 속도 변경
		c.engineStart();         // 시동버튼 누름
		c.setMode('D');          // 변속기를 D모드로 변경
		c.setSpeed(100);         // 속도를 100까지 올림
		c.engineStop();          // 속도가 100인 상태에서 시동 끔
		c.setSpeed(0);           // 속도를 0으로 줄임
		c.setMode('P');          // 변속기를 P로 변경
		c.engineStop();          // 시동 끔
	}

}
