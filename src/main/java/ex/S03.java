package ex;

public class S03 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		
		if(value > 0) {
			return "positive";
		}else if (value < 0) {
			return "negative";
		} else {
			return "zero";
		}
	
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		
		if(value==0) {
			throw new IllegalArgumentException("0 is neither positive or negative");
		}
		
		if (value%2 != 0) {
			return true;
		} 
		
		return false;
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		
		String[] word = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Nine"};
		
		if (value < 0 || value > 9) {
			return "Other";
		}
		
		return word[value];
		
		//idea di giovanni, più snello e leggibile di uno switch
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		// si può fare con tutti if else if...o in modo più snello come di seguito
		
		if (percentile < 0 || percentile >100) {
			//qui andrebbe tirata un'eccezione, non lo sappiamo ancora fare quindi restituiamo in maniera bruta un?
			return '?';
		}
		
		if (percentile <= 50) {
			return 'F';
		}
		if (percentile <= 60) {
			return 'E';
		}
		if (percentile <= 70) {
			return 'D';
		}
		if (percentile <= 80) {
			return 'C';
		}
		if (percentile <= 90) {
			return 'B';
		}
		//si può fare o con solo if o con else if
		
		return 'A'; // Non serve if perchè ho già escluso tutti gli altri casi
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		
		if (year > 1580 && ((year%4 == 0 && year%100 != 0) || year%400 == 0)) {
			return true;
		}

		return false;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];

		// TODO

		return result;
	}
}
