package s042;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import s042.Simple;

class SimpleTest {
	@Test
	public void negatePositive() {
		Simple simple = new Simple();
		int value = 42;

		int result = simple.negate(value);

		assertThat(result, equalTo(-42));
		// se ottengo effettivamente -42 ottengo luce verde, se viene sbagliato ottengo
		// luce rossa -> qualcosa non ha funzionato
	}
}
