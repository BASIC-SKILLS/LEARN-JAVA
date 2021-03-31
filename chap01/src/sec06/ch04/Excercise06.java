package sec06.ch04;

import java.util.Scanner;

public class Excercise06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		
		OUT: //while(true) 
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("   1.예금 | 2.출금 | 3.잔고 | 4. 종료   ");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1 : System.out.print("예금액> "); balance += scan.nextInt(); break;
			case 2 : System.out.print("출금액> "); balance -= scan.nextInt(); break;
			case 3 : System.out.printf("잔고> %d\n", balance); break;
			case 4 : System.out.println(); System.out.println("프로그램 종료"); break OUT;
			default: System.out.println("위의 보기 중에서 선택해주세요."); break;
			}
		}
		
		scan.close();
		
	}
}
