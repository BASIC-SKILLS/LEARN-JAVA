package sec06.ch07;

public class PolyMission {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		
		//Bus, LocalBus 객체이면 openDoor메소드 호출
		//그 외는 hoot메소드 호출 
		blowKlaxon(car1); //객체화 하지 않고 메소드를 썼다 -> 객체화를 하지 않고 메소드를 쓸 수 있는 것은 static밖에 없다 -> 클래스명을 쓰지 않아도 static을 썼다 -> 같은 클래스 내에 있어서 미리 메모리에 올려져 있기 떄문에 클래스명없이 static메소드를 쓸 수 있게 되었다. 
		blowKlaxon(car2); 
		blowKlaxon(car3);
		blowKlaxon(car4);
		
		System.out.println("..........................");
        
     
	}
	
	public static void blowKlaxon(Car car) {
		if (car instanceof Bus) {
			((Bus) car).openDoor();
		} else {
			car.hoot();
		}
	}
}
