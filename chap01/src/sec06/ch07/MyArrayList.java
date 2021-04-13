package sec06.ch07;

public class MyArrayList implements MyList{
	private int[] intArray;
	
	//0번 방이 있는 게 아니고, 방이 아예 없는 것이다. 
	public MyArrayList() { intArray = new int[0]; }
	
	@Override
	public void add(int value) {
		int[] newArray = new int[intArray.length+1];
		for (int i=0; i<intArray.length; i++) {
			newArray[i] = intArray[i];
		}
		newArray[intArray.length] = value; // 배열의 길이 - 1 = 배열의 끝방 번호
		intArray = newArray;
	}

	@Override
	public int size() {
		return intArray.length;
	}

	@Override
	public int get(int index) {
		return intArray[index];
	}

	
	
}
