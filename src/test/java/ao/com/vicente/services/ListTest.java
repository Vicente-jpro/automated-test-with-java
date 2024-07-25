package ao.com.vicente.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ListTest class")
class ListTest {

	@Test
	@DisplayName("It should return multiple values.")
	void it_should_return_multiple_values() {
		List<?> lista = mock(List.class);
		when(lista.size())
			.thenReturn(10)
			.thenReturn(20)
			.thenReturn(30);
		
		assertEquals(10, lista.size());
		assertEquals(20, lista.size());
		assertEquals(30, lista.size());
	}
	
	
	@Test
	@DisplayName("It should return Vicente value.")
	void it_should_return_vicente() {
		
		List<String> lista = mock(List.class);
		when(lista.get(0))
		.thenReturn("Vicente");
	}

}
