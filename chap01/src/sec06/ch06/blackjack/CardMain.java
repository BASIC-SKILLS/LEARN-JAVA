package sec06.ch06.blackjack;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("spade", "K");
		System.out.println(c1);
	
		Card c2 = new Card("heart", "2");
		System.out.println(c2);
		
		/*
		println("dkdkdkdkdk"); //-> println(String str) { }를 호출한다.
		println(c2); //-> println(Object obj) { }를 호출한다. -> 결국에는 println(String str) { }을 호출한다. 
		*/
	}
	
	/*
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		System.out.println("obj!!");
		String str = obj.toString();
		println(str); //위의 println(String str)메소드를 호출 한 것. 
	}
	*/

}
