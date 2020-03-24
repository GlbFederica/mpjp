package s090;

import java.util.Arrays;

public class Exercise {
	public static void main(String[] args) {
		MyIntStack mis = new MyIntStack();

		mis.push(3);
		System.out.println(mis.toString());
		mis.push(12);
		System.out.println(mis.toString());
		System.out.println(mis.pop());
		System.out.println(mis.toString());
		mis.push(33);
		System.out.println(mis.toString());
	}
}

class MyIntStack {
	// se lo tratto come array di basso livello posso inizializzare un array con la
	// dimensione che voglio e poi crearmi una varaibile da usare come indice. se
	// l'utente cerca di inserirmi un numero di elementi più grande rispetto alla
	// dimensione del mio array (es 11esimo elemento senza aver mai fatto pull in
	// questo caso dove ho creato un array di dimensione 10) devo tirare
	// un'eccezione che indica che ho esaurito la memoria. analogamente mi serve
	// un'eccezione nel caso in cui l'utente cerca di fare un pop quando l'array è
	// vuoto.
	
	private int[] data = new int[10];
	private int size = 0;
	
	void push(int value) {
		
		if(size == 10) {
			throw new IllegalArgumentException("No more space in the array to push a new element");
		}
		data[size] = value;
		size += 1;
	}

	int pop() {
		if (size == 0) {
			throw new IllegalArgumentException("Nothing to pop");
		}
		
		size -= 1;						
		return data[size];
		
		//analogo a scrivere solo return data[--size];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i < size; i++) {
			sb.append(data[i] + " ");
		}
		
		return "[ " + sb.toString() + "]";
	}
	
	
}