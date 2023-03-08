package chap2.quiz01;

public class Employee extends Person {

	String departments;

	@Override
	public void info() {
		super.info();
		System.out.printf("부서: %s\n", departments);
	}
	
	
}
