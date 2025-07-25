package pe.edu.elitec;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Calculator Tests")
public class CalculatorTest {

	private Calculator calculator;

	@BeforeEach
	void setUp(){
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Suma de números enteros")
	void testAddPostiveNumbers(){
		int a = 5;
		int b = 3;
		int expected = 8;

		int result = calculator.add(a,b);

		assertEquals(expected, result, "5 + 3 deber ser 8");
	}
}
