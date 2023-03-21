package chap2.quiz01;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void info() {
		System.out.printf("이름: %s 나이: %d세 ", name, age);
	}

}
