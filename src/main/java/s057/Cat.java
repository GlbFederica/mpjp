package s057;

public class Cat extends Mammal {
	private Tail tail;

	public Cat(int gestationDays, int tailLen) {
		super(gestationDays); // super chiama il costruttore di una classe superiore rispetto a quella in cui
								// mi trovo -> se voglio costruire un oggetto cat devo prima costruire mammal
								// per il mio cat (tutto ciò che è più 'interno', ovvero di classi superiori)
		this.tail = new Tail(tailLen);
	}

	@Override
	public String toString() {
		return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
	}
}
