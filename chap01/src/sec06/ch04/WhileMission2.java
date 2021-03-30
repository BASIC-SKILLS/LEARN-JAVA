package sec06.ch04;

public class WhileMission2 {

	public static void main(String[] args) {
		//break -> stop, continue -> skip
		
		int i = 0;
		while (true) {
			if (i == 4) {
				break;
			}
			
			System.out.println("i : " + i++);
		}
		
		System.out.println("끝");
		
		int j = 0;
		while (true) {
			j++;
			
			if (j == 10) {
				break;
			}
			
			if (j % 2 == 0) {
				continue;
			}
			
			System.out.println("j : " + j);
		}
		
		System.out.println("끝");
		
		for (int k=0; k<10; k++) {
			if (k % 2 == 0) {
				continue;
			}
			System.out.println("k : " + k);
		}
		
		System.out.println("끝");
	}

}
