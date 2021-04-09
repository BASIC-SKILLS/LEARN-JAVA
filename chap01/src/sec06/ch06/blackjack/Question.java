package sec06.ch06.blackjack;

public class Question {
// 카드 패턴 문자열 값을 저장할 수 있는 pattern 멤버필드 존재 
// 카드심볼 문자열 값을 저장할 수 있는 symbol 멤버필드 존재
// 멤버필드는 은닉화 
// 멤버필드에 값을 주입할 수 있는 overloaded 생성자가 있다. 
// 멤버필드 카드패턴의 getter메소드 존재
// 멤버필드 카드심볼의 getter메소드 존재
// 아래 예처럼 동작하도록 toString메소드를 오버라이딩 한다. //println의 메소드를 활용하는 것
		//기본적으로 System.out.println(c1);이렇게 쓰면 System.out.println(c1.toString); 자동으로 이렇게 된다. println메소드는 toString메소드를 호출한다. 
		//toString()메소드는 Object클래스의 메소드이다. 
	
	

//클래스명 CardDeck
//3문항에서 생성한 Card 클래스를 활용 
// -카드 패턴 : Spades, Hearts, Diamonds, Clubs
// -카드 심볼 : A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
// 52개의 Card 객체를 담을 수 있는 은닉화된 전역 배열 상수 존재 
//기본 생성자 정의 (아래 요구사항을 수행)
//모두 다른 값을 가지고 있는 52개의 Card 객체를 생성한다. (하나의 패턴은 13개의 심볼을 가질 수 있다.)
//배열에 모든 Card 객체를 담는다.  
}
