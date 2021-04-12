package sec06.ch06;

public class PolymorExam2 {

	public static void main(String[] args) {
		// 부모타입은 자식객체 주소값을 참조할 수 있다. 
		// 참조변수는 type의 객체 주소값 뿐만 아니라 자식객체의 주소값까지 참조할 수 있는 것이다!
		Animal ani1 = new Hamster();
		
		//자식타입은 부모객체 주소값을 참조할 수 없다.
		Animal ani2 = new Animal();
		
		//둘 다 똑같은 경우이다. 
		//Animal ani3 = new String();
		//Hamster ham = ani2;
		//Hamster ham = (Hamster) ani2;

		
		Hamster ham = (Hamster) ani1;
		
	}
	
	

}
