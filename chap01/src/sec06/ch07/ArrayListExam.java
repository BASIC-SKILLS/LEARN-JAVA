package sec06.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import sec06.ch06.blackjack.Card;

public class ArrayListExam {

	public static void main(String[] args) {
		//list는 인터페이스이다. 
		//list 인터페이스를 상속받은 건 두 가지만 있다.
		//현제는 제네릭을 이용하여 제약사항을 주지 않았다.
		List list = new ArrayList();
		List list2 = new LinkedList();
		
		//object값이 들어간다.
		list.add(10);
		list.add(10.1);
		list.add("ddd");
		list.add(new Card("", ""));
		
		//get메소드의 파라미터는 int 반환타입은 object -> 그래서 형변환이 필수 
		//ArrayList는 순서가 있기 때문에 순서로 꺼내야 한다. 
		Object obj = list.get(1);
		double val = (double)obj;
		System.out.println("val : " + val);
		
		int val2 = (int) list.get(0);
		System.out.println("val2 : " + val2);
		
	}

}
