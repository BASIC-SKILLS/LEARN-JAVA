package sec06.ch07;

public class StartcraftMain {

	public static void main(String[] args) {
		Medic medic_heal = new Medic();
		Medic medic_hurt = new Medic();
		Marine marine = new Marine();
		Tank tank = new Tank();
		
		System.out.println("medic_hurt HP : " + medic_hurt.getCurrentHP());
		System.out.println("marine HP : " + marine.getCurrentHP());

		medic_heal.heal(medic_hurt);
		medic_heal.heal(marine);
		medic_heal.heal(tank);
		
		System.out.println("medic_hurt HP : " + medic_hurt.getCurrentHP());
		System.out.println("marine HP : " + marine.getCurrentHP());
	}

}
