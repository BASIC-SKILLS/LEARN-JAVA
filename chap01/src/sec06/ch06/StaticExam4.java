package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {  
		
		CalcStatic3.num1 = 10; CalcStatic3.num2=20;
		CalcStatic3 c3 = new CalcStatic3();
		System.out.println("----------------StaticExam4의 모든 결과-----------------------");
		System.out.println(c3.sum());
		
	}
}

//메소드에 static을 붙이면 안되는 것만 알고 되도록 static을 붙여서 사용하는 게 좋다 
//static멤버필드 -> 클래스 멤버필드
//멤버필드 -> 인스턴스 멤버필드
//static 메소드 -> 클래스 메소드 
//멤버메소드 -> 인스턴스 메소드

//메모리에 static이 무조건 인스턴스 멤버필드나 인스턴스 메소드보다 빠르게 올라간다. 절대 인스턴스가 먼저 올라갈 일이 없다. 

class CalcStatic2 {
	int num1;          
	int num2;
	//static int sum() {  //static이 더 빨리 메모리에 올라간다. 메모리에 바로 올라갈려고 하는데, num1과 num2는 메모리에 올라갈려면 객체화되어야 한다. 그래서 에러가 뜬다.
		//return num1 + num2;
//	}
	
	static int sum(int i, int j) {
		return i+j;
	}
}

class CalcStatic3 {
	static int num1;           //객체화 필요없다    //이건 가능. 
	static int num2;
	int sum() {  //객체화 해야 한다
		return num1 + num2;
	}
}

class CalcInstance2 {
	int num1;
	int num2;
	int sum() {
		return this.num1 + num2;  
	}
}



/*

class CalcStatic3 {
	static int num1;          //전역 변수 + //클래스 변수 (static은 클래스명을 붙여서 사용하기 때문에 클래스 변수라고 부른다)  
	static int num2;          
	int sum() {               
		return num1 + num2;
	}
}


*/
