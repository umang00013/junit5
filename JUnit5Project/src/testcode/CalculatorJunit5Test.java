package testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.Calculator;
/* 
 * In Junit 5, test classes and test methods can declare 
 * custom display names via Junit 5 @DisplayName annotation.
 */

@DisplayName("Calculator Test Case")
class CalculatorJunit5Test {
	//create an object of class to be tested
Calculator calc;

	@BeforeEach
	void setUp() throws Exception {
		calc=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calc=null;
	}

	@Test
	@DisplayName("Calculator add Test")
	void testAdd() {
		double result=calc.add(10.50,20.43 );
		assertEquals(30.93,result,0);
	
	}

	@Test
	@DisplayName("Calculator subtract Test")
	void testSubtract() {
		double result=calc.subtract(20.50,10.43 );
		assertEquals(10.07,result,0);
			}

	@Test
	void testMultiply() {
		double result=calc.multiply(200,2.5 );
		assertEquals(500,result,0);
			}

	@Test
	@DisplayName("Calculator divide Test")
	void testDivide() {
		double result=calc.divide(100,20 );
		assertEquals(5,result,0);
			}

}