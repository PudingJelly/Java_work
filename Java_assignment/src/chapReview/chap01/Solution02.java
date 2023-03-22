package chapReview.chap01;

public class Solution02 {

	public static void main(String[] args) {
/*
문제:
	nums 배열에 저장된 요소의 개수만큼 ★을 출력하는 프로그램을 구현합니다.

입력: 
	입력은 따로 진행하지 않습니다.
	예제로 사용할 배열을 제시합니다.
	int[] nums = {4, 2, 6, 1, 3};
	
출력:
	ex) 
	★★★★
	★★
	★★★★★★
	★
	★★★
 */
		int[] nums = {7, 3, 5, 1, 6};
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i]; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
