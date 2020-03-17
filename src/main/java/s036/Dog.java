package s036;

public class Dog {
	String name;

	public Dog() {
		// metodo costruttore che non ha nessun parametro e mi permette di inizializzare
		// la parte dati del mio oggetto
		name = "No name";
		System.out.println("A new dog has been created");
	}

//	public Dog(String n) {
//		name = n;
//  in questo caso il cane che creo avrà il nome che ho passato in input 
//		System.out.println("A new dog has been created");
//	}
    //posso avere più di un costruttore, basta che differiscano nei parametri di input, 
	//ad esempio posso aggiungere un costruttore uguale a cui però passo il nome come stringa

	public void bark() {
		System.out.println(name + ": yap");
	}
}
