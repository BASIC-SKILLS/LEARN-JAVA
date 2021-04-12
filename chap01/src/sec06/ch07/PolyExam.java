package sec06.ch07;

public class PolyExam {
/*
 	1. 부모타입은 자식 객체 가리킬 수 있다. (참조, 저장)
 	2. 자식타입은 부모 객체 가리킬 수 없다. -> 이유 : 3. 타입이 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다. 
 
 
 */
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();   
		
		//Bus bus1 = new Car();
		//Bus bus1 = (Bus) new Car();
		// bus1.openDoor();
		//Bus type은 Car()객체가 가진 메소드를 실행할 수 없으므로. 
		
		Bus bus1 = (Bus) car1;
		bus1.openDoor();
		bus1.hoot(); //bus1가 가리키는 객체는 Bus()
		
		System.out.println("............................");
		
		Car carP = bus1; //carP가 가리키는 객체는 Bus()
		carP.hoot();
	}

}




