package sec06.ch05;

public class MethodMission3 {

	public static void main(String[] args) {
		sumAllFromTo(5, 10);
		sumAllFromTo(2, 14);
		sumAllFromTo(14,2);
		
		System.out.println();
		
		sumAllFromTo2(5, 10);
		sumAllFromTo2(2, 14);
		sumAllFromTo2(14,2);
	}
	
	public static void sumAllFromTo(int n1, int n2) {
		
		int sum = 0;
		int min = n1;
		int max = n2;
		
		if (n1 > n2) {
			min = n2;
			max = n1;
		} 
		
		for (int i=min; i<=max; i++) {
			sum += i; 
		}
		
		System.out.printf("sum : %d\n", sum);
	}
	
	public static void sumAllFromTo2(int to, int from) {
		int sum = 0;
		
		for (int i=to; i<=from; i++) {
			sum += i;
		}
		
		for (int i=to; i>=from; i--) {
			sum += i;
		}
		
		System.out.println("sum : " + sum);
	}
	
}
