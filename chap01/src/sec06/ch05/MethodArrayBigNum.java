package sec06.ch05;

public class MethodArrayBigNum {
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 4, 9, 3, 5};
		
		System.out.println(whoIsBig(arr));
		
	}
	private static int whoIsBig(int[] arr) {
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
}
