package sec06.ch06;

public class OverloadingExam {
//똑같은 이름의 메소드를 여러번 만들 수 있다. -> 오버로딩 -> 그러나 규칙이 있다.
//반환타입은 상관이 없고, 파라미터로 구분된다. 파라미터의 순서가 달라져도 그것은 파라미터가 달라진다. int d, String a != String a, int d
/*
void sum(int n1, int n2, int n3) {
	System.out.println(n1 + n2 + n3);
}
int sum(int d1, int d2, int d3) {
	System.out.println(n1 + n2 + n3);
} -> 안된다.
*/
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(5, 10);
		calc.sum(5, 10, 11);
		calc.sum(5, 10, "11");
	}
	
}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	void sum(int n1, int n2, String n3) { //파라미터가 다르니까 오버로딩 완료 
		System.out.println(n1 + n2 + n3);
	}
}
