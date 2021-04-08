package sec06.ch06;

public class StaticExam2 {
	public static void main(String[] args) {
		
		System.out.println("Toy2 장난감 생산 갯수 : " + Toy2.makeCount); //0
		
		Toy2 t2_1 = new Toy2(); // 1
		Toy2 t2_2 = new Toy2(); // 2
		Toy2 t2_3 = new Toy2(); // 3

		System.out.println("Toy2 t2_1 장난감 생산 갯수 : " + t2_1.makeCount); //3
		System.out.println("Toy2 t2_2 장난감 생산 갯수 : " + t2_2.makeCount); //3
		System.out.println("Toy2 t2_3 장난감 생산 갯수 : " + t2_3.makeCount); //3
		System.out.println("Toy2 장난감 생산 갯수 : " + Toy2.makeCount); //3
		
		System.out.println();
		
		Toy2 t2_4 = new Toy2(); // 4
		Toy2 t2_5 = new Toy2(); // 5
		System.out.println("Toy2 t2_4 장난감 생산 갯수 : " + t2_4.makeCount); //5
		System.out.println("Toy2 t2_5 장난감 생산 갯수 : " + t2_5.makeCount); //5
		System.out.println("Toy2 장난감 생산 갯수 : " + Toy2.makeCount);  //5
		
		System.out.println();
		
		Toy2.makeCount = 10;
		System.out.println("Toy2 장난감 생산 갯수 : " + Toy2.makeCount);  //10

		
		System.out.println("---------------------------------");
		
		System.out.println("Toy3 장난감 생산 갯수 : " + Toy3.makeCount); //0 
		System.out.println("Toy3 장난감 생산 갯수 : " + Toy3.makeCount); //0 //생성자를 만들지 않았기 때문에
		
		System.out.println("-----------------------------");
		
		Toy4 t4 = new Toy4(); //1
		Toy4 t4_1 = new Toy4();  //1
		Toy4 t4_2 = new Toy4(); //1
		
		System.out.println("Toy4 t4 장난감 생산 갯수 : " + t4.makeCount);
		System.out.println("Toy4 t4_1 장난감 생산 갯수 : " + t4_1.makeCount);
		System.out.println("Toy4 t4_2 장난감 생산 갯수 : " + t4_2.makeCount); //각각 1보다 더 커질 수 없다. 
		
		System.out.println("------------------------------------");
		
		Toy5 t5 = new Toy5(); //Toy3 -> 1
		Toy5 t5_1 = new Toy5(); //Toy3 -> 2
		Toy5 t5_2 = new Toy5(); //Toy3 -> 3
		System.out.println("Toy3 장난감 생산 갯수 : " + Toy3.makeCount); //3 
		
	}
}

class Toy4 {
	int makeCount;

	Toy4() {
		makeCount++;    //1보다 더 커질 수 없다. //각각 다른 것이기 때문에 
	}
}

class Toy3 {
	static int makeCount = 0; //객체를 하던 말든 전혀 상관이 없다. //객체는 HEAP, static은 CLASS메모리. 

	Toy3() {
		makeCount++;  //계속 계속 더 커질 수 있다. //하나이기 떄문에 //공용이기 떄문에
	}
}

class Toy2 {
	static int makeCount; // static이 붙지 않았다면 이 멤버필드는 생성되는 객체마다 다른 멤버필드가 된다.

	Toy2() {
		makeCount++; // 생성자가 호출될 떄마다 1씩 올라간다 계속 올라갈 수 있다. 
	}
}


class Toy5 {
	static int makeCount = 0;
	Toy5() {
		Toy3.makeCount++;  //Toy5의 생성자를 만들 때마다 Toy3의 의 makeCount가 올라가게 만들었다. 
	}
}