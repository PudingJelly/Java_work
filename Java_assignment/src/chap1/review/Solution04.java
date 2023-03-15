package chap1.review;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
/*
문제:
	학생들 중 과제를 제출하지 않은 학생을 적발하는 문제 입니다.
	총 학생의 수는 10명 입니다. 각 학생들은 1번부터 10번까지 번호를 가지고 있습니다.
	학생들 중 2명의 학생이 과제를 제출하지 않았습니다. 그 학생이 몇 번 학생인지를 출력하면 됩니다.

입력: 
	Scanner를 활용하여 총 8개의 정수를 입력 받습니다.
	출석번호에 중복은 없습니다.
	입력되는 값을 제시합니다. 
	-> 3 1 4 5 7 9 6 10

출력:
	ex) 
	숙제를 안 낸 학생의 번호:
	2
	8

	의 형태로 출력합니다. 
*/

		Scanner sc = new Scanner(System.in);
		boolean[] isSubmit = new boolean[10];
		
		for(int i=1; i<=8; i++) {
			System.out.print("제출한 학생의 번호를 입력하세요: ");
			isSubmit[sc.nextInt()-1] = true;
		}
		
		System.out.println("숙제를 안낸 학생");
		for(int j=0; j<isSubmit.length; j++) {
			if(isSubmit[j] == false) {
				System.out.println(j+1);
			}
		}
		
//		int[] student = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] nums = new int[8]; //8명의 학생수를 입력 받을 배열
//
//		for(int i=0; i<nums.length; i++) {
//			System.out.print("학생 번호를 입력하세요: ");
//			int num = sc.nextInt(); //제출 한 학생 번호 입력
//
//			boolean flag = false;
//			for(int j=0; j<nums.length; j++) {
//
//				if(num == nums[j]) {
//					System.out.println("중복된 학생 번호입니다.");
//					i--;
//					flag = true;
//				} 
//			} if(!flag) {
//				nums[i] = num;
//			} 
//		} // 제출 학생 번호 입력 및 중복 값 제외 끝
//
//		System.out.println("->" + Arrays.toString(nums));//제출한 학생 배열 확인
//
//		System.out.println("숙제를 안 낸 학생의 번호:");
//		
//		for(int i=0; i<student.length; i++) {
//			boolean flag = false;
//			for(int j=0; j<nums.length; j++) {
//				if(student[i] == nums[j]) {
//					flag = true;
//				} 
//			}
//			if(!flag) {
//				System.out.println(student[i]);
//			}
//		}
		sc.close();
	}
}
