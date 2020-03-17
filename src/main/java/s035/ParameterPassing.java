package s035;

import java.util.Objects;

public class ParameterPassing {
	static void primitive(int parameter) {
		parameter += 1;
		System.out.println("parameter is " + parameter);
	}

	static void immutableReference(String parameter) {
		// essendo una stringa io sto passando quello che c'è nello stack, ovvero
		// l'indirizzo della stringa
		if (parameter == null) {
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		Objects.requireNonNull(parameter, "Parameter should not be null");

		System.out.println("parameter id was " + System.identityHashCode(parameter));
		parameter += " there";
		// parameter = new string (parameter + "there") -> la riga 21 fa questo, crea
		// una nuova stringa in cui mette la stringa originale concatenata al pezzo
		// nuovo che voglio, there. parameter come reference nello stack adesso punta a
		// un oggetto diverso nello heap, quello nuovo che ho creato. il precedente
		// rimane ma nello stack non ho più il suo indirizzo. questa modifica rimane
		// all'interno del metodo, non torna al mio main perchè io lavoro su parameter
		// (variabile locale) e non su quello che passo dal main (string)
		// Creare un nuovo oggetto è l'unico modo che java ha per fare quello che ho
		// chiesto, ovvero aggiungere qualcosa a una stringa non strinbuilder, che
		// quindi per sua natura è immutabile
		System.out.println("Now parameter id is " + System.identityHashCode(parameter));
		System.out.println("parameter value is " + parameter);
	}

	static void reference(StringBuilder parameter) {
		if (parameter == null) {
			System.out.println("Nothing to do here");
			return;
		}

		// alternatively: if parameter is null throws a NullPointerException
		// Objects.requireNonNull(parameter, "Parameter should not be null");

		parameter.append(" there");
		// parameter è una copia del reference all'oggetto StringBuilder che ho passato
		// al metodo, quindi porta allo stesso oggetto a cui mi portava StringBuilder
		// vado a modificare direttamente il contenuto della stringa
		System.out.println("parameter value is " + parameter);
	}

	static void reference(int[] data) {
		if (data == null || data.length == 0) {
			System.out.println("Nothing to do here");
			return;
		}

		data[0] += 1;
		System.out.println("data[0] is " + data[0]);
	}

	// il metodo è identificato da lista di ritorno, nome, parametri di input ->
	// posso chiamarli con lo stesso nome ma se hanno parametri di input diversi
	// java li vede come diversi e in automatico capisce quale usare in base al tipo
	// di parametro che passo

	public static void main(String[] args) {
		int primitiveValue = 12;

		System.out.println("primitiveValue has been initialized to " + primitiveValue);
		primitive(primitiveValue);
		System.out.println("primitiveValue is still " + primitiveValue);

		String string = "Hi";

		System.out.println("string has been initialized to " + string);
		immutableReference(string);
		System.out.println("string is still " + string);

		StringBuilder referenceValue = new StringBuilder("Hi");
		// referenceValue ha dentro il reference alla posizione della mia StringBuilder
		// (ovvero Hi) nello heap, che è mutabile

		System.out.println("referenceValue has been initialized to " + referenceValue);
		reference(referenceValue);
		System.out.println("referenceValue now is " + referenceValue);
		// ho modificato l'oggetto a cui puntano i reference, entrambi puntano allo
		// stesso reference che io modifico in quanto mutabile. in questo caso sto
		// usando string builder che rende le
		// stringhe non immutabili

		int[] array = { 42 };

		System.out.println("array[0] is " + array[0]);
		reference(array);
		System.out.println("array[0] now is " + array[0]);
		// in questo caso ho modificato direttamente array, che è un array di primitivi
		// (loro di per se non modificabili), ma essendo un array è nello heap e quindi
		// modificabile in quanto io a reference sto passando l'indirizzo dell'array
	}
}
