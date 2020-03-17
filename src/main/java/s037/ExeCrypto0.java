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

public class ExeCrypto0 {

	final static int SHIFT = 1;

	public static void main(String[] args) {

		String so1 = "CIAO";
		String so2 = "ZOO";

		System.out.println("Original: " + so1);
		System.out.println("Encripted: " + encryptCaesar(so1));

		System.out.println("Original: " + so2);
		System.out.println("Encripted: " + encryptCaesar(so2));

	}

	public static String encryptCaesar(String s) {

		if (s == null || s.isEmpty()) {
			System.out.println("Nothing to encrypt");
			return " --- ";
		}

		StringBuilder sc = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {

			char cur = s.charAt(i);

			if (cur >= 'A' && cur < 'Z') {
				sc.append((char) (cur + SHIFT));
				// dovendo incrementare solo di 1 posso fare sc.append(++cur) che riconosce che
				// cur è un char e lo incrementa di 1 char, senza bisogno del cast a char
				// posso farlo perchè sto costruendo un metodo per crittare che aumenta tutto di
				// 1. se voglio fare un metodo più libero devo gestire diversamente la Z, ad
				// esempio dicendo che diventa A + (SHIFT -1)
			} else if (cur == 'Z') {
				sc.append('A');
			} else {
				return (s + " can't be encrypted");
			}
		}

		return sc.toString();
	}
}
