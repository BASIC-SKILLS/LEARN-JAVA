package sec06.ch05;

public class MethodMission2 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		
		double result = divide(n1, n2);
		System.out.println("result : " + result);

		n2 = 5;
		result = divide(n1, n2);
		System.out.println("result : " + result);
		
		System.out.println("절대값 : " + abs(10));
		System.out.println("절대값 : " + abs(-10));
	}
	
	public static double divide(int n1, int n2) {
		double result =  (double) n1 / n2;;
		
		return result;
	}
	
	public static int abs(int n1) {
		if (n1 < 0) {
			return (n1 * -1);
		}
		return n1;
	}
	
}
