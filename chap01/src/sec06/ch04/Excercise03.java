package sec06.ch04;

public class Excercise03 {

	public static void main(String[] args) {
		int sum=0;
		String str = "3의 배수 : ";
		for (int i=1; i<101; i++) {
			if (i%3 == 0) {
				sum += i;
				str += i;
				if (i != 99)
				str += ", ";
			}
		}
		System.out.println(str);
		System.out.println("3의 배수의 총합 : " + sum);
		
	}

}
