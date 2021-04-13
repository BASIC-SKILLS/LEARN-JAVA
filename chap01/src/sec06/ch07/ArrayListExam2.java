package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam2 {

	public static void main(String[] args) {
		//제네릭 - 제약사항
		List<Card> list = new ArrayList<>();
		Card c1 = new Card("","");
		
		list.add(c1);
		//list.add("ddd");
		//list.add(1);
		
		//굳이 형변환 하지 않아도 된다. 
		Card c2 = list.get(0);
		
	}

}
