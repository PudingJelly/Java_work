package basic.review;

import java.util.Scanner;

public class EmployeeManagerReview230227 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int count=0; //실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.

		main: while(true) {
			System.out.println("\n==========사원 관리 프로그램=========\n"+count);
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("======================================");

			System.out.print("메뉴 입력: ");
			int menu = sc.nextInt();

			switch(menu) {

			case 1:
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//(무한루프를 구현해서 중복이 발생하면 다시 입력받기.사번만!!)
				System.out.println("사원정보 신규 등록을 시작합니다.");
				outer:for(int i=count; i<userNums.length; i++) {
					System.out.print("사번을 입력하세요: ");
					String inNum = sc.next();
					for(int j=0; j<userNums.length; j++)
						if(inNum.equals(userNums[j])) {
							System.out.println("이미 등록된 사번입니다. 다시 입력해주세요");
							i--;
							break;

						} else if(j==99) {
							userNums[i] = inNum;

							System.out.print("이름을 입력하세요: ");
							String inName = sc.next();
							names[i] = inName;

							System.out.printf("나이를 입력하세요: ");
							int inAge = sc.nextInt();
							ages[i] = inAge;

							System.out.printf("부서를 입력하세요: ");
							String indep = sc.next();
							departments[i] = indep;
							count++;
							break outer;
						}

				}
				break;


			case 2:
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면
				//"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
					break;
				} else {
					for(int i=0; i<100; i++) {
						if(userNums[i]==null) break;
						System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s",
								userNums[i],names[i],ages[i],departments[i]);
						System.out.println();
					}

				}
				break;


			case 3:
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
				System.out.printf("사원번호를 입력하세요: ");
				String inNum = sc.next();
				for(int i=0; i<userNums.length; i++)
					if(inNum.equals(userNums[i])) {
						System.out.printf("사번: %s 이름: %s 나이: %d 부서: %s",
								userNums[i],names[i],ages[i],departments[i]);
						break;
					} else if(i==99) {
						System.out.println("조회하신 사원의 정보가 없습니다.");
					}

				break;

			case 4:
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				System.out.printf("정보를 수정 할 사원번호를 입력하세요: ");
				String inNum1 = sc.next();
				for(int i=0; i<userNums.length; i++)
					if(inNum1.equals(userNums[i])) {
						System.out.println("수정하실 목록을 선택해 주세요");
						System.out.println("1. 나이변경");
						System.out.println("2. 부서변경");
						System.out.println("3. 취소");
						System.out.print("> ");
						int sMenu = sc.nextInt();
						switch(sMenu) {
						case 1:
							System.out.println("변경할 나이를 입력하세요: ");
							int trAge = sc.nextInt();
							ages[i]=trAge;
							break;

						case 2:
							System.out.println("변경하는 부서를 입력하세요: ");
							String trDep = sc.next();
							departments[i]=trDep;
							break;

						case 3:
							System.out.println("취소하였습니다.");
							break;
						}
						break;
					} else if (i==99) {
						System.out.println("입력된 사원번호가 존재하지 않습니다.");
						break;
					}
				break;

			case 5:
				boolean flag = false;
				int i;
				//사번을 입력받아서
				//해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.printf("정보를 삭제할 사원번호를 입력하세요: ");
				String inNum2 = sc.next();
				for(i=0; i<count; i++)
					if(inNum2.equals(userNums[i])) {
						flag = true;
						break;
					}
				System.out.println(i);
				if(flag) {
						System.out.print("정말 삭제하시겠습니까? [Y/N]: ");
						String yn = sc.next();
						
						switch(yn) {
						case "Y": case "y":
							System.out.println("yn= "+yn);
							System.out.println("i= "+i);
							for(int j=i; j<count; j++) {
							userNums[j]=userNums[j+1];
							names[j]=names[j+1];
							ages[j]=ages[j+1];
							departments[j]=departments[j+1];							
							}
							count--;							
							break;
						case "N": case "n":
							System.out.println("삭제를 취소 합니다.");
							break;
						
						}

				}	


				break;//case5 break

			case 6:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break main;

			default :
				System.out.println("메뉴를 잘못 입력하였습니다");

			} //switch end





		}
	} //main end

}
