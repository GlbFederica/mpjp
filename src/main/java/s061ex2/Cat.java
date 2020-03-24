package s061ex2;

public class Cat extends Pet {
	private final static int DAILY = 6;
	
	public Cat(int days, String name) {
		super(days, name);
	}
	
	@Override
	public int housing() {		
		int housingTot = DAILY * getDays();
		System.out.println(getName() + " Total housing: " + housingTot );
		
		return housingTot;
	}

}
