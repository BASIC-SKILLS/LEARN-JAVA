package sec06.ch04;

public class LableLoopMission {
	public static void main(String[] args) {
		
		OUTER:
		for (int i=1; i<10; i++) {
			for (int j=0; j<10; j++) {
				
				if (i == 8 && j == 8) { break OUTER;} 
				else if (i == j) {
					System.out.println();
					continue OUTER;
				}
				
				System.out.printf("%d%d\n", i, j);
			}
		}
	}

}
