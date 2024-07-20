package ao.com.vicente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class FolderTest {

	@Test
	void soma() {
		Double result = SimpleMath.soma(4D, 4D);
		Double expected = 8D;
		// Message should display if the text fail.
		assertEquals(result, expected, () -> "It should sum two double numbers");
		assertNotNull(result);
	}
	
	@Test
	void multiplicao() {
		Double result = SimpleMath.multipicacao(4D, 4D);
		Double expeted = 16D;
		assertEquals(result, expeted, () -> "It should divid two double numbers");
		assertNotNull(expeted);
	}
	
	@Test
	void divisao() {
		Double result = SimpleMath.divisao(4D, 4D);
		Double expeted = 1D;
		assertEquals(result, expeted);
		assertNotNull(result);
	}

	@Test
	void restoDivisao() {
		Double result = SimpleMath.restoDivisao(4D, 4D);
		Double expeted = 0D;
		assertEquals(result, expeted);
		assertNotNull(result);
	}

}
