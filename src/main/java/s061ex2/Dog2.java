package s061ex2;

public class Dog2 extends Pet2 {
	private final static int DAILY = 10;
	// questa è una costante che fisso io ed è così per tutti gli oggetti di tipo
	// dog, quindi non voglio mi venga passata dal main

	public Dog2(int days, String name) { //quindi non la metto nei parametri del costruttore di Dog
		super(days, name, DAILY);//ma la passo come costante al costruttore della superclass
	}

}
