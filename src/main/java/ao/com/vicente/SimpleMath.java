package ao.com.vicente;

public class SimpleMath {
	
	private SimpleMath() {
		
	}

	public static Double soma(Double n1, Double n2) {
		return n1 + n2;	
	}

	public static Double multipicacao(Double n1, Double n2) {
		return n1 * n2;
	}

	public static Double divisao(Double n1, Double n2) {
		if(n2.equals(0D))
			throw new ArithmeticException("Impossible divide by zero!");
		return n1 / n2;
	}

	public static Double restoDivisao(Double n1, Double n2) {
		return n1 % n2;
	}
}
