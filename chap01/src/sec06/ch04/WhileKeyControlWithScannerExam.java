package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControlWithScannerExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		System.out.print("-----------------");
		System.out.print("1.증속 | 2.감속 | 3. 중지");
		System.out.print("-----------------\n");
		System.out.println();
		
		while (true) {
			System.out.print("선택 : ");
			int option = scan.nextInt();
			
			if (option == 1) { speed++; }
			else if (option == 2) { speed--; }
			else if (option == 3) { break; }
			else {
				System.out.println("1, 2, 3번만 입력해주세요.");
				continue;
			}
			
			System.out.println("현재 속도 : " + speed);
		}
		
		System.out.println("마지막 속도 : " + speed);
		System.out.println("끝났습니다.");
		
		scan.close();
	}

}
