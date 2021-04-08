package sec06.ch06;

public class VariadicArgumentsExam {
//오버로딩의 단점을 보완
//가변 인자 
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		int result = cal.sum(10, 20); 
		System.out.println("result : " + result);
		result = cal.sum(10, 20, 30); 
		System.out.println("result : " + result);
		result = cal.sum(10, 20, 30, 40); 
		System.out.println("result : " + result);
		result = cal.sum(10, 20, 30, 40, 50); 
		System.out.println("result : " + result);
		result = cal.sum(new int[] {1, 2, 3, 4}); //배열도 직접 받는다 //이 말은 밑의 두 코드와 같다. 
		int[] arr = new int[] {1, 2, 3, 4}; // 차이점은 위의 배열은 일회성, 이 배열은 arr에 저장해놔서 계속 쓸 수 있다. 
		System.out.println("result : " + arr);
	}

}

class Calc2 {
//	int sum(int[] vals) {} // 이렇게 Overloading이 안된다.
	int sum(int... vals) { //매개변수로 int형 인자도 여러개 받고, int[] vals, 즉 배열, new int[] {1, 2, 3, 4}도 받을 수 있다. 즉 들어오는 인자값들이 int형 배열안에 저장된다. 
		int sum = 0;
		for(int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}
