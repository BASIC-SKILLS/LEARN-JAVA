package sec06.ch07;
//추상클래스 abstract class , 추상메소드 abstract -> 클래스와 메소드에 꼭 abstract를 써야 한다. 
//추상 클래스는 객체화를 할 수 없다. 
//부모역할만 하겠다(자식들이 꼭 갖춰야 할 틀을 강제한다) 라는 의미의 클래스 그러므로 반드시 메소드를 오버라이드 해야한다. 오버라이드 필수 
public abstract class Animal {
	private int age;
	private String name;
	
	// 메소드에 선언부만 있고 구현부는 없는 것 -> 추상메소드 
	public abstract void howl();
	
	// 이렇게 구현부도 있는 메소드도 만들 수 있는 것이 인터페이스와 추상클래스의 차이점이다. 
	public void breath() {
		System.out.println("숨쉰다.");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Cat extends Animal {
	@Override
	public void howl() {
		System.out.println("야옹야옹");
	}
}

class Dog extends Animal {
	@Override
	public void howl() {
		System.out.println("멍멍");
	}
}
