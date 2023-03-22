package chapReview.chap02.quiz01;

public class Teacher extends Person{

	String subject;
	
	@Override
	public void info() {
		super.info();
		System.out.printf("담당과목: %s\n", subject);
	}
	
	
}
