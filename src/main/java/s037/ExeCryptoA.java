package s037;

/**
 * Algoritmo di Cesare
 * 
 * CIAO +1 -> DJBP
 * ZOO +1 -> APP
 * 
 * @param s
 * @return
 * 
 * time 0:15 min
 */

public class ExeCryptoA {
	
	final static int SHIFT = 1;
	
	public static void main(String[] args) {
		
		String[] so = {"CIAO", "ZOO", null, "", "ciao", "123"};

		for (int i = 0; i < so.length; i++ ) {
			System.out.println("Original: " + so[i]);
			System.out.println("Encripted: " + encryptCaesar(so[i]) + "\n");
		}
					
	}
	
	public static String encryptCaesar(String s) {
		
		if (s == null || s.isEmpty()) {
			return ("Nothing to encrypt");
		}
		
		StringBuilder se = new StringBuilder(s.length());
		
		for (int i = 0; i < s.length(); i++) {
			
			char cur = s.charAt(i);
			
			if (cur >= 'A' && cur < 'Z') {
				se.append((char) (cur + SHIFT));
			} else if( cur == 'Z'){
				se.append('A');
			}
			else {
				return (s + " can't be encypted");
			}
		}
		
		return se.toString();
	}
}
