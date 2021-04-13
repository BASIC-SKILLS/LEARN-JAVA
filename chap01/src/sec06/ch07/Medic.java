package sec06.ch07;

public class Medic implements Bionic {
	private int currentHP = 3;
	public final int MAX_HP = 15;

	// bionic과 mechanic 모두 들어올 수 있어야 하니까 최상위 부모 type으로 받는다.
	public void heal(Object unit) {
		//this(객체)와 unit의 주소값이 같다면 
		if (this == unit || !(unit instanceof Bionic)) {
			System.out.println("치료할 수 없습니다.");
			return;
		}

		if (unit instanceof Marine) {
			Marine marine = (Marine) unit;
			marine.setCurrentHP(marine.MAX_HP);
		} else if (unit instanceof Medic) {
			Medic medic = (Medic) unit;
			medic.setCurrentHP(medic.MAX_HP);
		}

	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

}
