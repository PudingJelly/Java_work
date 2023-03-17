package chap2.quiz01;

public class Student extends Person{

	private String studentld;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public String getStudentld() {
		return studentld;
	}

	public void setStudentld(String studentld) {
		this.studentld = studentld;
	}

	@Override
	public void info() {
		super.info();
		System.out.printf("학번: %s\n", studentld);
	}
	
}
