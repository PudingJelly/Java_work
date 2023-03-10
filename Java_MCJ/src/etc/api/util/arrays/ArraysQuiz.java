package etc.api.util.arrays;

import java.util.Arrays;

import javax.swing.RowFilter.ComparisonType;

public class ArraysQuiz {

	public static String solution(String[] participant, String [] completion) {
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한자는 1명이라고 가정합니다.
		 */
		Arrays.sort(participant);
		Arrays.sort(completion);
		System.out.println("참가자: " + Arrays.toString(participant));
		System.out.println("탈락자: " + Arrays.toString(completion));		

//		String people = null;
//		for(int i=0; i<participant.length; i++) {
//			int place = Arrays.binarySearch(completion, participant[i]);
//			if(place<0) {
//				people = participant[i];
//				break;
//			}
//		}
//		return people;

		String fail = null;
		for(int i=0; i<participant.length; i++) {
			boolean flag = false;
			for(int j=0; j<completion.length; j++) {
				if(participant[i].equals(completion[j])) {
					flag = true;
				}
			}
			if(!flag) {
				fail = participant[i];
				System.out.println("탈락자: " + fail);
			}
		}
		return fail;
	}

	public static void main(String[] args) {

		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"}; //참가자
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"}; //완주자

		solution(participant, completion);


		//		System.out.println("탈락자: " + solution(participant, completion));


	}

}
