package ex;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S05Test {

	@Test
	void reverseStringPlain() {
		String actual = S05.reverse("abc");

		assertThat(actual, is("cba"));
	}

	@Test
	void isPalindromePlain() {
		boolean actual = S05.isPalindrome("abba");

		assertThat(actual, is(true));
	}

	@Test
	void removeVowelsPlain() {
		String actual = S05.removeVowels("example");

		assertThat(actual, is("xmpl"));
	}

	@Test
	void bin2decPlain() {
		int actual = S05.bin2dec("1001");

		assertThat(actual, is(9));
	}

	@Test
	void bin2decPlain2() {
		int actual = S05.bin2dec("00101010");

		assertThat(actual, is(42));
	}

	@Test
	void bin2dec2Plain() {
		int actual = S05.bin2dec2("1001");

		assertThat(actual, is(9));
	}

	@Test
	void bin2dec2Plain2() {
		int actual = S05.bin2dec2("00101010");

		assertThat(actual, is(42));
	}

	@Test
	void reverseIntArrayPlain() {
		int[] original = new int[] { 1, 2, 3 };
		int[] actual = S05.reverse(original);
		int[] array = { 3, 2, 1 };

		assertThat(actual, is(array));

	}

	@Test
	void reverseIntArrayInPlacePlain() {
		int[] original = new int[] { 1, 2, 3 };
		int[] actual = S05.reverseInPlace(original);

		assertThat(actual, is(new int[] { 3, 2, 1 })); // in questo modo non definisco prima l'array come per il test
														// precedente, ma lo faccio direttamente qua. la convenzione per
														// definire un array senza dargli un nome è scrivere new int[]

	}

	@Test
	void averagePlain() {
		double actual = S05.average(new int[] { 1, 2, 3 });

		assertThat(actual, is(2.0));
	}

	@Test
	void averagePlain2() {
		double actual = S05.average(new int[] { 2, 3 });

		assertThat(actual, is(2.5));
	}

	@Test
	void maxPlain() {
		int actual = S05.max(new int[] { 2, 3, 1 });

		assertThat(actual, is(3));
	}

	@Test
	void maxPlain2() {
		int actual = S05.max(new int[] { -2, -3, -1 });

		assertThat(actual, is(-1));
	}
}
