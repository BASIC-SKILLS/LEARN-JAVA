package sec06.ch04;

public class SwitchMission3 {

	public static void main(String[] args) {
		//int season = (int) (Math.random() * 10); //0~9
		int season = (int) (Math.random() * 12) + 1;  //최소값~최댓값 : (int) (Math.random() * (최댓값-최소값+1) + 최소값
		
		System.out.println("season : " + season);
		switch(season) {
		case 3: case 4: case 5: System.out.println("봄"); break;
		case 6: case 7: case 8: System.out.println("여름"); break;
		case 9: case 10: case 11: System.out.println("여름"); break;
		default : System.out.println("겨울"); break;
		}
		while(true) {
			System.out.println(Math.random());
		}
		
		
	}

}
