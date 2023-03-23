package chapReview.chap05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {

		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");

		while(true) {

			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();

			System.out.println("--------------------------------");

			String name;
			int price;

			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */

				while(true) {

					boolean flag = false;
					System.out.println("메뉴를 등록하세요");
					System.out.print("> ");
					name = sc.next();

					if(foods.containsKey(name)) {
						System.out.println("중복된 메뉴입니다. 다시 입력하세요");
						System.out.println("==========================");
						flag = true;
					}
					if(!flag) {
						System.out.println("가격을 입력하세요");
						System.out.print("> ");
						price = sc.nextInt();

						foods.put(name, price);
						System.out.println("==========================");
						System.out.println(name + " 메뉴가 등록되었습니다.");
						System.out.println("==========================");
						break;
					}
				}

			} else if(menu == 2) {
				/*
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 

				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....

				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.

				  - 취소: 메인 메뉴로 이동
				 */
				if(foods.size() == 0) {
					System.out.println("메뉴 등록을 먼저 해주세요.");
					System.out.println("메인 메뉴로 돌아갑니다.");
					System.out.println();
				} else {
					System.out.println("========= 전체 메뉴 =========");
					Set<String> menus = foods.keySet();

					for(String m : menus) {
						System.out.println(m + " " + foods.get(m) + "원");
					}

					System.out.println("==========================");
					System.out.println("번호를 선택하세요");				
					System.out.println("==========================");
					System.out.println("1. 수정 | 2. 삭제 | 3. 취소");
					System.out.print("> ");
					menu = sc.nextInt();

					if(menu == 1) {
						System.out.println("수정할 메뉴를 입력해주세요");
						System.out.print("> ");
						name = sc.next();

						boolean flag = false;
						if(!(foods.containsKey(name))) {
							System.out.println("등록되지 않은 메뉴입니다.");
							System.out.println("메인 메뉴로 돌아갑니다.");
							System.out.println();
							flag = true;
						} 
						if(!flag) {
							System.out.println("수정할 가격을 입력하세요");
							System.out.print("> ");
							price = sc.nextInt();

							System.out.println("==========================");
							System.out.println(name + " 의 가격이 " + price 
													+ "로 수정되었습니다.");
							foods.replace(name, price);
							System.out.println("==========================");
						}

					} else if(menu == 2) {
						System.out.println("삭제할 메뉴를 입력하세요");
						System.out.print("> ");
						name = sc.next();
						System.out.println("==========================");
			
						boolean flag = false;
						if(!(foods.containsKey(name))) {
							System.out.println("등록되지 않은 메뉴입니다");
							System.out.println("메인 메뉴로 돌아갑니다.");
							System.out.println();
							flag = true;
						}
						if(!flag) {
							foods.remove(name);
						}
						
					} else if(menu == 3) {
						System.out.println("메인메뉴로 돌아갑니다");
						System.out.println();
					}
				}
			} else if(menu == 3) {
				/*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				System.out.println("종료하시겠습니까? [ Y | N ]");
				System.out.print("> ");
				String yn = sc.next();

				if(yn.equals("Y") || yn.equals("y") || yn.equals("ㅛ")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("메인 메뉴로 돌아갑니다.");
				}

			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
				System.out.println("==================================");
			}



		}



	}

}

















