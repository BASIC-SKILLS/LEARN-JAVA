package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {

	public static void main(String[] args) {
		int[] arr = {8, 7, 3, 1, 6};
		System.out.println(Arrays.toString(arr));
		int iRange = arr.length-1;
		
		for (int i=iRange; i>0; i--) {
			for (int z=0; z<i; z++) {
				int re = z+1;
				if (arr[z] > arr[re]) {
					int cup = arr[z];
					arr[z] = arr[re];
					arr[re] = cup;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
