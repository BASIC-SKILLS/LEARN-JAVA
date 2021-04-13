package sec06.ch07;

public class InterfaceExam {

	public static void main(String[] args) {
		
		RemoteControl rc1 = new LGTV();
		RemoteControl rc2 = new SamsungTV();
		
		rc1.volumeUp();
		rc2.volumeUp();
		
		rc1.chkVolume();
		rc2.chkVolume();
		
		
		/*
		LGTV tv1 = new LGTV();
		RemoteControl rc = tv1;
		//rc.welcome(); -> 에러
		rc.volumeUp(); //1
		tv1.volumeUp(); //2
		rc.volumeDown(); //1
		rc.chkVolume(); 
		*/
	}

}
