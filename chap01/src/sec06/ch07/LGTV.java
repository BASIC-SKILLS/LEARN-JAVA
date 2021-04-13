package sec06.ch07;
				//구현하다
public class LGTV implements RemoteControl {
	private int volume;
	
	public void welcome() {
		System.out.println("LG Welcome");
	}

	@Override
	public void volumeUp() {
		volume++;
	}

	@Override
	public void volumeDown() {
		volume--
		 ;		
	}

	@Override
	public void chkVolume() {
		System.out.println("volume : " + volume);		 
	}

}
