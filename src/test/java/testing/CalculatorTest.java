package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
class CalculatorTest {
	Calculator calculator;
	@BeforeEach
	void init() {
		calculator = new Calculator();
	}
	@Test
	void testAdd() {
		;//arrange
		int result=calculator.add(1, 3);//act
		assertEquals(4, result,"Test Failed");
		
	}
	@Test
	void testAddFloat() {
		float result=calculator.add(2.2F, 2.2F);
		assertEquals(4.4,result,0.0000010);
		
	}
	@Test
	void testAddNegativeNumber() {
		int result=calculator.addingNegativeNumbers(-1, -3);//act
		assertEquals(-4,result);
		
	}
	@Test
	void testAddNegativeFloat() {
		float result=calculator.addingNegativeFloatNumber(-2.2F, -2.2F);
		assertEquals(-4.4,result,0.0000010);
		
	}
	
	@Test
	void testDividingIntegers() {
		float result=calculator.divide(2,4);
		assertEquals(0.5,result,0.0);			
	}
	@Test
	void testingwhenDenominatorIsZero() {
		try {
			calculator.divideWithZero(1, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class,e.getClass());
		}
	}
}
