package ex;

import static org.junit.jupiter.api.Assertions.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

class S03TestBis {

	@Test
	void isOddZero() {
		try {
			S03.isOdd(0);
			 fail("An IllegalArgumentException was expected");
		} 
		catch (IllegalArgumentException iae) {
			String message = iae.getMessage();
			assertThat(message, is("0 is neither positive or negative"));
            return;
		}

	}

}
