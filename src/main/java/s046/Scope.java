package s046;

public class Scope {
	private static int staticMember = 5;
	private long member = 5;

	public void f() { // f non può essere static perchè usa la variabile di istanza member e le
						// variabili di istanza non possono essere usate nei metodi statici perchè
						// queste vengono create solo se creo un oggetto di quella classe. i metodi
						// statici possono lavorare solo con le variabili static
		int local = 7;
		if (staticMember == 2) {
//            float local = 0.0F; //non posso avere più variabili local nello stesso blocco (scope) anche se di tipo diverso
			short inner = 12;
			staticMember = 1 + inner;
			member = 3 + local;
		}
	}

	public void g() {
		System.out.println(member);
	}
	
	public static void k() { //metodo statico -> posso usarlo anche se non ho creato un oggetto della classe
		System.out.println(staticMember);
	}

	public static void main(String[] args) {
		double local = 5;
		System.out.println(local);
		staticMember = 12;

		// Scope.f() -> questa così non posso usarla, perchè lavora sugli oggetti della classe
		// scope (non è metodo static), quindi per usarla mi serve un oggetto
		
		Scope.k(); //sto usando il metodo statico della classe Scope -> i metodi statici si chiamano con NomeClasse.NomeMetodo()

		Scope scopeO = new Scope(); // creo un oggetto della classe scope
		scopeO.f();
		scopeO.g();
		//adesso ho chiamato i metodi non statici della classe Scope, usando l'oggetto che ho creato scopeO
		//i metodi non statici si chiamano come NomeOggetto.NomeMetodo()
	}
}
