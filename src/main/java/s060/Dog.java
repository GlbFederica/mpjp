package s060;

public class Dog extends Pet {
	private double speed;

	public Dog(String name) {
		this(name, 0); // this vuol dire che rimanda a un altro costruttore di questa classe, lo faccio
						// perchè in questo caso il chiamante mi ha passato solo il nome e non anche la
						// velocità e in questo modo io definisco entrambe dando alla velocità il valore
						// che voglio io
	}

	public Dog(String name, double speed) {
		super(name); // riferimento alla classe superiore per definire il costruttore di pet che mi
						// definisce il nome
		this.speed = speed; // costruttore per il valore speed
	}
	
// potevo anche creare 2 costruttori separati, uno con solo name che rimanda a
// super e uno con name e speed.

//	public Dog(double speed) {
//		this.speed = speed;
//	}
//	
// se creo un costruttore così, senza riferimenti a name, mi da il seguente errore:
// 'Implicit super constructor Pet() is undefined. Must explicitly invoke another constructor'
// questo perchè in pet non ho un costruttore di default per name, ovvero non c'è nessun costruttore 
//	che da un valore a name se io non lo passo


// l'importante è ricordarsi che per definire un oggetto devo usare i suoi
// costruttori e definirlo per intero, o con costruttori di default o con costruttori creati
	

	public double getSpeed() {
		return speed;
	}
}