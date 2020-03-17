package s005;

import java.util.Arrays;

public class HelloTom {
	public static void main(String[] args) {
		// args nel main è un array di stringhe vuoto, se lancio il programma da prompt
		// e a fianco alla chiamata
		// del programma aggiungo un parametro es. s005.Hello Tom lui mette Tom in args
		// Per mettere gli argomenti in eclipse devo fare run configuration e mettere
		// l'argomento

		if (args.length == 0)
			System.out.println("Hello!");

		else
			System.out.println("Hello, " + args[0] + "!");
	}
}
