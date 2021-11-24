package com.qa.day6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestTemplate {
	
	//unit testing - JUnit
	//to write the tests we first have to add the external library and then import into our class to test
	
	//beforeClass annotation -> runs before any tests in the class and is used to setup the test environment
	
	@BeforeClass
	
	public static void setUp() {
		//this is where you would setup the connection to a database
	}
	
	//before annotation -> runs before each test and is used to declare variables/initialise them
	@Before
	public void init() {
		
	}
	//test annotation -> says to test the method below
	@Test
	public void test1() {
		
	}
	
	//Ignore annotation ignores the test method below
	@Ignore 
	@Test
	public void test2() {
		
	}
	//after annotation runs after each test t o reset any data that was changed within the test
	@After
	public void reset() {
		
	}
	
	//afterClass annotation -> runs after all tests in the class and is used to close the test environment
	@AfterClass
	public static void close() {
		//this is where you would close the connection to a database
	}
}
