package sec06.ch04;

public class ForMission7 {

	public static void main(String[] args) {

		int star = 5;
		for (int i=1; i<=star; i++) {
			for (int j=i; j<star; j++) {
				System.out.print("_");
			}
			for (int z=0; z<i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=0; i<100; i++) {
			System.out.println(Math.random());
		}
		
		for (int i=0; i<10; i++) {
		      System.out.println((int) (Math.random() * 12) + 1);
		   }
	System.out.println();
	
	for (int i=0; i<10; i++) {
	      System.out.println((int) (Math.random() * 13) + 12);
}
	}
}
