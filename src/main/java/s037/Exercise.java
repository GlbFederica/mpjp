package s037;

public class Exercise { // come trasformare una stringa in tutti maiuscoli
	final static int GAP = 'a' - 'A';
	// final static è da anteporre ogni volta che si definisce una costante, che poi
	// si nomina con lettere maiuscole
	// in questo esercizio questa costante ha come valore la differenza tra i valori
	// ascii di a e A -> ovvero la distanza tra i caratteri minuscoli e i caratteri
	// maiuscoli in ascci

	public static void main(String[] args) {
		exercise("Bob");
		exercise("ciAo");
		// main che inizia con 2 chiamate al metodo exercise per inizializzare

		System.out.println("toUpper(): " + toUpper("Bob"));
		System.out.println("toUpper2(): " + toUpper2("Bob"));
		System.out.println("toUpper3(): " + toUpper3("Bob"));
		System.out.println("toUpper4(): " + toUpper4("Bob"));
		// test dei 4 metodi scritti
	}

	public static String toUpper(String s) {
		if (s == null || s.isEmpty()) {
			// questo è stato fatto con or shortcut perchè in questo caso usare or
			// non shotcut | potrebbe dare problemmi, infatti con or non shortcut se ho s ==
			// null
			// comunque la valutazione prosegue anche all'altra parte dell'or anche se di
			// per se basta questa condizione per entrare nell'if, ma non posso
			// dereferenziare qualcosa che è null e quindi java mi tira un'eccezione. con lo
			// shortcut invece viene valutato il primo e se questo già basta a dare una
			// risposta si prosegue
			// il null lo DEVO controllare perchè se poi proseguo mi da problemi, empty
			// invece posso anche non verificarlo, semplicemente poi faccio anche il resto
			// del codice inutilmente in quanto lavoro su una stringa vuota
			// OGNI VOLTA CHE HO UNA VARIABILE DI TIPO REFERENCE LA PRIMA COSA CHE DEVO FARE
			// è VERIFICARE CHE NON SIA UN NULL, POI POSSO VERIFICARE ALTRE COSE USANDO I
			// METODI SPECIFICI E SCRIVERE IL RESTO DEL CODICE. SOPRATTUTTO QUANDO STO
			// SCRIVENDO UN METODO IN CUI L'INIZIALIZZAZIONE DELLA VARIABILE VIENE FATTA DAL
			// CHIAMANTE
			return s;
		}

		StringBuilder sb = new StringBuilder(s.length());
		// costruisco lo stringbuilder sb vuoto, della stessa lunghezza della mia
		// stringa di input

		for (int i = 0; i < s.length(); i++) {
			// in questo for vado a mettere nello stringbuilder tutti i caratteri della mia
			// stringa, uno per volta. se il carattere è minuscolo lo converto in maiuscolo,
			// se no lo appendo così com'è
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.append((char) (cur - GAP));
			} else {
				sb.append(cur);
			}
		}

		return sb.toString();
	}

	public static String toUpper2(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < sb.length(); i++) {
			char cur = sb.charAt(i);
			// seleziono il carattere corrente e ne faccio una copia
			if (cur >= 'a' && cur <= 'z') {
				sb.setCharAt(i, (char) (cur - GAP));
				// se il carattere è minuscolo lo faccio diventare maiuscolo usando set Char at
				// che mi cambia un singolo carattere di uno stringbuilder
			}
		}

		return sb.toString();
	}

	public static String toUpper3(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.insert(i, (char) (cur - GAP));
				// analogo al primo metodo ma usando insert nella posizione corrente invece che
				// append
			} else {
				sb.insert(i, cur);
			}
		}

		return sb.toString();
	}

	public static String toUpper4(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				String x = Character.toString((char) (cur - GAP));
				sb.replace(i, i + 1, x);
			}
		}

		return sb.toString();
	}

	public static void exercise(String sample) {
		// alla funzione passo una stringa, che è un tipo reference -> in sample non
		// salvo il contenuto della stringa (quello nello heap), ma il contenuto nello
		// stack di quello che passo, ovvero la reference alla stringa di interesse.
		// questo vuol dire che sample avrà lo stesso contenuto della variabile che sto
		// passando, ovvero "l'indirizzo" dell'oggetto di interesse
		// questo esempio è stato scritto per essere usato una volta, stampa la
		// riconversione e basta
		if (sample == null || sample.isEmpty()) {
			return;
		}

		System.out.println(sample + " to uppercase and lowercase");
		for (int i = 0; i < sample.length(); i++) {
			char cur = sample.charAt(i); // scope=area in cui vive una variabile
			if (cur >= 'a' && cur <= 'z') {
				System.out.print((char) (cur - GAP));
				// voglio stampare un carattere -> faccio un cast esplicito a un carattere
				// perchè sto facendo un'operazione tra due operandi che però sono uno un char
				// (cur) e l'altro un int (GAP), per farlo java trasforma entrambi in int.
				// mettendo prima il cast esplicito (NB deve avere le parentesi (char) ) il
				// codice stampa un carattere, senza avrebbe stampato un intero
				// uso print così si stampano tutti uno a fianco all'altro
			} else {
				System.out.print(cur);
			}
		}

		System.out.print(", ");

		for (int i = 0; i < sample.length(); i++) {
			char cur = sample.charAt(i);
			if (cur >= 'A' && cur <= 'Z') {
				System.out.print((char) (cur + GAP));
				// in questo caso aggiungo GAP al carattere maiuscolo così da trasformarlo in
				// minuscolo, sempre con il cast a (char) così stampa il carattere e non il
				// valore ascii corrispondente
			} else {
				System.out.print(cur);
			}
		}

		System.out.println();
	}
}
