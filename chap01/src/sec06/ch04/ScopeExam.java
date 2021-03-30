package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		//스코프 (변수&상수가 살아있는 범위)
		//변수 선언하는 위치가 중요하다.
		// {} 안에서만 변수가 살아있다.
		
		int a = 10;
		
		if (a > 9) {
			System.out.println("a : " + a );
			
			int jjj = 10; //if문 안에서만 살아있다.
			System.out.println("jjj(1) : " + jjj);
		}
		
		/* 에러
		System.out.println("jjj(1) : " + jjj);
		*/
	}
}
