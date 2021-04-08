package sec06.ch06;

public class ConstuctorExam01 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume = 100;
		tv1.displayState();
		
		Tv tv2 = new Tv("Lg", 120, 300, 200); 
		tv2.displayState();
	}
}
//(쓰기)메소드 setter, 생성자
//private 멤버필드의 값을 바꿀 수 있는 것은 메소드 setter와 생성자 밖에 없다.
//만약에 setter가 없고 생성자만 있다면, 생성자는 생성할 때만 만들 수 있기 때문에,
//생성되는 순간 주입되는 값이 더이상 바뀌지 않는다. 마치 상수처럼 되버린다. 
//(읽기)매소드 getter 
class Tv {
	
	String brand;
	int inch;
	int maxChannel;
	int currentChannel;
	int maxVolume;
	int currentVolume;
	
	
	//기본 생성자
	//생성자 vs 메소드
	//이름은 클래스명과 같다. //생성자와 메소드가 다른 점1   //유일하게 메소드인데 대문자로 시작할 수 있는 것 
	//리턴타입이 없다.      //생성자와 메소드가 다른 점 1
	//객체를 생성할 때만 사용할 수 있는 메소드
	//컴파일러가 생성자가 하나도 없을 때 기본 생성자를 "Tv() { }" 만들어준다.
	Tv() {
		System.out.println("Tv 기본 생성자");
	}
	
	//오버라이드 된 생성자
	//객체 생성시 멤버변수를 초기화 하는 용도.
	//오버라이드 된 생성자만 만들면, 생성자가 있기 때문에, 컴파일러가 따로 기본 생성자를 만들어주지 않는다.
	//그래서 기본 생성자를 만들어줘야 한다. 
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand; //this :  객체 자신의 !!!! //this() : 생성자 
							//이 Tv{ }클래스의 brand에 인자값으로 들어온 brand를 넣는다. 
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
		
	
	//기본생성자와 오버라이드된 생성자가 모두 없을 때는 기본 생성자가 만들어져서 
	//여기는 에러가 안 생기지만, Tv tv1 = new Tv(); 
	//여기는 에러가 생긴다. Tv tv2 = new Tv("Lg", 120, 300, 200); 
	//오버라이드된 생성자만 만든다면, 여기는 에러가 안생기지만, Tv tv2 = new Tv("Lg", 120, 300, 200); 
	//여기는 에러가 생긴다.Tv tv1 = new Tv(); 
	//컴파일러가 따로 기본 생성자를 만들어주지 않기 때문이다. 
	//그러므로 둘 다 사용해야 한다면 둘 다 따로 만들어줘야 한다. 
	
	void volumeUp() {
		this.currentVolume++; //currentVolume은 인자값으로 들어오지 않기 떄문에 this.를 붙이지 않아도 이 Tv{ }클래스의 currentVolume이 올라간다.
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n\n", brand, inch, maxChannel, maxVolume);
	}
}