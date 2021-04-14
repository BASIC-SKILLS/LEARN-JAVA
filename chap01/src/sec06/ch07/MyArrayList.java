package sec06.ch07;

public class MyArrayList implements MyList{
	//ArrayList는 배열을 이용하기 때문에. 
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
		//메소드가 종료되면 newArray는 죽는다.결국 intArray만 새로운 배열을 가리키고 있다. 
	}
	
	@Override
	public void add(int index, int value) {
		int[] newArray = new int[intArray.length+1];
		for (int i=0; i<index; i++) {
			newArray[i] = intArray[i];
		}
		newArray[index] = value;
		for (int i=index; i<intArray.length; i++) {
			newArray[i+1] = intArray[i];
		}
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

	//지웠는 값을 빼서 return해주고 배열에서는 뺀다.
	@Override
	public int remove() {
		int[] newArray = new int[intArray.length-1]; 
		for (int i=0; i<newArray.length; i++) {
			newArray[i] = intArray[i];
		}
		int removeVal = intArray[intArray.length-1];
		intArray = newArray;
		return removeVal;
	}
	
	@Override
	public int remove(int index) {
		int removeVal = intArray[index];
		
		int[] newArray = new int[intArray.length-1]; 
		for (int i=0; i<newArray.length; i++) {
			int newArrIdx = i < index ? i : i+1;
			newArray[i] = intArray[newArrIdx];
		}
		
		intArray = newArray;
		return removeVal;
	}
}
