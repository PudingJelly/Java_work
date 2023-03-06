package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
		
//		my.year(1992); (X)
		my.setYear(1988);
		
		System.out.printf("내 생일은 %d년 입니다.\n",my.getYear("abc1234"));
		
		my.setMonth(12);
		my.setDay(2);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다\n",
				my.getYear("abc1234"),my.getMonth(),my.getDay());
		

	}

}
