package sec06.ch04;

public class SwitchMission {

	public static void main(String[] args) {
		//Math.random() : 0.0이상 ~ 1.0 사이의 난수 발생
		
		int time = (int) (Math.random() * 4) + 8; //8~11 사이의 정수값
		System.out.println("time: " + time);
		
		switch(time) {
		case 8: System.out.println("출근합니다."); break;
		case 9: System.out.println("회의를 합니다."); break;
		case 10: System.out.println("업무를 봅니다."); break;
		default: System.out.println("외근을 합니다."); break;
		}
		
	}

}
