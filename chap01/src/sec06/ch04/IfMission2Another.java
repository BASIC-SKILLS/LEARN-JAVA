package sec06.ch04;

public class IfMission2Another {
	public static void main(String[] args) {		
	
	String gender = "여";
	int height = 150;
	
	String displayGender = "여자", displayResult = "평균";
	
	final int WOMAN_HEIGHT = 163;
	final int MAN_HEIGHT = 174;
	int stand = WOMAN_HEIGHT;
	
	if (gender.equals("남")) {
		displayGender = "남자";
		stand = MAN_HEIGHT;
	}
	
	if (height > stand) {
		displayResult += "초과"; 
	} else if (height < stand) {
		displayResult += "미만";
	}
	
	System.out.printf("%s %s", displayGender, displayResult);

}
}
