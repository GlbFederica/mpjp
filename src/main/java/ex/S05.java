package ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {

		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("No string to reverse") ;
		}

		StringBuilder rev = new StringBuilder(s.length());

		for (int i = s.length() - 1; i >= 0; i--) {
			rev.append(s.charAt(i));
		}

		return rev.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {

		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("No string to evaluate");
		}

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {

		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("No string to evaluate");
		}

		StringBuilder rem = new StringBuilder(s.length());

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);

			if (cur != 'a' && cur != 'e' && cur != 'i' && cur != 'o' && cur != 'u' && cur != 'A' && cur != 'E'
					&& cur != 'I' && cur != 'O' && cur != 'U') {
				rem.append(cur);
			}
		}

		return rem.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {

		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("No string to evaluate");
		}

		int n = 0;

		for (int i = 0; i < s.length(); i++) {
			n += (s.charAt(s.length() -i -1) - '0') * Math.pow(2, i);
			
//    		int m = s.charAt(s.length()-i-1) - '0';    		
//    		n += m * Math.pow(2, i);
		}

		return n;
	}
	
	public static int bin2dec2(String s) {

		if (s == null || s.isEmpty()) {
			throw new IllegalArgumentException("No string to evaluate");
		}

		int n = 0;

//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(s.length() -i -1) == '1') {
//				n += Math.pow(2, i);
//			}else if (s.charAt(s.length() -i -1) != '1' && s.charAt(s.length() -i -1) != '0') {
//				return 0;
//			}
//		}
		
		for (int i = s.length(); i>0; i--) {
			if (s.charAt(i-1) == '1') {
				n += Math.pow(2, (s.length()-i));
			}else if (s.charAt(i-1) != '1' && s.charAt(i-1) != '0') {
				return 0;
			}
		}

		return n;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	
    public static int[] reverse(int[] data) {
        int[] result = new int[data.length];
        
        for (int i = 1; i<= data.length; i++) {
            result[i-1] =  data[data.length-i];
        }
        
        return result;
    }

    public static int[] reverseInPlace(int[] data) {
        
        for (int i = 1; i<= data.length/2; i++) {
            int temp = data[i-1];
            data[i-1] = data[data.length-i];
            data[data.length-i] = temp;
        }
        
        return data;
    }
    
	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		
		double sum = data[0]; //deve essere double se no int/double fa divisione intera e da il risultato come double
		
		for (int i=1; i < data.length; i++) {
			sum += data[i];
		}
		
		double res = sum/data.length;
		
		return res;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		
		//aggiungere check su data che non sia null o che non sia array vuoto e in questi casi tirare un'eccezione
		// if (data == null || data.length == 0)

		int res = Integer.MIN_VALUE; // posso anche inizializzare a int[0] e poi fare il for da i=1 in poi

		for (int i = 0; i < data.length; i++) {
			res = Math.max(data[i], res);
		}

		return res;

		// si poteva fare anche con array.sort che è un metodo della classe array che
		// ordina gli elementi, poi prendo l'ultimo. questo metodo però costa O(n log n)
		// come array.sort, mentre il metodo fatto qui costa O(n)
	}
}
