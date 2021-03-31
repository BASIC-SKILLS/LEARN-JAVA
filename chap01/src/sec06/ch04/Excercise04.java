package sec06.ch04;

public class Excercise04 {

	public static void main(String[] args) {
		
			while (true) {
				int dice = (int) (Math.random()*6) + 1;
				int eye = (int) (Math.random()*6) + 1;
				
				if ((dice+eye) != 5) {
					System.out.printf("(%d , %d)\n", dice, eye);	
				} else {
					System.out.printf("------- !!! ------\n(%d , %d)\n눈의 합이 5입니다. 주사위를 멈춥니다.",  dice, eye);
					break;
				}
		}
		
	}

}
