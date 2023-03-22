package chapReview.chap02.quiz01;

public class Student extends Person{

	String studentld;

	@Override
	public void info() {
		super.info();
		System.out.printf("학번: %s\n", studentld);
	}
	
	
	
}
