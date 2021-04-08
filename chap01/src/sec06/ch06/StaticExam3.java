package sec06.ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : " + result);
		
		System.out.println("------------------------");
		
		int result2 = CalcStatic.sum(10, 30);
		System.out.println("result2 : " + result2);

		
	}
}


class Book {
	static String name;
	static String writer;
}



class CalcStatic {
	
	
	static int sum(int num1, int num2) { //그에 반에  static은 이미 메모리에 올라가기 때문에 굳이 메모리에 올릴 필요 없다 -> 객체화 필요 X
											//static은 변수가 주소값을 가리킬 수 없다. 
											//변수 기본형(int, float)은 리터럴 값만 들어가고, 참조형만 주소값을 가리킨다.
		return num1 + num2;
	}
}

class CalcInstance {
	int sum(int num1, int num2) {
		return num1 + num2;  //static이 안붙으면, 무조건 메모리에 올리고 나서 쓴다. -> 객체화 
	}
}
