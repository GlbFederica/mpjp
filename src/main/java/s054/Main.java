package s054;

public class Main {
	public static void main(String[] args) {
		Barker[] group = new Barker[2]; // array di interfacce Barker, all'interno dell'array avrò solo null

		group[0] = new Fox(); // oggetti del mio array creati con le classi che implementano l'interfaccia,
								// sto riempiendo l'array
		group[1] = new Dog();

		for (Barker aBarker : group) {
			System.out.println(aBarker.bark()); // con aBarker.NomeMetodo posso accedere solo ai metodi dell'interfaccia
												// barker perhcè la variabile di supporto aBarker è di tipo barker (che
												// è un'interfaccia), non di un tipo esteso di barker
		}

		BarkAndWag baw = new Dog();
		System.out.println(baw.tailWaggingSpeed());

		Dog dog = new Dog();
		System.out.println(dog.bark(3));
	}
}
