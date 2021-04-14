package sec06.ch07;

public class ArrayListMission {

	public static void main(String[] args) {
		//MyList - Interface, MyArrayList - class
		
		MyList list = new MyArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		int removeVal = list.remove();
		System.out.println(removeVal);
		
		System.out.println();
		
		list.add(2, 30);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		int delVal = list.remove(1);
		System.out.println(delVal);
		
	}

}
