package s047;

public class Access {
	private int a;
	private int a1;
	protected short b;
	static double c; // qui l'accesso non è specificato, usa package che è quello di default
	private static int e = 25;
	// public long d;

	static { // permette di inizializzare le variabili statiche, si usa se l'inizializzazione
				// è complessa (quindi serve un blocco) o se ho molte variabili da inizializzare
				// in questo caso potevo scrivere static double c=18; alla riga 6 ed era la
				// stessa identica cosa
				// se non inizializzo le variabili statiche, java da un valore (0 o null)
		c = 18;
	}

	public Access(int a, short b) { // permette di inizializzare le proprietà, è un costruttore. il costruttore ha
									// lo stesso nome della classe. in questo caso passo al costruttore 2 variabili
									// int che uso per assegnare i valori alle proprietà del mio oggetto che sto
									// creando. dato che le proprietà sono private per accedere uso
									// this.nomeVariabile, il this serve per le proprietà private, per le static
									// invece si accede diversamente
		this.a = a;
		this.b = b;
	}

	public int h() {
		return a / 2;
	}

	public static void main(String[] args) {
		Access accessObj = new Access(3, (short) 4); // per le variabili short devo fare il cast, se no le prende come
														// int di default
		System.out.println(accessObj.h());
		System.out.println(c); // posso usare direttamente nei metodi le variabili static
		System.out.println(e); // anche quelle private static

		e = 32;
		System.out.println(e);

		accessObj.a1 = 23;
		System.out.println(accessObj.a1);

		// le variabili private (proprietà) sono modificabili all'interno della classe
		// stessa, chiamandole con il modo corretto in base al tipo di accesso
	}
}
