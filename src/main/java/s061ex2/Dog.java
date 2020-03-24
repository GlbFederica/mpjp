package s061ex2;

public class Dog extends Pet {
	private final static int DAILY = 10;
	
	public Dog(int days, String name) {
		super(days, name);
	}
	
	@Override
	public int housing() {
		int housingTot = DAILY * getDays();
		System.out.println(getName() + " Total housing: " + housingTot );
		
		return housingTot;
	}

}
