package ao.com.vicente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Model SimpleMath tests")
class FolderTest {

	Double n1 = 4D;
	Double n2 = 4D;
	
	//
	@Test
	@DisplayName("It should sum two double numbers.")
	void itShouldSumTwoNumbers() {
		Double result = SimpleMath.soma(n1, n2);
		Double expected = 8D;
		// Message should display if the text fail.
		assertEquals(result, expected);
		assertNotNull(result);
	}
	
	@Test
	@DisplayName("It should multiply two double numbers.")
	void itShouldMultiplyTwoNumbers() {
		Double result = SimpleMath.multipicacao(n1, n2);
		Double expeted = 16D;
		assertEquals(result, expeted);
		assertNotNull(expeted);
	}
	
	@Test
	@DisplayName("It should divid two numbers.")
	void itShouldDividTwoNumbers() {
		Double result = SimpleMath.divisao(n1, n2);
		Double expeted = 1D;
		assertEquals(result, expeted);
		assertNotNull(result);
	}

	@Test
	@DisplayName("It should get the rest of division bwetween two numbers.")
	void itShouldGetTheRestOfDivisionOfTwoNumbers() {
		Double result = SimpleMath.restoDivisao(n1, n2);
		Double expeted = 0D;
		assertEquals(result, expeted, ()-> "It should get rest of division.");
		assertNotNull(result);
	}

}
