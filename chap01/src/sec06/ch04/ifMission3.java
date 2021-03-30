package sec06.ch04;

public class ifMission3 {
	public static void main(String[] args) {
		final int SCORE = (int) (Math.random() * 41) + 60;
		//SCORE값은 81~100점 사이의 값이 된다. 
		
		System.out.println("SCORE : " + SCORE);
		
		String grade = "D";
		
		int result = SCORE % 10;
		
		if(SCORE > 90) {
			grade = "A";
		} else if (SCORE > 80) {
			grade = "B";
		} else if (SCORE > 70) {
			grade = "C";
		}
		
		if (result >= 7|| result == 0) {
			grade += "+"; 
		} else if (result < 4) {
			grade += "-";
		}
		
		System.out.print(grade);
		
	}
	
}
