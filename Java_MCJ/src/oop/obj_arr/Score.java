package oop.obj_arr;

public class Score {

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	
	private String name;
	private int ko;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Score() {}
	
	public Score(String name, int ko, int eng, int math) {
		this.name = name;
		this.ko = ko;
		this.eng = eng;
		this.math = math;
		this.total = ko+eng+math;
		this.avg = (double)total / 3;
	}
	
	void scoreInfo() {
		System.out.println("================================");
		System.out.printf("이름: %s\n국어점수: %d점 영어점수: %d점 수학점수: %d점\n",name,ko,eng,math);
		System.out.printf("총점: %d점 평균: %.1f점\n",total,avg);
		System.out.println("================================");
	}
	
	
	
	
}
