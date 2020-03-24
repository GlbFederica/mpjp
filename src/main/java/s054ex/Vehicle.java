package s054ex;

public class Vehicle {

	public void steer(boolean right) { // fa parte dell'interfaccia pubblica di vehicle -> tutte le classi che
										// estendono vehicle ereditano anche questo metodo, ereditano tutto ciò che è
										// pubblico nella classe super
		System.out.println("Steering " + (right ? "right" : "left")); // operatore ? : -> valuta quello che c'è a sx del
																		// punto di domanda, se è true ritorna ciò che
																		// c'è a sx dei :(right, se è false mi ritorna
																		// ciò che c'è a dx dei : (left)
	}

}
