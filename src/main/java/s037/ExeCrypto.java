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

public class ExeCrypto {
	
	final static int SHIFT = 1;
	
	public static void main(String[] args) {
		
		String so1 = "CIAO";
		String so2 = "ZOO";
		String so3 = null;
		String so4 = "";
		String so5 = "ciao";
		String so6 = "123";
		
		System.out.println("Original: " + so1);
		System.out.println("Encripted: " + encryptCaesar(so1) + "\n");
		
		System.out.println("Original: " + so2);
		System.out.println("Encripted: " + encryptCaesar(so2) + "\n");
		
		System.out.println("Original: " + so3);
		System.out.println("Encripted: " + encryptCaesar(so3) + "\n");
		
		System.out.println("Original: " + so4);
		System.out.println("Encripted: " + encryptCaesar(so4) + "\n");
		
		System.out.println("Original: " + so5);
		System.out.println("Encripted: " + encryptCaesar(so5) + "\n");
		
		System.out.println("Original: " + so6);
		System.out.println("Encripted: " + encryptCaesar(so6) + "\n");
		
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
