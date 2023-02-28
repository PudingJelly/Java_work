package basic.review;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagerReview3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		int[] userNums = new int[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int count=0; //실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.

		while(true) {
			System.out.println("\n==========사원 관리 프로그램=========\n");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.printf("# 현재 등록된 사원 수: %d\n",count);
			System.out.println("======================================");

			System.out.print("메뉴 입력: ");
//			System.out.println(userNums.length);
			int menu = sc.nextInt();
			//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
			//사번은 중복되면 안됩니다.
			//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.사번만!!)
			if(menu == 1) {
				outer:for(int i=count; i<userNums.length; i++) {
					System.out.print("사원번호를 입력해주세요: ");
					int num = sc.nextInt();
					
					for(int j=0; j<userNums.length; j++) {
						if(num == userNums[j]) {
							System.out.println("중복된 사원번호 입니다. 다시 입력해주세요.\n");
							i--;
							break;
							
						} else if (j == userNums.length-1) {
							userNums[i]= num;
							
							System.out.print("이름을 입력해주세요: ");
							String name = sc.next();
							names[i] = name;
							
							System.out.print("나이를 입력해주세요: ");
							int age = sc.nextInt();
							ages[i] = age;
							
							System.out.print("부서를 입력해주세요: ");
							String dep = sc.next();
							departments[i] = dep;
							
							count++;
							
							System.out.println("=====================================");
							System.out.print("정보가 정상 등록 되었습니다.\n");
							break outer;
						}
					}
				}
			} 
			
			//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
			//만약 사용자가 사원 등록을 한 명도 하지 않았다면
			//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
			
			else if(menu == 2) {
					if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				} else {
					for(int i=0; i<userNums.length; i++) {
						if(userNums[i] == 0) break;
							System.out.printf("사원번호:%d 이름:%s 나이:%s 부서:%s"
									,userNums[i],names[i],ages[i],departments[i]);
							System.out.println();
					}
				}
			}
			
			//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
			//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
			//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
			//사번이 존재하지 않는다면 없다고 얘기해 주세요.
			//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
			//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
			else if(menu == 3) {
				System.out.print("정보를 검색 할 사번을 입력하세요: ");
				int temNum = sc.nextInt();
				for(int i=0; i<userNums.length; i++) {
					if(temNum == userNums[i]) {
						System.out.printf("사원번호:%d 이름:%s 나이:%s 부서:%s"
								,userNums[i],names[i],ages[i],departments[i]);
						System.out.println();
						break;
					} if(1>i && i<=userNums.length-1) {
						System.out.println("조회하신 사원의 정보가 없습니다.");
						break;
					}
				}
			}
			
			else if(menu == 4) {
				System.out.print("정보를 수정할 사번을 입력하세요: ");
				int temNum = sc.nextInt();
				outer4:for(int i=0; i<userNums.length; i++) {
					if(temNum == userNums[i]) {
						System.out.print("수정할 목록을 선택하세요: \n");
						System.out.print("1.나이변경 |2.부서변경 | 3.취소\n");
						System.out.print("> ");
						int tem = sc.nextInt();
						if(tem == 1) {
							System.out.print("변경할 나이를 입력하세요 \n");
							System.out.println("취소는 3을 입력하세요");
							System.out.print("> ");
							int temAge = sc.nextInt();
							if(temAge == 3) break;							
							ages[i] = temAge;
							System.out.println("나이가 정상적으로 변경 되었습니다.");
							break;
						} else if(tem == 2) {
							System.out.print("변경할 부서를 입력하세요 \n");
							System.out.println("취소는 3을 입력하세요");
							System.out.print("> ");
							String temDep = sc.next();
							if(temDep.equals(3)) {
								System.out.println("취소합니다.");
								break;
							}
							departments[i] = temDep;
							System.out.println("부서가 정상적으로 변경 되었습니다.");
							break;
							
						} else if(tem == 3) {
							System.out.println("취소합니다.");
							break;
							
						} else {
							System.out.println("목록을 잘못 입력하셨습니다.");
							break;
						}
					}
				}
				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					continue;
				}
			}
			
			
			//사번을 입력받아서
			//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
			//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
			//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
			//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
			//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
			else if(menu == 5) {
				System.out.print("정보를 삭제 할 사번을 입력하세요: ");
				int temNum = sc.nextInt();
				for(int i=0; i<userNums.length; i++) {
					if(temNum == userNums[i]) {
						System.out.print("정말 삭제 하시겠습니까? [Y/N]: ");
						String yn = sc.next();
						switch(yn) {
						case "Y": case "y": case "ㅛ":
							userNums[i] = userNums[i+1];
							names[i] = names[i+1];
							ages[i] = ages[i+1];
							departments[i] = departments[i+1];
							count--;
							break;
						case "N": case "n": case "ㅜ":
							System.out.println("정보 삭제를 취소합니다.");
							break;
						}
					}
				}
			}
			else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
			else {
				System.out.println("메뉴를 잘못 입력하였습니다. 다시 입력 해주세요");
				
			}
		
		
		
		
		
		
		
		
		
		
		}
	}

}
