package review;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManagerReview2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[3];
		String[] names = new String[3];
		int[] ages = new int[100];
		String[] departments = new String[3];

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
			int menu = sc.nextInt();

			if(menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.사번만!!)
				System.out.println("# 사원 정보 등록을 시작합니다.");
				System.out.print("- 사번: ");
				String empNum = sc.next();
				while(true) {
					boolean flag = false;
					for(int i=0; i<count; i++) {
						if(empNum.equals(userNums[i])) { //입력한 사번이 이미 존재하는 경우
							System.out.println("이미 중복된 사번입니다.");
							flag = true;
							break;
						}
					}
					if(!flag) { //flag == false? -> 중복 발생 x
						userNums[count] = empNum;
						break; //사번 확인용 무한 루프 탈출.
					} else { //flag == true? -> 중복 발생!
						System.out.print("- 사번 재입력: ");
						empNum = sc.next();
					}
				}

				System.out.print("- 이름: ");
				names[count] = sc.next();

				System.out.print("- 나이: ");
				ages[count] = sc.nextInt();

				System.out.print("- 부서명: ");
				departments[count] = sc.next();

				System.out.println(names[count] + "님의 정보가 정상 등록되었습니다.");
				count++; //다음 사람은 다음 인덱스에 저장해야 하니깐.


				//				outer:for(int i=count; i<userNums.length; i++) {
				//					System.out.print("신규 사번을 입력해주세요: ");
				//					String inUserNums = sc.next();
				//					for(int j=0; j<userNums.length; j++) {
				//						if(inUserNums.equals(userNums[j])) {
				//							System.out.println("중복된 사번입니다. 다시 입력해주세요");
				//							i--;
				//							break;
				//						} else if (j==99){
				//							userNums[i]=inUserNums;
				//							System.out.print("신규 이름을 입력해주세요: ");
				//							String inNames = sc.next();
				//							names[i]=inNames;
				//							System.out.print("신규 나이를 입력해주세요: ");
				//							int inAges = sc.nextInt();
				//							ages[i]=inAges;
				//							System.out.print("신규 부서를 입력해주세요: ");
				//							String inDep = sc.next();
				//							departments[i]=inDep;
				//							System.out.println(names[count] + "님의 정보가 정상적으로 등록되었습니다.");
				//							count++;
				//							break outer;
				//						}
				//					}
				//				} //1번 for문 종료
			} else if (menu == 2) {
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				if(count == 0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				} else {
					System.out.println("========== 전체 사원 정보 ==========");
					for(int i=0; i<count; i++) {
						System.out.printf("사번: %s 이름: %s 나이: %d세 부서: %s\n",
								userNums[i],names[i],ages[i],departments[i]);
					}
				}


//				if(count==0) {
//					System.out.println("등록된 사원 정보가 없습니다.");
//					continue;
//				} else {
//					for(int i=0; i<100; i++) {
//						if(userNums[i]==null) break;
//						System.out.printf("사번: %s, 이름: %s, 나이: %d, 부서: %s",
//								userNums[i],names[i],ages[i],departments[i]);
//						System.out.println();
//					}
//				}


			} else if (menu == 3) {
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.println("# 조회하실 사원의 번호를 입력하세요.");
				System.out.printf("> ");
				String empNum = sc.next();

				int i;
				for(i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("========== 사원 정보 ==========");
						System.out.printf("사번: %s 이름: %s 나이: %d세 부서: %s\n",
								userNums[i],names[i],ages[i],departments[i]);
						break;
					}
				}
				if(i==count) {
					System.out.println("조회하신 사원 번호는 존재하지 않습니다.");
				}


//				System.out.print("사번을 입력하세요: ");
//				String inUserNums = sc.next();
//				outer:for(int i=0; i<100; i++) {
//					if(inUserNums.equals(userNums[i])) {
//						System.out.printf("사번: %s, 이름: %s, 나이: %d, 부서: %s",
//								userNums[i],names[i],ages[i],departments[i]);
//						System.out.println();
//						break outer;
//					} else if(i==99){
//						System.out.print("조회하신 사원의 정보가 없습니다.");
//						break outer;
//					}
//				}
			} else if (menu == 4) {
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.println("# 수정하실 사원의 번호를 입력하세요.");
				System.out.printf("> ");
				String empNum = sc.next();

				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("# " + names[i] + "의 정보를 변경합니다.");
						menu4:while(true) {
							System.out.println("[1.나이변경 | 2.부서변경 | 3.취소");
							System.out.print("> ");
							int sel =sc.nextInt();

							switch(sel) {
							case 1:
								System.out.println("변경하실 나이를 입력하세요: ");
								System.out.print("> ");
								ages[i] = sc.nextInt();
								System.out.printf("나이가 %d세로 정상 변경되었습니다\n",ages[i]);
								break;

							case 2:
								System.out.println("변경하실 부서를 입력하세요: ");
								System.out.print("> ");
								departments[i] = sc.next();
								System.out.printf("나이가 %s로 정상 변경되었습니다\n",departments[i]);
								break;

							case 3:	
								System.out.println("정보 수정을 취소합니다.");
								break menu4;

							default :
								System.out.println("변경 메뉴를 잘못 입력하셨습니다.");
							}
						}

						flag = true;
						break;
					}
				}
				if(!flag) {
					System.out.println("조회하신 사원번호는 존재하지 않습니다.");
				}


				//				System.out.print("사번을 입력하세요: ");
				//				String inUserNums = sc.next();
				//				outer:for(int i=0; i<100; i++) {
				//					if(inUserNums.equals(userNums[i])) {
				//						System.out.println("변경할 목록을 선택하세요");
				//						System.out.println("1. 나이변경");
				//						System.out.println("2. 부서변경");
				//						System.out.println("3. 취소");
				//						System.out.printf("> ");
				//						int sMenu = sc.nextInt();
				//						if(sMenu==1) {
				//							System.out.print("변경할 나이를 입력하세요: ");
				//							int trAge =sc.nextInt();
				//							ages[i]=trAge;
				//							break outer;
				//						} else if(sMenu==2) {
				//							System.out.print("변경할 부서를 입력하세요: ");
				//							String trdep =sc.next();
				//							departments[i]=trdep;
				//							break outer;
				//						} else if(sMenu==3) {
				//							break outer;
				//						}
				//
				//					}else if(i==99){
				//						System.out.print("조회하신 사원의 정보가 없습니다.");
				//						break outer;
				//					}
				//				}
			} else if (menu == 5) {
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.println("삭제하실 사원의 번호를 입력하세요");
				System.out.print("> ");
				String empNum = sc.next();

				boolean flag=false;
				System.out.println(flag);
				for(int i=0; i<count; i++) {
					if(empNum.equals(userNums[i])) {
						System.out.println("삭제할 사원 이름: " + names[i]);
						System.out.println("정말 삭제하시겠습니까? [Y/N]");
						System.out.println("> ");
						String answer = sc.next();

						//						if(answer.equals("Y")||answer.equals("y")) {
						//							
						//						}
						switch(answer) {

						case "Y": case "y": case "ㅛ":
							if(i == userNums.length) {
								userNums[i] = null;
								names[i] = null;
								ages[i] = 0;
								departments[i] = null;
							}
							for(int j=i; j<count-1; j++) {
								userNums[j] = userNums[j+1];
								names[j] = names[j+1];
								ages[j] = ages[j+1];
								departments[j] = departments[j+1];
							}
							count--;
							System.out.println("# 정상적으로 삭제 되었습니다.");
							break;

						case "N": case "n": case "ㅜ":
							System.out.println("# 삭제를 취소합니다.");

						default : 
							System.out.println("# 잘못 입력하셨습니다.");
							System.out.println("# 메인메뉴로 돌아갑니다.");
							break;
						}
						flag=true;
						System.out.println(flag);
						break;
					}
				}
				if(!flag) {
					System.out.println("조회하신 사원번호는 존재하지 않습니다.");
				}



				//				System.out.print("삭제할 사원의 사번을 입력하세요: ");
				//				String inUserNums = sc.next();
				//				outer:for(int i=0; i<100; i++) {
				//					if(inUserNums.equals(userNums[i])) {
				//						System.out.print("정말 삭제하시겠습니까? [Y / N]: ");
				//						String yn = sc.next();
				//						switch (yn) {
				//						case "Y": case "y":
				//							for(int j=i; j<100; j++) {
				//								if(j==99) {
				//									userNums[99]=null;
				//									names[99]=null;
				//									ages[99]=0;
				//									departments[99]=null;
				//								} else {
				//									userNums[j]=userNums[j+1];
				//									names[j]=names[j+1];
				//									ages[j]=ages[j+1];
				//									departments[j]=departments[j+1];
				//								}
				//							}
				//							System.out.printf("사번 %s님의 정보가 삭제되었습니다",inUserNums);
				//							count--;
				//							break outer;
				//						case "N": case "n":
				//							break outer;
				//						}
				//
				//					} else if(i==99) {
				//						System.out.print("조회하신 사원의 정보가 없습니다.");
				//						break outer;
				//					}
				//				}

			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하였습니다");
				continue; // 반복문의 끝이므로 이 다음에 처음부터 진행이므로 굳이 안써도 됨
			}







		} // end while true

	} // end main

}
