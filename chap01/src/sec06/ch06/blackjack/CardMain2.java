package sec06.ch06.blackjack;

public class CardMain2 {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Card card1 = cd.getOneCard(); //cd.getOneCard()가 리턴할 수 있는 것은 Card type, 또는 Card의 자식들 type
		System.out.println(card1);
		
		Card card2 = cd.getOneCard();
		System.out.println(card2);
		
		System.out.println(".................................................................");
		
		cd.printAll();
	
	}
	
 

}
