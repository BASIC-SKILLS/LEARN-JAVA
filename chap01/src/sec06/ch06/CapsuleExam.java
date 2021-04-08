package sec06.ch06;

public class CapsuleExam {

	public static void main(String[] args) {
		Human mrHong = new Human();
		mrHong.setName("홍길동");
		mrHong.setAge(12);
		mrHong.whoAmI();
		
		Human msShin = new Human();
		msShin.setName("신사임당");
		msShin.setAge(20);
		msShin.whoAmI();
		
		System.out.println("----------------------------------");
		
		Human who = new Human();
		Human msPyeong = new Human("평강공주");
		Human howOld = new Human(30);
		Human mrLee = new Human("이순신", 20);
		
		who.whoAmI();
		msPyeong.whoAmI();
		howOld.whoAmI();
		mrLee.whoAmI();
	}
}

class Human {
	private int age;
	private String name;
	
	Human() {
		this(10);
	}
	
	Human(String name) {
		this(name, 10);
	}
	
	Human(int age) {
		this("미상", age);
	}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void whoAmI() {
		System.out.printf("내 이름은 %s, %d살이죠.\n\n", name, age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
