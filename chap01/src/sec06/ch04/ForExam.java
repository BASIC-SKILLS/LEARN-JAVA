package sec06.ch04;

public class ForExam {

	public static void main(String[] args) {
		
		for(int a=0; a<10; a++) {
			System.out.println("i : " + a);
		}
		
		System.out.println("a----------------------");
		
		for(int b=20; b<51; b++) {
			System.out.println(b);
		}
		
		System.out.println("b-------------------");
		
		for(int c=0; c<51; c++) {
			System.out.println(c + 20);
		}
		
		System.out.println("c----------------------");
		
		for(int d=52; d<=60; d++) {
			System.out.println(d - 28);
		}
		
		System.out.println("d-----------------------");
		
		int sum = 0;
		for (int d=1; d<=21; d++) {
			sum += d;
		}
		System.out.println(sum);
		
		System.out.println("e-----------------------");
		
		int star = (int) (Math.random()*6) + 5;
		System.out.println("star : " + star);
		for (int i=0; i<=star; i++) {
			System.out.print("*");
		}
	}

}
