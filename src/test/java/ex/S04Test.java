package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S04Test {
	@Test
	void sumPositive() {
		long actual = S04.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumNegPos() {
		long actual = S04.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S04.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S04.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S04.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S04.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S04.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S04.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S04.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S04.factorial(-4);

		assertThat(actual, is(0L));
	}


	@Test
	void fibonacciZero() {
		long actual = S04.fibonacci(0);
		
		assertThat(actual, is(0L));
	}

	@Test
	void fibonacciOne() {
		long actual = S04.fibonacci(1);
		
		assertThat(actual, is(1L));
	}
	
	@Test
	void fibonacciTwo() {
		long actual = S04.fibonacci(2);
		
		assertThat(actual, is(1L));
	}

	@Test
	void fibonacciSeven() {
		long actual = S04.fibonacci(7);
		
		assertThat(actual, is(13L));
	}
	
	@Test
	void multiplicationTable() {
		int[][] actual = S04.multiplicationTable(5);
		
		int[][] array = {{1,2,3,4,5},
				{2,4,6,8,10},
				{3,6,9,12,15},
				{4,8,12,16,20},
				{5,10,15,20,25}};
				
		assertThat(actual, is(array));
		
	}
}
