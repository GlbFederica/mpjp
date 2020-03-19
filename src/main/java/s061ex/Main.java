package s061ex;

public class Main {
	public static void main(String[] args) {
		Person[] persons = new Person[3]; // array di 3 oggetti Person
		persons[0] = new Consultant("Tom", "Jones", 1000); // inizializzo elemento di indice 0 dell'array che sarà un
															// Consultant, ma in un array di Person
		// la keyword new crea spazio per un consultant e chiama il suo costruttore,
		// se consultant ha più di un costruttore rimanda a quello con i parametri di
		// input corrispondenti a quelli che sto passando
		persons[1] = new Employee("Jim", "Smith", 3000); // elemento di indice 1, classe Employee
		persons[2] = new Consultant("Bob", "Korn", 800); // elemento di indice 2, classe Employee

		for (Person person : persons) {
			System.out.println(person); // stampo ogni elemento dell'array persons, usando per ognuno il metodo che è
										// scritto nella classe cui appartiene l'elemento
		}

		for (Person person : persons) {
			if (person instanceof Consultant) { // se l'elemento è un Consultant lo trasformo con un downcast in tipo
												// Consultant e applico il metodo getdaily definito per questa classe
				Consultant c = (Consultant) person;
				System.out.println(c.getDaily());
			} else if (person instanceof Employee) {    // se l'elemento è un Employee lo trasformo con un downcast in tipo
														// Employee e applico il metodo getdaily definito per questa classe
				Employee e = (Employee) person;
				System.out.println(e.getSalary());
			}

		}
	}
}
