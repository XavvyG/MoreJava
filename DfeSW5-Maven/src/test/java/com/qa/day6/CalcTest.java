package com.qa.day6;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest() {

		assertEquals(7, Calc.add(3, 4));
		assertEquals(17, Calc.add(3, 14));
	}
	
	@Test
	public void checkTest() {
		assertTrue(Calc.check(false));
		assertFalse(Calc.check(true));
//		assertTrue(Calc.check(true));
	}
}