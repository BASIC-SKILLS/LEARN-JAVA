package sec06.ch05;

public class ArrayExam {

	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i=0; i<array.length; i++) {
			array[i] = 20;
		}
		for (int i=0; i<array.length; i++) {
			System.out.printf("array[%d] : %d\n", i, array[i]);
		}
	}

}
