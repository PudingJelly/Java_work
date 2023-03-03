package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
	
		/*
		 Scanner를 이용해서 사용자에게
		 이름, 나이, 키를 입력 받아서
		 해당 정보를 저장하는 객체를 디자인 해 보세요.
		 
		 객체 내에는 해당 사람의 정보를 모두 출력해주는
		 info() 메서드가 존재합니다.
		 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("이름을 입력하세요: ");
		String iName = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		int iAge = sc.nextInt();
		
		System.out.print("키를 입력하세요: ");
		int iTall = sc.nextInt();
		
		System.out.println();
		System.out.println("======= 입력된 정보 확인 =======");
		
		Person people = new Person(iName, iAge, iTall);
		people.info();
		sc.close();

	}

}
