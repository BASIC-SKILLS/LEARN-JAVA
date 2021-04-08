package sec06.ch06;

public class StaticExam5 {
	
	public static void main(String[] args) {  //static이 붙어서 미리 메모리에 올라가있기 때문에 n1과 n2를 쓰기 위해서는 n1,n2는 아직 메모리에 안올라와있기 떄문에 객체화를 먼저해야한다. 
		StaticExam5 static5 = new StaticExam5();
		static5.n1 = 10; static5.n2 = 20;
		System.out.println(static5.sum());
		
		System.out.println(num); //num이 static이니까 이미 메모리에 올라와있으니까 객체화 필요없다. 
		
		StaticExam4.main(args);  //main메소드 안에서 다른 클래스의 메인메소드를 불러올 수 있다. 
		
	}
	static int num = 1;
	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}



}

