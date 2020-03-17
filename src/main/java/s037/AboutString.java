package s037;

public class AboutString {
	public static void main(String[] args) {
		String s = "hello";
		String t = "world";
		String u = "or";
		System.out.println("s, t, u: " + s + ", " + t + ", " + u);

		System.out.println("char at position 1 in s: " + s.charAt(1));
		// nomestringa.charAt(n) mi restituisce il carattere della mia stringa
		// nomestringa in posizione n
		// se metto un numero fuori scala rispetto alla mia stringa mi tira un'eccezione
		// dicendomi che ho messo un valore out of boundary
		// se metto una lettera prende il valore ascii corrispondete e lo considera come
		// valore numerico

		System.out.println("s < t: " + s.compareTo(t));
		System.out.println("t > s: " + t.compareTo(s));
		// compareTo mi da la differenza tra il valore ascii dei caratteri
		// corrispondenti in due stringhe
		// se i caratteri sono uguali passa al carattere successivo della stringa
		// i caratteri alfabetici nelle tabelle di conversione ascii devono essere in
		// ordine
		// a<b<c<.....<z e analogamente A<B<C.....<Z
		// non so esattamente a cosa corrispondono perchè ci sono molte tabelle diverse
		// per la conversione ascii, però questa regola è sempre valida

		System.out.println("concat s and t: " + s.concat(t));

		System.out.println("t contains u? " + t.contains(u));

		String u2 = t.substring(1, 3);
		System.out.println("u2 = t.substring(1, 3): " + u2);
		// sottostringa che prende i caratteri tra 1 (compreso) e 3 (escluso)
		// per convenzione in java gli intervalli sono aperti a sinistra e chiusi a
		// destra
		// il primo carattere di una stringa è il carattere n=0
		System.out.println("t.substring(3): " + t.substring(3));
		// se specifico solo un parametro gli sto dicendo il carattere iniziale, che
		// essendo a sx dell'intervallo viene considerato
		// in questo caso considero i caratteri dal 3 incluso in avanti

		System.out.println("u equals u2? " + u.equals(u2));
		System.out.println("u == u2? " + (u == u2));
		// equals confronta il contenuto delle due stringhe salvato nello heap
		// se uso == invece vengono confrontati i contenuti di u e u2 nello stack, che
		// sono le reference di ciò che ho nello heap.
		// == quindi confronta gli indirizzi e mi da vero solo se entrambi hanno la
		// stessa reference all'interno
		// questo vale per tutti i tipi reference, con == confronto il contenuto solo in
		// caso di primitivi perchè == confronta il contenuto dello heap

		System.out.println("First index of 'l' is s: " + s.indexOf('l'));
		//indexOf(x) mi dice quale è la prima posizione in cui trovo x nella stringa
		System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
		//lastIndexOf(x) mi dice quale è l'ultima posizione in cui trovo x nella mia stringa
		System.out.println("there is no 'x' in s: " + s.indexOf('x'));
		//se il carattere richiesto non è presente mi ritorna -1
		System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
		//posso fare anche la ricerca di sottotringhe, mi ritorna la posizione del primo carattere della stringa
		System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

		System.out.println("check if an empty string is empty: " + "".isEmpty());
		//in questo esempio sto dereferenziando una stringa direttamente e non una variabile
		//è un modo più compatto rispetto a definire una variabile stringa e poi dereferenziarla con .isEmpty
		//il calcolatore da solo si costruisce una stringa e la usa

		System.out.println("s length: " + s.length());
		//lunghezza della stringa, 0 se è vuota

		String s2 = s.replace('l', 'q');
		System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

		String[] splits = "one for me, one for you".split(" ");
		System.out.println("Splitting: ");
		for (String token : splits) {
			System.out.println(token);
		}
		String joined = String.join(" ", splits);
		//join è un metodo statico riferito alla classe string e non allo specifico oggetto, quindi si usa con il nome della classe
		//posso anche chiamare un metodo statico su un oggetto specifico, esce un warning perchè è sconsigliato
		System.out.println("Joining back [" + joined + "]");

		System.out.println("upper: " + s.toUpperCase());
		System.out.println("lower: " + "SHUT UP!".toLowerCase());

		System.out.println("trim [" + " la la la ".trim() + "]");
		//trim elimina gli spazi bianchi all'inizio e alla fine della stringa

		String x = null;
		System.out.println("Sort of safe toString(): " + String.valueOf(x));
		//valueOf è un metodo statico di stringa
	}
}
