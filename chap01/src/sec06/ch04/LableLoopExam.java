package sec06.ch04;

public class LableLoopExam {

	public static void main(String[] args) {
		
		OUTER :
		for (int i=0; i<10; i++) {
			for (int z=100; z<105; z++) {
				System.out.printf("%d - %d \n", i, z);
				
				if (z == 102) {
					break OUTER;
				}
			}
			System.out.println("yo.");
		}
		
		System.out.println();
		
		OUTER :
		for (int i=0; i<3; i++) {
			for (int z=100; z<105; z++) {
				System.out.printf("%d - %d \n", i, z);
					
				if (z == 102) {
					continue OUTER;
				}
			}
			System.out.println("yo.");
		}
		
			
	}

}
