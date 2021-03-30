package sec06.ch04;

public class IfExam {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("score가 90보다 큽니다.");
			System.out.println("등급A");
		}
		
		if (score < 90) {
			System.out.println("score가 90보다 작습니다.");
			System.out.println("등급B");
		}
		
		System.out.println("끝");
	}

}
