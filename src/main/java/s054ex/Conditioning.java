package s054ex;

public interface Conditioning { // creo un'interfaccia perchè voglio che solo alcuni veicoli siano condizionati,
								// per questi veicoli farò in modo che la classe di riferimento estenda anche
								// l'interfaccia conditioning, per gli altri (la moto) che non voglio abbiano il
								// condizionamento non estendo questa interfaccia. i veicoli che non la
								// implementano non possono essere messi in un array di tipo Conditioning
								// Ogni classe che estende l'interfaccia deve anche necessariamente fare un
								// override dei metodi dell'interfaccia che qui sono senza body
	public void setTemperature(int newTemp);
}
