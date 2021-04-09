package sec06.ch06;

public class InheritExam {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.cry();
		
		Cat cat = new Cat(); //Cat{}이 알고 있는 것만 쓸 수 있다. (Animal로부터 상속받은 name, age, cry(), 자신의 lick())
		cat.name = "고양이";
		cat.age = 4;
		cat.cry();
		
		KoShort koShort = new KoShort();
		koShort.cry();
		koShort.lick();
		koShort.pee();
	}
}

class Animal { //부모는 절대 자식의 존재를 모른다.  //자식은 절대 부모에게 영향을 끼칠 수 없다. //상속은 클래스끼리 한다. 
				//자바의 모든 클래스는 Object라는 클래스를 상속받는다. Object는 자바의 최상위 부모. 그래서 자바의 모든 객체들은 Object의 메소드들을 실행할 수 있다. 
				//아무 것도 상속받지 않은 것 같은 클래스도 사실은 "extends Object"를 "class 이름" 옆에 적혀있는데, 안보이는 것 이다. 
				//그래서 모든 클래스들의 생성자는 클래스명() {super()} 모양으로 만들어진다. 
	String name;
	int age;
	
	Animal() {
		super();
	}
	
	/*
	public Animal(String name, int age) {
		super();
		
		this.name = name;
		this.age = age;
	}
	*/

	void cry() {
		System.out.println("운다\n\n");
	}

}

class Cat extends Animal { // extends - 상속 //자식은 부모보다 커질 수는 있지만 부모보다 줄어들 수는 없다 // 자바는 다중 상속이 안된다. 
	//생성자가 없을 시에는 컴파일러가 자동으로 생성자와 super()를 넣어준다. 아래의 내용 그대로 넣어준다. 다만 생성자가 없을 시에만
	//셍성자에서는 절대 super()보다 먼저 소스가 생길 수 없다. 

	 Cat() {
		//super(" ", 0); //직속부모의 생성자. //부모클래스에 생성자가 없기 때문에 자식클래스에서 직속부모클래스의 생성자를 호출할 때, 매개변수에 맞게 해줘야 한다. 
	} 
	 
	
	
	void lick() {
		System.out.printf("%s가 핱다\n\n", name); //name 따로 선언안해도 사용할 수 있다. 
	}
	
	@Override //부모클래스의 메소드의 내용이 마음에 안들어서 내가 수정할 때, 부모꺼를 쓰는데 내 방식을 덮어서 쓰겠다. 
	void cry() {
		System.out.println("야옹");
	}

}

class KoShort extends Cat { //Cat도 상속받고 Animal도 상속받는다.
	void pee() {
		System.out.printf("%s가 소변을 본다\n\n", name);
	}
}



/*

[heap]
Cat{}의 객체가 만들어진 순간.
						아래의 순서대로 객체가 만들어진다. 
							[Object]  
								↓
							[Animal]                                             여기에 cry() 있어? -> 있어. -> 그래. 쓰자. 
								↓                                                   ↑
							[Cat]          cat.cry(); -> 여기에 cry()있어? -> 없어 -> 위로 올라가자

그래서 어떤 객체를 만들든 Object 객체도 같이 만들어지기 때문에 객체는 기본적으로 2개로 만들어진다. 

[stack]
생성자가 만들어지는 순서

|super()->Object()| -> 실행 없어짐.     Animal() { super() } -> Animal()메소드 호출 후 -> super()메소드 호출 -> 결국 Object()호출 -> Object 객체 생성 -> 메소드 소멸 -> Animal 객체 생성 ->  메소드 소멸 -> Cat 객체 생성 -> 메소드 소멸 -> 최종적으로 위의 객체형태로 객체들이 만들어진다. 
|super()->Animal()| -> 실행 없어짐.                                        ↑
|Cat()			  | -> 실행 없어짐.       Cat() { super() }   -> Cat()메소드 호출 후-> super()메소드 호출 -> 결국 Animal()호출 
-------------------	






*/


//일반적인 클래스의 순서 { 멤버필드 -> 생성자 -> 메소드 } 