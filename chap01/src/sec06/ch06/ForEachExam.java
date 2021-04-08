package sec06.ch06;

public class ForEachExam {

	public static void main(String[] args) {
		int[] num = { 2, 5, 9, 10, 56 };

		for (int i = 0; i < num.length; i++) { // for문
			System.out.println("for문 " + num[i]);
		}

		System.out.println("--------------------");

		for (int val : num) { // for-each문 for(type i : Array명) { } -> Array의 (무조건)0번 부터 끝번 까지 차례대로 i에 들어간다.
			System.out.println(val);
		}

		System.out.println("--------------------");

		String[] str = { "A", "B", "C", "D" };
		for (String val : str) {
			System.out.println(val);
		}

		System.out.println("--------------------");

		for (int i = (str.length - 1); i >= 0; i--) {
			System.out.println(str[i]);
		}
	}
}
