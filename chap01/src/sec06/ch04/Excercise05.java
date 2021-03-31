package sec06.ch04;

public class Excercise05 {

	public static void main(String[] args) {

		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				if (((4 * x) + (5 * y)) == 60) {
					System.out.printf("( %d, %d )\n", x, y);
				}
			}
		}
	}
}
