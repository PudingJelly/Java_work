package chap2.review.quiz01;

public class MainClass {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.name = "김이박";
		s.age = 20;
		s.studentld = "a001";
		
		Teacher t = new Teacher();
		t.name = "이김박";
		t.age = 36;
		t.subject = "수학";
		
		Employee e = new Employee();
		e.name = "박김이";
		e.age = 27;
		e.departments = "총무";
		
		s.info();
		t.info();
		e.info();

	}

}
