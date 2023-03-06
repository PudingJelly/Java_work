package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

	public C() {
		
		A a = new A();
		a.x = 1; //public
//		a.y = 2; (X)
//		a.z = 3; (X)
		
		a.method1();
//		a.method2(); (X)
//		a.method3(); (X)
		
	}
	
	
}
