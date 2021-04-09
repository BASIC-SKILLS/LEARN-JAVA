package sec06.ch06.blackjack;

public class Card {
	private String pattern;
	private String symbol;
	
	Card() { super(); }
	
	Card(String pattern, String symbol) {
		super();
		this.pattern = pattern;
		this.symbol = symbol;
	}

	public String getPattern() {
		return pattern;
	}

	public String getSymbol() {
		return symbol;
	}
	
	@Override //object의 toString 메소드를 오버라이드 하는 것이다. 
	public String toString() {
		return String.format("%s (%s)", this.pattern, this.symbol);
	}
}
