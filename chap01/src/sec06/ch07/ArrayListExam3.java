package sec06.ch07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam3 {

	public static void main(String[] args) {
		//Wrapper class 또는 reference type만 <>안에 올 수 있다. 
		List<Integer> list = new ArrayList();
		
		list.add(10); 
		list.add(20); 
		list.add(30);
		
		for (int i=0; i<list.size(); i++) {
			System.out.printf("%d : %d\n", i, list.get(i));
		}
		
		for (int num : list) {
			System.out.println(num);
		}
		
		
	}

}
