package sec06.ch06;

public class OverrideExam {

	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);
		
		System.out.println("nb1 === nb2 : " + (nb1 == nb2)); //false
		//'=='비교는 무조건 참조형 변수에서는 주소값을 비교하는 것이다. 
		//System.out.println("nb1.equals(nb2) : " + nb1.equals(nb2)); //false
		//'값'을 비교하는 메소드로 오버라이딩 하자 
															//new NumBox(10)가 들어간다.
		System.out.println("nb1.equals(nb2) : " + nb1.equals(nb2)); //true  
		
		nb1 = nb2;
		System.out.println("nb1 === nb2 : " + (nb1 == nb2)); //true
		
		
		
	}

}

class NumBox {
	private int num;
	NumBox(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public boolean equals(Object obj) { //new NumBox(10)가 들어왔다.
		NumBox temp = (NumBox) obj; //NumBox temp = (NumBox) new NumBox(10)
		
		return this.num == temp.num;  //객체의 num == nb2의 객체의 num 
	}
}
