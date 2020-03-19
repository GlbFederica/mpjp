package s057;

public class Mammal2 {
	protected int gestation;

	public Mammal2(int gestation) { // il costruttore deve avere lo stesso nome della classe
		this.gestation = gestation; // se non metto this. allora succede che in gestation salvo la variabile
									// proprietà gestation e la variabile finisce li perchè è una variabile locale
									// del costrutore. mettenfo this. invece succede al contrario, nella proprietà
									// gestation viene salvato il valore della variabile locale gestation
	}

	@Override
	public String toString() {
		return "Mammal [gestation=" + gestation + "]";
	}

	public static void main(String[] args) {
		Mammal2 m = new Mammal2(12);
		System.out.println(m.toString());
		// ho definito un oggetto di tipo Mammal2, la to string che usa quando la chiamo
		// per questo oggetto è quella che ho sovrascritto nella classe Mammal2, per il
		// principio del polimorfismo

		Object o = new Mammal2(5);
		System.out.println(o.toString());
		// Object è una classe già implementata in java, di cui tutte le classi che creo
		// sono delle estensioni, tutte sono derivate da object. object è una super
		// classe per tutte le altre. quando creo un oggetto di tipo object ma usando il
		// costruttore di riferimento di un'altra classe, la variabile che creo è della
		// classe derivata, in questo caso o è della classe mammal -> quando uso to
		// string applicato a o uso quello sovrascritto nella classe derivata di
		// riferimento, grazie al polimorfismo.

		Object p = new Object();
		System.out.println(p.toString());
		// in questo caso ho creato un oggetto di classe object usando il costruttore di
		// object -> l'unico to string utilizzqabile per p è quello definito per la
		// classe object, non avendo alcun riferimento alle classi derivate
	}
}
