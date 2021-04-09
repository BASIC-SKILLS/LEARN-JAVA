package sec06.ch06;

public class PolymoMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		roar(cat);  //객체 생성 없이 클래스명 적은 것 없이 메소드가 호출되었으니까 "메소드가 호출된 클래스내의" 미리 메모리에 올라오는 "static"으로 만들어진 메소드이다. 
		roar(pig);
		roar(hamster);
	}
	
	
	static void roar(Animal animal) { //부모타입의 변수는 자식객체 가리킬 수 있다. //cat에는 new Cat()의 주소값이 있다. // animal에 new Cat()의 주소값이 왔고, Animal이라는 부모타입의 변수가 자식객체인 new Cat()을 가리키고 있다.
		animal.cry();   //타입이 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다. //animal이 cry라는 메소드를 알고, 이 cry 메소드가 호출 되었을 때, 기준은 객체의 메소드가 호출 되는 것이니까, new Cat()의 메소드가 호출되는 것이다. 
	}
	//메소드들은 형제지만 서로를 모른다. 호출해야만 안다. 
	
	//객체지향에서 부모클래스로 올라갈수록 추상화, 자식클래스로 내려갈수록 상세화
	//MVC는 객체지향과 관련이 없다. 
	//하나의 메소드는 하나의 일만 해야한다ㅏ. 
}

class Pig extends Animal {
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
}

class Hamster extends Animal {
	@Override
	void cry() {
		System.out.println("찍!찍!");
	}
}

