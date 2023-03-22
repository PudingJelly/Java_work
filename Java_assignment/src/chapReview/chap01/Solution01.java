package chapReview.chap01;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {

		/*
문제:
	nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다. 

입력: 
	Scanner를 사용해서 입력받은 값을 nums 배열에 삽입합니다.
	배열의 크기는 10이고, 중복 입력값은 없다고 가정합니다.
	배열의 모든 인덱스에 값을 채울 때 까지 입력을 반복합니다.

출력:
	ex) 가장 큰 값: 95
	의 형태로 출력합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int count = 0; //입력된 배열의 개수를 세기 위한 변수

		for(int i=count; i<nums.length; i++) {
			System.out.print("값을 입력하세요: ");
			int num = sc.nextInt();
			
			boolean flag = false;
			for(int j=0; j<nums.length; j++) {
				if(num == nums[j]) {
					System.out.println("중복된 값 입니다.");
					i--;
					flag = true;
				} 
			} if(!flag) {
				nums[i] = num;
				count++;
			}
		}
		System.out.println(Arrays.toString(nums)); //입력된 값이 배열에 배치 되었는지 확인
		
		for (int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[i] > nums[j+1]) {
					nums[j+1] = nums[i];
				} else if(nums[i] < nums[j+1]) {
					nums[i] = nums[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(nums)); //배열에 가장 큰 값만 남았는지 확인
		System.out.printf("가장 큰 값: %d",nums[0]);
		sc.close();
	}
}
