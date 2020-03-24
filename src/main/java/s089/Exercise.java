package s089;

public class Exercise {
	public static void main(String[] args) { // generalmente per verificare che la classe funzioni non si fa il main ma
												// si usa un junit test. qui usiamo questo perchè è più semplice da
												// gestire in videolezione per la spiegazione, però meglio non prendere
												// l'abitudine
		MyIntQueue miq = new MyIntQueue();

		miq.add(42);
		System.out.println("[42] -> " + miq.toString()); // se avessi fatto un junit test non avrei bisogno di questa
															// riga per controllare che il risultato sia quello che mi
															// aspetto
		miq.add(2);
		System.out.println("[42, 2] -> " + miq.toString());

		miq.add(23);
		System.out.println("[42, 2, 23] -> " + miq.toString());

		int value = miq.remove();
		System.out.println(value);

		System.out.println(miq.toString());

		value = miq.remove();
		System.out.println(value);

		System.out.println(miq.toString());

		value = miq.remove();
		System.out.println(value);

		System.out.println(miq.toString());
	}

}

class MyIntQueue {
	// lista di interi linkata. in ogni posizione ho il valore e una seconda
	// componente che mi dice qual è l'elemento successivo -> lavoro sulle reference
	// che mi portano all'oggetto di riferimento
	// [1, -> 23] [23, -> 4] [4, //]

	private Node head;
	private Node tail;

	public MyIntQueue() {
		this.head = null;
		this.tail = null;
		// quando creo l'oggetto inizialmente ho sia inizio che fine della mia
		// collezione vuoti, perchè la collezione è ancora vuota. non sarebbe necessario
		// perchè quando li creo non gli do un valore, quindi in automatico java li
		// assegna come null
	}

	public void add(int value) {
		// aggiunge l'elemento in coda a dx O(1)
		// [1, -> 23] [23, -> 4] [4, -> 54] [54, //]
		Node node = new Node(value);

		if (head == null) {// primo nodo che inserisco
			this.head = node; // sia head che tail sono reference che contengono l'indirizzo allo stesso
								// oggetto che è node
			this.tail = node;
			return;
		} else {
			this.tail.setNext(node); // in questo caso sto accedendo all'indirizzo che c'è in tail che al momento è
										// il nodo inserito al giro precedente, vado all'oggetto che mi punta questo
										// indirizzo e gli dico che il next di questo oggetto è il mio node attuale
			this.tail = node; // poi aggiorno l'indirizzo dell'ultimo elemento che deve essere il mio nodo
								// attuale il cui next è un null
		}

//		Node current = head;
//		while (current.getNext() != null) {
//			current = current.getNext(); // finchè ho un elemento successivo io mi salvo il successivo in current
//		}
//		current.setNext(node); // quando sono arrivata alla fine, io mi salvo in current (che sarà l'ultimo
//								// elemento della coda) la reference al mio elemento attuale che diventerà il
//								// mio nuovo ultimo elemento, in quanto elemento con next null
//		// se ho solo la head devo ogni volta scorrere tutta la coda per trovare
//		// l'ultimo elemento e aggiornarlo

	}

	int remove() {
		// toglie il primo elemento più a sx, generalmente costa O(n)
		// se la voglio che costa O(1) come faccio? uso il concetto di linked list
		// [23] [4] [54]

		if (head == null) {
			throw new IllegalStateException("Queue is empty");
		}

		if (this.head == this.tail) {
			this.tail = null;
		}

		int value = this.head.getValue(); // variabile di supporto perchè io al chiamante voglio ritornare il valore
		// dell'elemento che sto eliminando, quindi prima di eliminarlo devo salvarmelo
		// perchè poi non so più dove andarlo a prendere
		this.head = this.head.getNext();

		return value;
	}

	@Override
	public String toString() {

		if (this.head == null) {
			return "[]";// nel to string meglio non mettere eccezioni, ma ritornare un valore
						// convenzionalmente noto per indicare che è vuoto, ovvero []
		}

		// -> string builder per navigare su tutta la struttura finche next è diverso da
		// null

		StringBuilder sb = new StringBuilder();
		Node current = head;

		while (current.getNext() != null) {
			sb.append(current.getValue() + ", ");
			current = current.getNext();
		}
		sb.append(current.getValue());

//		while (current != null) {
//			sb.append(current.getValue() + ", ");
//			current = current.getNext();
//		} // analogo a quello che ho scritto io prima, solo che lavoro su tutto l'oggetto
//			// current e non solo sull'indirizzo. quando arrivo nel tail come elemento
//			// successivo mi mette un null sia per value che per next e quindi non entro più
//			// nel while

		return "[" + sb + "]";
	}
}

/*
 * getter e setter non piacciono molto ai programmatori per dire che so cosa sto
 * facendo e che voglio usare questa classe per accedere a node e value dico che
 * è un JavaBean
 */
class Node {
	private int value;
	private Node next; // sto dicendo che nella mia classe ho un valore (value) e un reference a un
						// elemento di tipo Node, ovvero lo stesso tipo della classe. questa struttura
						// ricorsiva è proprio il modo che si usa per gestire le code

	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

}