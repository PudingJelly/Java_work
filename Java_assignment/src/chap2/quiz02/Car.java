package chap2.quiz02;

public class Car {

	private String model;           //차 모델명
	private int speed;              // 현재 속도
	private char mode;              // 변속 모드 (P,R,N,D)
	private boolean start = false;  // 시동 온/오프 상태 여부

	public Car(String model) {
		this.model = model;
		System.out.println(model);
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("속도변경: " + this.speed);
		
		if(0>speed || speed>=200) {
			System.out.println("속도는 0미만 200이상일 수 없습니다.");
			return;
		} 
		else if(start != true) {
			System.out.println("시동이 걸려있지 않아 속도를 지정 할 수 없습니다.");
			return;
		}  //시동이 꺼져있으면 속도 지정X
		
		else if(mode == 'P' || mode == 'N') {
			System.out.println("D또는 R모드가 아니면 속도를 지정할 수 없습니다.");
			return;
		} //D와 R이 아닐 경우엔 속도 지정X를 출력 하려했으나 지속된 출력 오류로 인하여 조건을 변경
		
//		else if (mode == 'D') { 
//			this.speed = speed;
//		} // D모드일 경우를 명시를 안했더니 지속된 출력 오류로 집어 넣었음
		  // speed값 지정이 안되서 그런거 같은데...
		
		else if(mode=='R') { 
			System.out.println("속도변경: " + this.speed);
			if(speed>40) {
				System.out.println("R모드는 속도가 40을 넘길 수 없습니다");
				return;
			} else {
				this.speed = speed;
			}
		} // R모드이지만 속도가 40을 넘길 경우엔 리턴값을 주고 그렇지 않은 경우에 스피드값을 할당
	}

	public void setMode(char mode) {
		this.mode = mode;
		if(mode!='P' && mode!='R' && mode!='N' && mode!='D') {
			this.mode = 'P';
		} // 지정된 값 이외에 모든 매개값은 P로 통일
		else {
			this.mode = mode;
			System.out.println("모드변경: " + this.mode);
		}
	}

	public char getMode() {
		return mode;
	}

	void engineStart() {
		System.out.println("시동버튼을 눌렀습니다."); //1. 시동시작
		injectGasoline();                        //2. 엔진오일 주입
		injectOil();                             //3. 연료 주입
		start = true;                            //4. 시동이 걸리기 위한 변수값 변경
		moveCylinder();                          //5. 실린더 동작
		System.out.println("시동이 걸렸습니다");     //6. 시동걸림
		return;
	}

	private void injectGasoline() {
		System.out.println("연료가 엔진에 주입됩니다.");
	}

	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}

	private void moveCylinder() {
		if(start = true) {
			System.out.println("실린더가 작동합니다.");
		} else {
			System.out.println("실린더가 작동하지 않습니다.");
			return;
		}
	}

	void engineStop() {
		if(speed > 0) {
			System.out.println("주행중에는 시동을 끌 수 없습니다.");
			return;
		} // 속도가 0초과인 경우에는 시동을 끌 수 없음 
		
		else if(speed==0 && mode != 'P') {
			System.out.println("P모드로 먼저 변속기를 변경하세요.");
			return;
		} //속도가 0이면서 P모드가 아닐 경우에는 P모드로 변경 필요
		
		else {
			start = false;
			System.out.println("시동을 끕니다.");
		}
	}


	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

// isStart와 setStart는 왜 작성이 되어야 되는지 잘 모르겠어요..

}
