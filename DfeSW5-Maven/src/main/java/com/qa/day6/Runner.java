package com.qa.day6;

public class Runner {
	public static void main(String[] args) {
		TemperatureConverter temp = new TemperatureConverter();

		System.out.println(temp.convertFahrenheitToCelsius(149));
		System.out.println(temp.convertCelsiusToFahrenheit(100));
		System.out.println(temp.convertKelvinToCelsius(500));
		System.out.println(temp.convertCelsiusToKelvin(100));
		System.out.println(temp.convertKelvinToFahrenheit(425));
		System.out.println(temp.convertFahrenheitToKelvin(149));
	}
}
