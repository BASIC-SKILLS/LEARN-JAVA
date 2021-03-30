package sec06.ch04;

public class IfMission3_2 {

	public static void main(String[] args) {
		final int SCORE = (int) (Math.random() * 41) + 60;
		
		System.out.println("SCORE : " + SCORE);
		
		String g[] = {"A", "B", "C", "D", "E", "F", "G"};
		String real = "";
		int number = SCORE / 10;
			
		for (int i=9; i>=(g.length-1); i--) {
			if (number>(i-1)) {
				real = g[9-i];
				System.out.print(real);
				break;
			} 
			
		}
	}

}
