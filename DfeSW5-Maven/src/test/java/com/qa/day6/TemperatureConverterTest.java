package com.qa.day6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TemperatureConverterTest {
	
	TemperatureConverter temp = new TemperatureConverter();
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void testConvertFahrenheitToCelsius() {
		assertEquals(65.0, temp.convertFahrenheitToCelsius(149),1);	
	}
	@Test
	public void testConvertCelsiusToFahrenheit() {
		assertEquals(212.0, temp.convertCelsiusToFahrenheit(100),1);
	}
	@Test
	public void testConvertKelvinToCelsius() {
		assertEquals(227.0, temp.convertKelvinToCelsius(500),1);
	}
	@Test
	public void testConvertCelsiusToKelvin() {
		assertEquals(373.0, temp.convertCelsiusToKelvin(100),1);
	}
	@Test
	public void testConvertKelvinToFahrenheit() {
		assertEquals(305.6, temp.convertKelvinToFahrenheit(425),1);
	}
	@Test
	public void testConvertFahrenheitToKelvin() {
		assertEquals(338.0, temp.convertFahrenheitToKelvin(149),1);
	}
	
}
