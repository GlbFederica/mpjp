package s057;

public abstract class Mammal {
	protected int gestation;

	public Mammal(int gestation) {
		this.gestation = gestation;
	}

	@Override
	public String toString() {
		return "Mammal [gestation=" + gestation + "]";
	}
}

//dato che mammal è una classe astratta, se non lo modifico non posso creare oggetti di tipo mammal 
//(cosa che invece ho fatto in mammal 2 dove ho tolto abstract).
//per creare oggetti che usano questi metodi devo crearmi delle classi che siano estensione di questa classe astratta, 
//come in cat e dog, poi mi creo oggetti di quelle classi che faranno riferimento anche c questa, a meno che non faccia override dei metodi. 
//a questo punto ogni nuova classe derivata usa il metodo override più 'vicino', in base alla gerarchia delle classi