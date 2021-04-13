package sec06.ch07;

public interface RemoteControl {
//메소드 기준으로 선언부만 가능 
//변수 X 상수만 저장 가능
	
//변수에 public static final이 필수로 들어가기 때문에, 안적어도 자동 변경되어 그 부분은 생략되는 것 뿐이다.
//int age = 10; 이렇게 생략하여  변수를 선언해도 public static final int age = 10;으로 자동 변경된다. 
	
	//public abstract가 필수로 들어간다. 안적어도 public abstract volumeUp()으로 자동 변경되어 그 부분은 생략되는 것 뿐이다. 
	void volumeUp();
	void volumeDown();
	void chkVolume();
}

/*
default (아무것도 안 쓴 상태) : 같은 패키지 안에서만 접근 가능
protected : 같은 패키지 안에서, 패키지 밖에서는 상속관계에서만 접근 가능 
private : class { } 범위 안에서만, 같은 클래스 안에서만
public : 어디서든
 */

/*
 추상클래스 vs 인터페이스
 
- 추상클래스 
 객체화 불가능 -> 부모(type) 역할만 함
 자식에게 추상메소드 오버라이딩 강제성 부여 
 
 다중상속 불가능
 변수 가질 수 있음
 상수 가질 수 있음
 구현부 있는 메소드 가질 수 있음
 추상메소드 가질 수 있음
 
 
 
 
- 인터페이스
  객체화 불가능 -> 부모(type) 역할만 함
 자식에게 추상메소드 오버라이딩 강제성 부여 
  다중 상속 가능
  변수 가질 수 없음
  무조건 상수만 가질 수 있음
  구현부 있는 메소드 가질 수 없음 
  무조건 추상메소드만 가질 수 있음
 */

