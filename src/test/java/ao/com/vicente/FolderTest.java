package ao.com.vicente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Model SimpleMath tests")
class FolderTest {


	Double n1 = 4D;
	Double n2 = 4D;
		

	
	//@Disabled("The reason that make you desable the test.")
	@Test
	@DisplayName("It should sum two double numbers.")
	void itShouldSumTwoNumbers() { 
		System.out.println("1");
		
		Double result = SimpleMath.soma(n1, n2);
		Double expected = 8D;
		// Message should display if the text fail.
		assertEquals(result, expected);
		assertNotNull(result);
	}
	
	
	//@Disabled("The reason that make you desable the test.")
	@Test
	@DisplayName("It should Run ArithmeticException.")
	void itShouldRunArithmeticExceptionSumTwoNumbers() { 
		System.out.println("1");
		
		Double numeroDouble = 4D;
		Double num = 0D;
		
		String expected = "Impossible divide by zero!";
		
		ArithmeticException result = assertThrows(ArithmeticException.class, ()->{
			 SimpleMath.divisao(numeroDouble, num);
		});
		
		assertEquals(result.getMessage(), expected);
	}
	
	
	@Test
	@DisplayName("It should multiply two double numbers.")
	void itShouldMultiplyTwoNumbers() {
		System.out.println("2");
		
		Double result = SimpleMath.multipicacao(n1, n2);
		Double expeted = 16D;
		assertEquals(result, expeted);
		assertNotNull(expeted);
	}
	
	@Test
	@DisplayName("It should divid two numbers.")
	void itShouldDividTwoNumbers() {
		System.out.println("3");
		
		Double result = SimpleMath.divisao(n1, n2);
		Double expeted = 1D;
		assertEquals(result, expeted);
		assertNotNull(result);
	}

	@Test
	@DisplayName("It should get the rest of division bwetween two numbers.")
	void itShouldGetTheRestOfDivisionOfTwoNumbers() {
		System.out.println("4");
		
		Double result = SimpleMath.restoDivisao(n1, n2);
		Double expeted = 0D;
		assertEquals(result, expeted, ()-> "It should get rest of division.");
		assertNotNull(result);
	}

}
