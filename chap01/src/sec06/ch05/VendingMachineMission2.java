package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] vmMenu = {"콜라", "사이다", "환타", "아이스티"};
		int[] vmMenuPrice = {1000, 1200, 1300, 1500};
		int[] count = new int[vmMenu.length];
		
		int totalPrice = 0;
		
		System.out.print("돈을 주입해주세요 : ");
		int money = scan.nextInt();
		
		int changes = money;
		
		CHOICE:
		while (true) {
			System.out.println("<menu>");
			System.out.println("0. 종료");
			for(int i=0; i<vmMenu.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", (i+1), vmMenu[i], vmMenuPrice[i]) ;
			}
			
			System.out.print("선택>");
			int choice = scan.nextInt();
			
			if(choice<=vmMenu.length) {
				if(choice == 0) {
					System.out.println("0번을 선택하셨습니다. 종료합니다.");
					for (int i=0; i<vmMenu.length; i++) {
						System.out.printf("%s : %d개  ", vmMenu[i], count[i]);
					}
					break CHOICE;
				} else {
					int realChoice = choice-1;
					if (changes>=vmMenuPrice[realChoice]) {
						System.out.printf("%s를 선택하셨습니다. 가격은 %,d원입니다\n", vmMenu[realChoice], vmMenuPrice[realChoice]);
						totalPrice += vmMenuPrice[realChoice];
						changes -= vmMenuPrice[realChoice];
						
						count[realChoice]++;
					} else { System.out.println("금액이 부족합니다. 종료합니다."); break CHOICE;}
				}
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
		}
		
		System.out.printf("\n%,d원 중 총 %,d원을 쓰셨습니다.\n", money, totalPrice);
		System.out.printf("%,d원을 반환합니다.\n", changes);
		
		scan.close();
	}	
}


