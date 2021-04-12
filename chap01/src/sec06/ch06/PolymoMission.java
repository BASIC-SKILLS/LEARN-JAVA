package sec06.ch06;

public class PolymoMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Animal pig = new Pig();
		
		//이 상태로 Hamster객체의 메소드 runrail()을 사용 불가 (hamster의 type은 Animal이기 때문에)
		Animal hamster = new Hamster();
		//형변환을 이용하여 Hamster type 변수 h에 hamster 참조변수에 들어있는 Hamster객체의 주소값을 대입한다. 
		Hamster h = (Hamster) hamster;
		//그리고 Hamster객체의 runrail메소드를 사용할 수 있다. 
		h.runRail();
		
		System.out.println("............................................");
		
		roar(cat);  //객체 생성 없이 클래스명 적은 것 없이 메소드가 호출되었으니까 "메소드가 호출된 클래스내의" 미리 메모리에 올라오는 "static"으로 만들어진 메소드이다. 
		roar(pig);
		roar(hamster);
		
		
		//instaceof는 상속관계일 때 사용하는 기능 
		//"A instanceof type" A에 들어있는 주소값이 type으로 형변환이 가능한가의 여부에 따라 true, false를 반환 
		// Hamster hhh = (Hamster) pig -> 둘은 형제관계라서 남이나 마찬가지라서 런타임에러
		// A가 type의 부모 type이지만 가리키는 객체가 다른 경우만 가능하다. 
		System.out.println(hamster instanceof Hamster);
		System.out.println(pig instanceof Hamster);
		
		
		
	}
	
	//인자를 최상위 부모type으로 한다.
	static void roar(Animal animal) { //부모타입의 변수는 자식객체 가리킬 수 있다. //cat에는 new Cat()의 주소값이 있다. // animal에 new Cat()의 주소값이 왔고, Animal이라는 부모타입의 변수가 자식객체인 new Cat()을 가리키고 있다.
		animal.cry();   //타입이 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다. //animal이 cry라는 메소드를 알고, 이 cry 메소드가 호출 되었을 때, 기준은 객체의 메소드가 호출 되는 것이니까, new Cat()의 메소드가 호출되는 것이다. 
		
	}
	//메소드들은 형제지만 서로를 모른다. 호출해야만 안다. 
	
	//객체지향에서 부모클래스로 올라갈수록 추상화, 자식클래스로 내려갈수록 상세화
	//MVC는 객체지향과 관련이 없다. 
	//하나의 메소드는 하나의 일만 해야한다. 
	
	static void roar2(Animal animal) {
		if (animal instanceof Hamster) {
			((Hamster) animal).runRail();
		} else {
			animal.cry();
		}
	}
	
}

class Pig extends Animal {
	@Override
	void cry() {
		System.out.println("꿀꿀");
	}
}

class Hamster extends Animal {
	public void runRail() {
		System.out.println("쳇바퀴를 돌린다 찍찍!!");
	}
	
	@Override
	void cry() {
		System.out.println("찍!찍!");
	}
}

