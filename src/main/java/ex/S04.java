package ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {

		long result = 0; // meglio non chiamarla sum perchè è già il nome del metodo

		// if (first <= last) { non è necessario perchè ci pensa il for a gestire la
		// cosa
		for (int i = first; i <= last; i++) {
			result += i;
		}
		// }

		return result;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {

		long result = 0;

		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}

		return result;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {

		if (value < 0) {
			return 0;
		}

		long result = 1;

		for (int i = value; i > 0; i--) { // rispetto al crescente rispetta di più la matemtica
			result *= i;
		}
		return result;

//		//si può fare anche in modo ricorsivo
//		switch (value) {
//		case 0:
//			return 1;
//		default
//			result = fattoriale(value-1);
//		}
//		return result;

	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {

		long fibOld = 0;
		long fib = 1;

		if (value == 0) {
			return fibOld;
		}

		for (int i = 2; i <= value; i++) {
			long temp = fibOld;
			fibOld = fib;
			fib = fib + temp;
		}

		return fib;
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {

		int[][] result = new int[value][value];

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}

//		for (int i=1; i<=result.length; i++) { //arrivo a result.length (numero di righe) che è la stessa cosa di value, ma più leggibile capire cos'è
//			for (int j=1; j<result[i].length; j++) { //arrivo a result[i].length (numero di colonne della riga i-esima, perchè l'array può non essere quadrato
//				result[i][j] = (i)*(j);
//				}
//		}
// 		questa versione rimane più leggibile per l'utente, ottengo una tabella con anche una riga e una colonna di zeri, 
//      ma in ogni posizione moltiplico i*j ed è immediato capire cosa succede

		return result;
	}
}
