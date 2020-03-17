package s037;

/**
 * Algoritmo di Cesare
 * 
 * CIAO +1 -> DJBP ZOO +1 -> APP
 * 
 * @param s
 * @return
 * 
 *         time 0:15 min
 */

import java.util.Scanner; //importo la classe Scanner del package java.util

public class ExeCryptoUser {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter the word to encript (uppercase only): ");
			String so = sc.nextLine(); // similiarly Float,Double can be added to it as per the data type.
			
			System.out.println("Enter the encryption key: ");
			int userN = sc.nextInt(); // similiarly Float,Double can be added to it as per the data type.
			// inserimento da parte dell'utente

			// il caso in cui shift venga = 0 come lo considero? metto un while e chiedo
			// inserimento di valore != 0 oppure restituisco stessa parola? per ora ho messo
			// che restituisce la stessa parola
			
			int shift = userN % 25; // prima faccio inserimento e lo riconverto considerando userN % 25 così posso
									// usare qualsiasi numero
			
			// il caso in cui shift venga = 0 come lo considero? metto un while e chiedo
			// inserimento di valore != 0 oppure restituisco stessa parola? per ora ho messo
			// che restituisce la stessa parola


			System.out.println("Original: " + so);
			System.out.println("Encripted: " + encryptCaesar(so, shift) + "\n");

		}

	}

	public static String encryptCaesar(String s, int n) {

		if (s == null || s.isEmpty()) {
			return "Nothing to encrypt";
		}

		StringBuilder se = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {

			char cur = s.charAt(i);

			if (cur >= 'A' && cur <= 'Z' ) {
				se.append((char) (('A' + (cur + n - 'A')%26)));
			} else {
				return s + " can't be encrypted. \nOnly ONE word all in uppercase is accepted";
			}
			//aggiungere il caso negativo e guardare il %25 all'inizio
		}
		return se.toString();
	}

}
	
