package ibat.calc;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	private MyMath testObject;
	
	@Before
	public void initialize() {
		testObject = new MyMath();
	}

	/*********************************************************************************************************/
	/*                                 			Addition													 */
	/*********************************************************************************************************/
	// testing addition of whole numbers
	@Test
	public void testAdd_TC1() {
		BigDecimal a = new BigDecimal(10);
		BigDecimal b = new BigDecimal(20);
		float result = testObject.MyAdd(a, b);
		assertEquals("Addition of 10 and 20 is.", 30, result, 0.0);
	}
	
	
	// testing addition of decimal numbers
	@Test
	public void testAdd_TC2() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(5.2);
		float result = testObject.MyAdd(a, b);
		assertEquals("Addition of 5.5 and 5.2 is.", new BigDecimal(10.7).floatValue(), result, 0.0);
	}
	
	// testing addition of zero 
	@Test
	public void testAdd_TC3() {
		BigDecimal a = new BigDecimal(0);
		BigDecimal b = new BigDecimal(0);
		float result = testObject.MyAdd(a, b);
		assertEquals("Addition of 0 and 0 is.", new BigDecimal(0).floatValue(), result, 0.0);
	}
	
	// testing addition of positive and negative numbers
	@Test
	public void testAdd_TC4() {
		BigDecimal a = new BigDecimal(-5);
		BigDecimal b = new BigDecimal(7);
		float result = testObject.MyAdd(a, b);
		assertEquals("Addition of -5 and 7 is.", new BigDecimal(2).floatValue(), result, 0.0);
	}
	
	// testing addition of both negative numbers
	@Test
	public void testAdd_TC5() {
		BigDecimal a = new BigDecimal(-5);
		BigDecimal b = new BigDecimal(-7);
		float result = testObject.MyAdd(a, b);
		assertEquals("Addition of -5 and -7 is.", new BigDecimal(-12).floatValue(), result, 0.0);
	}	

	/*********************************************************************************************************/
	/*                                 			Subtraction													 */
	/*********************************************************************************************************/

	// test subtraction of positive whole numbers
	@Test
	public void testSubtract_TC1() {
		BigDecimal a = new BigDecimal(20);
		BigDecimal b = new BigDecimal(10);
		float result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 20 and 10 is.", new BigDecimal(10).floatValue(), result, 0.0);
	}
	
	// test subtraction of positive decimal numbers
	@Test
	public void testSubtract_TC2() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(4.4);
		double result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 5.5 and 4.4 is.", new BigDecimal(1.1).floatValue(), result, 0.0);
	}
	
	// test subtraction of positive and negative decimal numbers
	@Test
	public void testSubtract_TC3() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(-4.5); 
		float result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 5.5 and -4.5 is.", new BigDecimal(10).floatValue(), result, 0.0);
	}
	
	// test subtraction of both negative decimal numbers
	@Test
	public void testSubtract_TC4() {
		BigDecimal a = new BigDecimal(-5.5);
		BigDecimal b = new BigDecimal(-4.4);
		float result = testObject.MySubtract(a, b);
		assertEquals("Substraction of -5.5 and -4.4 is.", new BigDecimal(-1.1).floatValue(), result, 0.0);
	}
	
	// test subtraction of zeros
	@Test
	public void testSubtract_TC5() {
		BigDecimal a = new BigDecimal(0);
		BigDecimal b = new BigDecimal(0);
		float result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 0 and 0 is.", new BigDecimal(0).floatValue(), result, 0.0);
	}	
	
	/*********************************************************************************************************/
	/*                                 			Multiplication												 */
	/*********************************************************************************************************/

	// test multiplication of positive whole numbers
	@Test
	public void testMultiply_TC1() {
		BigDecimal a = new BigDecimal(10);
		BigDecimal b = new BigDecimal(20);
		float result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 10 and 20 is.", 200, result, 0);
	}
	
	// test multiplication of positive decimal numbers
	@Test
	public void testMultiply_TC2() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(4.4);
		double result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 5.5 and 4.4 is.", new BigDecimal(24.2).floatValue(), result, 0.0);
	}
	
	// test multiplication of positive and negative decimal numbers
	@Test
	public void testMultiply_TC3() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(-4.4); 
		float result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 5.5 and -4.5 is.", new BigDecimal(-24.2).floatValue(), result, 0.0);
	}
	
	// test multiplication of both negative decimal numbers
	@Test
	public void testMultiply_TC4() {
		BigDecimal a = new BigDecimal(-5.5);
		BigDecimal b = new BigDecimal(-4.4);
		float result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of -5.5 and -4.4 is.", new BigDecimal(24.2).floatValue(), result, 0.0);
	}
	
	// test multiplication of zeros
	@Test
	public void testMultiply_TC5() {
		BigDecimal a = new BigDecimal(0);
		BigDecimal b = new BigDecimal(0);
		float result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 0 and 0 is.", new BigDecimal(0).floatValue(), result, 0.0);
	}	
	
	
	/*********************************************************************************************************/
	/*                                 			Division													 */
	/*********************************************************************************************************/

	// test division of positive whole numbers
	@Test
	public void testDivide_TC1() {
		BigDecimal a = new BigDecimal(10);
		BigDecimal b = new BigDecimal(20);
		float result = testObject.MyDivide(b, a);
		assertEquals("Division of 20 and 10 is.", new BigDecimal(2).floatValue(), result, 0.0);
	}
	
	// test division of positive decimal numbers
	@Test
	public void testDivide_TC2() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(4.4);
		double result = testObject.MyDivide(a, b);
		assertEquals("Division of 5.5 and 4.4 is.", new BigDecimal(1.25).floatValue(), result, 0.0);
	}
	
	// test division of positive and negative decimal numbers
	@Test
	public void testDivide_TC3() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(-4.4); 
		float result = testObject.MyDivide(a, b);
		assertEquals("Division of 5.5 and -4.5 is.", new BigDecimal(-1.25).floatValue(), result, 0.0);
	}
	
	// test division of both negative decimal numbers
	@Test
	public void testDivide_TC4() {
		BigDecimal a = new BigDecimal(-5.5);
		BigDecimal b = new BigDecimal(-4.4);
		float result = testObject.MyDivide(a, b);
		assertEquals("Division of -5.5 and -4.4 is.", new BigDecimal(1.25).floatValue(), result, 0.0);
	}
	
	// test division of zeros; should throw arithmetic exception 
	@Test (expected = ArithmeticException.class)
	public void testDivide_TC5() {
		BigDecimal a = new BigDecimal(0);
		BigDecimal b = new BigDecimal(0);
		float result = testObject.MyDivide(a, b);
	}
}
