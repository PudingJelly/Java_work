package chap2.quiz01;

public class Teacher extends Person{

	private String subject;
	
	public Teacher(String name, int age) {
		super(name, age);
	}

	
	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void info() {
		super.info();
		System.out.printf("담당과목: %s\n", subject);
	}
	
	
}
