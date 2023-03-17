package chap2.quiz01;

public class MainClass {

	public static void main(String[] args) {
	
		Student s = new Student("홍길동", 30);
		s.setStudentld("a001");
		
		Teacher t = new Teacher("김철수", 50);
		t.setSubject("수학");
		
		Employee e = new Employee("박영희", 25);
		e.setDepartments("총무");
		
		s.info();
		t.info();
		e.info();

	}

}
