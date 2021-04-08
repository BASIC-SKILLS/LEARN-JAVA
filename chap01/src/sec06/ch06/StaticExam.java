package sec06.ch06;

public class StaticExam {
	//멤버 필드에 static이 붙었을 때 
	public static void main(String[] args) {
		Toy doll = new Toy();
		Toy robot = new Toy();
		
		doll.name = "디즈니";
		System.out.println("doll.name : " + doll.name);
		
		robot.name = "롯데";
		System.out.println("robot.name : " + robot.name);
		System.out.println("doll.name : " + doll.name); //이렇게 사용하는 것은 지양할 것 
		System.out.println("Toy.name : " + Toy.name);//이렇게 사용할려고 static만드는 것
	}
}

class Toy {
	static String name; //static이 붙은 멤버 필드는 class메모리 영역에 할당된다. 그리고 값 하나만 저장할 수 있다. 객체화와 전혀 연관이 없다. 
						//그래서 객체가 몇 백개가 만들어지든 똑같은 값을 반환한다.
						//static은 단 하나. //static은 클래스명.멤버필드 
						//static이 붙은 순간 객체와 상관없어진다. 
	
						//
}