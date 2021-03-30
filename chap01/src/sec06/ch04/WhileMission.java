package sec06.ch04;

public class WhileMission {

	public static void main(String[] args) {
		
		int result = 0;
		int j = 1;
		while (j<101) {
			result += j;
			j++;
		}
		System.out.println(result);
		System.out.println();
		
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
