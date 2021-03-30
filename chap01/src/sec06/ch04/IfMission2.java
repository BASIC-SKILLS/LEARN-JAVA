package sec06.ch04;

public class IfMission2 {

	public static void main(String[] args) {
		String gender = "여";
		int height = 164;
		
		System.out.println(gender.equals("남"));
		System.out.println(gender.equals("여"));
		
		if (gender.equals("남")) {
			if (height > 175) {
				System.out.println("남성 평균 키 초과");
			} else if (height == 175) {
				System.out.println("남성 평균 키");
			} else {
				System.out.println("남성 평균 키 미만");
			}
		} else if (gender.equals("여")) {
			if (height > 163) {
				System.out.println("여성 평균 키 초과");
			} else if (height == 163) {
				System.out.println("여성 평균 키 초과");
			} else {
				System.out.println("여성 평균 키 미만");
			}
		} else {
			System.out.println("측정불가");
		}
			
	}

}
