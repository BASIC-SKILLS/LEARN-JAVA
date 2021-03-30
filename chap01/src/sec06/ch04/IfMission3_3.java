package sec06.ch04;

public class IfMission3_3 {

	public static void main(String[] args) {
		
		final int SCORE = 79;
		final int DIFF = 9; //차이
		System.out.println("SCORE: " + SCORE);
		
		int quo = SCORE/10; //몫
		if (quo == 10) {  
			quo = DIFF;
		}
		
		String[] gradeArr = {"A", "B", "C", "D"};
		
		System.out.println(gradeArr[DIFF-quo]);
		
	}
}
