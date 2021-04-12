package sec06.ch07;

public class PolyExam2 {

	public static void main(String[] args) {
		//instaceof는 상속관계일 때 사용하는 기능 
		
		Car car1 = new LocalBus();
		
		System.out.println(car1 instanceof LocalBus); //car1아, 너 LocalBus type으로 형변환 가능하니?
		
		LocalBus b1 = (LocalBus) car1;
		System.out.println(car1 instanceof Bus);
		
		System.out.println(car1 instanceof Object);
	}

}




