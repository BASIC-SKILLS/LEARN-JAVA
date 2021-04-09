package sec06.ch06;

public class PolymorExam {
// 메소드 기준으로 다형성을 기억한다.
	//1. 부모타입의 변수는 자식객체 가리킬 수 있다.
	//2. 자식타입의 변수는 부모객체 가리킬 수 없다. //자신의 타입이 자신의 객체를 가리키는 것은 당연한 것(Cat cat = new Cat();)
	//3. 타입이 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다. 
	public static void main(String[] args) {
		Animal ani_1 = new Cat(); //자동형변환 되었다. Animal ani_1 = (Animal) new Cat();
		// Cat cat1 = new Animal();
		
		//Cat cat = ani_1; //되는 거지만, 컴파일러가 Animal ani_1 = new Cat();인거 아니냐 하고.
		Cat cat = (Cat)ani_1; // 형변환을 해주면 컴파일러가 안심한다. //어차피 Cat cat = new Cat();한거나 마찬가지 이니까.
		Animal ani_2 = cat;  //역시나 상관없다. 
		
		//Cat cat1 = (Cat)new Animal("", 0); //강제로 형변환해도 부모타입의 변수를 자식객체에 줄 수 없다. 
		
		ani_1.cry(); //animal의 cry()가 아닌 cat의 cry가 호출 된다. 왜냐하면 메소드의 호출의 기준은 개체이기 때문이다. //운다X, 야옹
		//ani_1.lick(); //Animal타입은 Cat의 lick()메소드를 모르기 때문에 에러
		cat.cry(); //ani_1.cry()와 같은 효과 
		//둘 다 기준이 cat()객체이기 때문에 결과가 같다. 결과는 type에 따른 것이 아니고 객체에 따른 것이기 때문이다. 
		
		//다형성은 부모타입 변수명 = new 자식타입() 이 유형이 많이 차지 하는 듯 ?
		
	}
	
	

}
