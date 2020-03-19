package s061;

public class Main {
	public static void main(String[] args) {
//		Cat cat = (Cat) new Dog(); // sto cercando di creare un oggetto dog e trasformalo in cat, muovendomi tra
		// due classi che sono estensione della stessa, ma che fra loro sono parallele e
		// non in una relazione di gerarchia -> in java non si può fare

		Pet pet = new Dog("Bob"); // upcast da dog a pet, un dog è sempre un pet in quanto dog è classe derivata
									// da pet. in questo caso l'oggetto che ottengo è un dog, eventuali metodi di
									// pet che in dog ho sovrascritto verranno usati nella versione sovrascritta
									// per il codice però questo viene visto come Pet e può essere usato in input in
									// tutti i casi in cui si chiede Pet
		/**
		 * es: void f(Pet[] pets) -> array di animali, voglio un codice che fa abbaiare
		 * 							i cani e miagolare i gatti
		 * 
		 * for (Pets pet:pets) { 
		 * if (pet instanceOf Dog){ -> gli elemteni dell'array che
		 * 								sono cani vengono downcast a Dog e si usa un metodo specifico per la subclass
		 * 								dog che su un oggetto Pet (anche se creato come Pet animale = new Dog()) non
		 * 								avrei potuto usare Dog dog = (Dog) pet; 
		 * 	dog.bark();
		 *  } 
		 *  if (pet instanceOf Cat){ 
		 *  	Cat cat = (Cat) pet; 
		 *  	cat.meow();
		 *   }
		 * }
		 */

		// risky
		Dog dog = (Dog) pet; // ATTENZIONE!! è rischioso, in questo caso so che pet è un Dog e quindi un Pet,
								// perchè l'ho creato alla riga prima, ma in generale non è detto e devo fare
								// attenzione
		dog.bark();

		// next line leads to a ClassCastException
		Cat cat = (Cat) pet; // sto cercando di trasformare un Dog in un Cat, ma non posso farlo, ci saranno
								// errori in RUNTIME -> il compilatore non mi da errore, ma in runtime mi tira
								// un'eccezione.
		// next line is just not to have a warning for unused cat on the previous line
		System.out.println(System.identityHashCode(cat));

		if (pet instanceof Cat) { // per fare la procedura della riga 20 in maniera sicura lo faccio con
									// instanceof che controlla se pet può essere trasformato in cat, ovvero esegue
									// questo blocco di codice solo se pet è effettivamente di tipo compatibile con
									// Cat
			Cat tom = (Cat) pet;
			tom.meow();
		} else {
			System.out.println("This pet is not a cat!");
		}
		
		
	}
}
