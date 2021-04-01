package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {

	public static void main(String[] args) {
		int[] arr = {68, 65, 23, 1, 900, 42, 95};
		
		int cup = arr[0];
		arr[0] = arr[1];
		arr[1] = cup;
		
		System.out.println(Arrays.toString(arr));
	}

}
