package com.qa.day6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	
	//in order to be able to use/test the customer class instantiate it
	
	Customer cust = new Customer();
	Customer x;
	
	@Before
	public void init() {
		x = new Customer(1, "Minnie", "London");
		cust.setName("xavier");
		cust.setName("Mickey");
	}

	@Test
	public void testGetName() {
		assertEquals("Minnie", x.getName());
		assertEquals("Mickey", cust.getName());
	}
	
	@Test
	public void testToString() {
		assertEquals("Customer [id=0, name=Mickey, address=null]", cust.toString());
	}
	
}

