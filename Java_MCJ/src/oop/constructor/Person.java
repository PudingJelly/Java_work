package oop.constructor;

public class Person {

	String name;
	int age;
	int tall;
		
	Person(){}
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}

	void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + tall + "cm");
		System.out.println("=============================");
		
		System.out.printf("이름: %s\n나이: %d세\n키: %dcm\n",name,age,tall);
	}
	
	
	
}
