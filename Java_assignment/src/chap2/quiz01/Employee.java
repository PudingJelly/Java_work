package chap2.quiz01;

public class Employee extends Person {

	private String departments;
	
	public Employee(String name, int age) {
		super(name, age);
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	@Override
	public void info() {
		super.info();
		System.out.printf("부서: %s\n", departments);
	}
	
	
}
