package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] vmMenu = {"콜라", "사이다", "환타", "아이스티"};
		int[] vmMenuPrice = {1000, 1200, 1300, 1500};
		int toalPrice = 0;
		
		int[] count = new int[vmMenu.length];
		
		CHOICE:
		while (true) {
			System.out.println("<menu>");
			System.out.println("0. 종료");
			for(int i=0; i<vmMenu.length; i++) {
				System.out.printf("%d. %s (%,3d원)\n", (i+1), vmMenu[i], vmMenuPrice[i]) ;
			}
			System.out.print("선택>");
			int choice = scan.nextInt();
			
			if(choice<(vmMenu.length+1)) {
				if(choice == 0) {
					System.out.println("0번을 선택하셨습니다. 종료합니다.");
					for (int i=0; i<vmMenu.length; i++) {
						System.out.printf("%s : %d개  ", vmMenu[i], count[i]);
					}
					break CHOICE;
				} else {
					int realChoice = choice-1;
					System.out.printf("%s를 선택하셨습니다.\n가격은 %,3d원입니다\n", vmMenu[realChoice], vmMenuPrice[realChoice]);
					toalPrice += vmMenuPrice[realChoice];
					
					count[realChoice]++;
				}
			} else {
				System.out.println("잘못 선택하셨습니다.");
			}
		}
		System.out.printf("\n총 %,3d원을 사용하셨습니다.\n", toalPrice);
		
	
	
	}	
}


