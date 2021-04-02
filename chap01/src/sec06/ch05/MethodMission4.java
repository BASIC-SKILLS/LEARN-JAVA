package sec06.ch05;

public class MethodMission4 {

	public static void main(String[] args) {
		
		int rNum = rNum();
		System.out.println("rNum : " + rNum);
	
	}
	
	public static int rNum() {
		
		return (int) (Math.random() * 10);
	}
	
}
