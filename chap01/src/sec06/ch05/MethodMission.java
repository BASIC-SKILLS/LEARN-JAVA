package sec06.ch05;

public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10, 30);
		whoIsBig(10, 9);
		whoIsBig(11, 25);
		whoIsBig(11, 11);
		
		int big = getBigNum(10, 30);
		System.out.println("big : " + big);
		
		big = getBigNum(10, 9);
		System.out.println("big : " + big);
		
		big = getBigNum(10, 10);
		System.out.println("big : " + big);
	}
	
	public static void whoIsBig(int n1, int n2) {
		int bigNum = n1;
		
		if (n1 < n2) {
			bigNum = n2;
		} else if (n1 == n2) {
			System.out.println("값이 같습니다.\n");
			return;
		} 
		
		System.out.printf("%d이 가장 큽니다.\n", bigNum);
		
		return;
	}
	
	public static int getBigNum(int n1, int n2)  {
		if (n1 > n2) {
			return n1;
		} else if (n1 == n2) {
			System.out.println("값이 같습니다.");
		}
		
		return n2;
	}
}
