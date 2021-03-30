package sec06.ch04;

public class WhileMission3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int val = (int) (Math.random() * 11);
		while (val != 0) {
			val = (int) (Math.random() * 11);
			System.out.println("val : " + val);
			sum += val;
		}
		System.out.println(sum);
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		
		String str = "0이 아닌 랜덤 숫자 : ";
		sum = 0;
		while (true) {
			int num =(int) (Math.random() * 11);
			
			if (num == 0) {
				break;
			}
			
			str += num;
			str += ",";
			
			sum += num;
			
		}
		str += "끝";
		System.out.println(str);
		System.out.println("0이 아닌 랜덤 숫자들의 합 : " + sum);
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		int result = 0;
		
		while(true) {
			int random = (int) (Math.random() * 11);
			System.out.println("random : " + random);
			if (random == 0) {
				break;
			}
			result += random;
		}
		System.out.println("result : " + result);
		
		
	}

}
