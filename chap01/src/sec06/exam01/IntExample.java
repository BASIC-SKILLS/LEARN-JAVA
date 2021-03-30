package sec06.exam01;

public class IntExample {
	/*
	 *  정수 모두 정리
	 */
	public static void main(String[] args) {
		char c = 'a'; //char은 문자 하나만, 빈문자('')도 안된다.
		// 실제 저장되는 값은 정수값으로 저장된다. 
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		// 자동형변환 (아무 문제가 안될 떄는 자동으로 형변환 해주는 것이다.)
		// 문제가 될 때, 더 작은 형으로 변환할 떄 (int->short, byte // long->int, short, byte ..)
		s = b;
		// 강제 형변환
		s = (short) b;
		 //이때는 문제가 될 수 있기 떄문에 자동으로 형변환 하지 않고, 개발자가 판단하여 이렇게 형변환 해준다.
		s = (short) i;
	}
}
