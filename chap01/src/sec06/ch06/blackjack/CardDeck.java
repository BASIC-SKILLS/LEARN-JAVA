package sec06.ch06.blackjack;

public class CardDeck {
	private final Card[] CARDDECK = new Card[52]; //참조형의 상수는 주소값을 변경할 수 없을 뿐, 값은 바꿀 수 있다. -> Card[55]이렇게 바꿀 수 있다. 
	//private final static Card[] CARDDECK = new Card[52]; //이렇게 해도 값은 바꿀 수 있다. 다만 객체와 상관이 없어질 뿐이고 딱 하나만 만들어질 뿐이다. 
	
	public CardDeck() { 
		super();
		init();
		
	} //클래스가 public이면 생성자도 public으로 맞춰준다. 만약 안주면 같은 패키지 내에서만 접근이 가능해진다. 
	
	private final String[] pattern = {"spades", "Hearts", "Diamonds", "Clubs"};
	private final String[] symbole = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	private void init() {
		int cardCount = 0;
		for (String patternP : pattern ) {
			for (String symboleP : symbole) {
				//생성자는(오버로딩은) 객체 생성하는 그 순간에 값을 넣고 싶다면(지정하고 싶다면) 쓴다! CardDeck.java
				Card card = new Card(patternP, symboleP);
				CARDDECK[cardCount++] = card;
			}
		}
	}
	
	private void init2() {
		int cardCount = 0;
		
		for (String patternP : pattern) {
			for (int i=1; i<=13; i++) {
				String symbole = "";
				
				switch(i) {
				case 1 : symbole = "A"; break;
				case 11 : symbole = "J"; break;
				case 12 : symbole = "Q"; break;
				case 13 : symbole = "K"; break;
				default : symbole = Integer.toString(i);
				}
				
				Card card = new Card(patternP, symbole);
				CARDDECK[cardCount++] = card;
			}
		}
	}
	
	private void init3() {
		for (int i=0; i<CARDDECK.length; i++) {
			Card card = new Card(pattern[i%pattern.length],symbole[i%symbole.length]);
			CARDDECK[i] = card;
		}
	}
	
	private int getRandomIdx() {
		return (int) (Math.random() * CARDDECK.length);
	}
	
	private Card getRandomCard(int idx) {
		Card c = CARDDECK[idx];
		CARDDECK[idx] = null;
		return c;
	}
	
	public Card getOneCard() {
		int idx = 0;
		
		while(true) {
			idx = getRandomIdx();
			if (CARDDECK[idx] != null) {
				return getRandomCard(idx);
			} 
		}
	}
	
	public void printAll() {
		for (Card c : CARDDECK) {
			System.out.println(c);
		}
	}
}

