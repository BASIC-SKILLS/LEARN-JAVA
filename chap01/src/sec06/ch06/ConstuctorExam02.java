package sec06.ch06;

//this()
public class ConstuctorExam02 {

	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		
	}
}


class Tv2 {
	
	String brand;
	int inch;
	int maxChannel;
	int currentChannel;
	int maxVolume;
	int currentVolume;
	
	Tv2() {
		this("일렉트로", 50, 100, 50); //this() -> 무조건 이 클래스의 오버라이드 된 생성자
	}
	
	Tv2(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand; //this. -> 멤버필드, 멤버메소드 호출, 쓰기, 읽기 가능 //this() -> 생성자 호출
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	void volumeUp() {
		this.currentVolume++; 
	}

	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n\n", brand, inch, maxChannel, maxVolume);
	}
}