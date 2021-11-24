package com.qa.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

//		1.) Factorials - Most people are familiar with the factorial operator in math. 5! yields 120
//		because factorial means "multiply successive terms where each are one less than
//		the previous: 5! -> 5 * 4 * 3 * 2 * 1 -> 120
		int number = 479001600;
		int i;
		for (i = 2; i < number; i++) {
			number = number / i;
		}
		if (number % i == 0) {
			System.out.println(number + "!");
		} else {
			System.out.println("NONE");
		}
//		

//		2.) Doggo Competition - Your job is to create a program that lists all places within the range of 0-100
//		in spoken English, excluding the placing (X) of your winning pup.

		int dogPlacement = 45;

		for (int x = 1; x < dogPlacement; x++) {
			String str = placementToString(x);
			System.out.println(x + str);
		}

		for (int y = dogPlacement + 1; y <= 100; y++) {
			String str = placementToString(y);
			System.out.println(y + str);
		}

//		4.)Calculator - Create a program that will take a series of numbers (5, 3, 15), and find how those numbers can add, subtract, multiply, or divide in various ways to relate to each other.
		calculate("6,2,12");
	}

	public static void calculate(String input) {
		String[] numberStrs = input.split(",");
		int[] numbers = new int[numberStrs.length];
//		for (int i = 0; i <= numberStrs.length; i++) {
//			numbers[i] = Integer.parseInt(numberStrs[i]);
//		}
		int a = numbers[0];
		int b = numbers[1];
		int c = numbers[2];
//		int d = numbers[3];

		if (a / b == c) {
			System.out.println(a + "/" + b + "=" + c);
		}
		if (b / a == c) {
			System.out.println(b + "/" + a + "=" + c);
		}
		if (a / c == b) {
			System.out.println(a + "/" + c + "=" + b);
		}
		if (b / c == a) {
			System.out.println(b + "/" + c + "=" + a);
		}
		if (c / a == b) {
			System.out.println(c + "/" + a + "=" + b);
		}
		if (c / b == a) {
			System.out.println(c + "/" + b + "=" + a);
		}
		if (a + b == c) {
			System.out.println(a + "+" + b + "=" + c);
		}
		if (b + a == c) {
			System.out.println(b + "+" + a + "=" + c);
		}
		if (a + c == b) {
			System.out.println(a + "+" + c + "=" + b);
		}
		if (b + c == a) {
			System.out.println(b + "+" + c + "=" + a);
		}
		if (c + a == b) {
			System.out.println(c + "+" + a + "=" + b);
		}
		if (c + b == a) {
			System.out.println(c + "+" + b + "=" + a);
		}
		if (a * b == c) {
			System.out.println(a + "*" + b + "=" + c);
		}
		if (b * a == c) {
			System.out.println(b + "*" + a + "=" + c);
		}
		if (a * c == b) {
			System.out.println(a + "*" + c + "=" + b);
		}
		if (b * c == a) {
			System.out.println(b + "*" + c + "=" + a);
		}
		if (c * a == b) {
			System.out.println(c + "*" + a + "=" + b);
		}
		if (c - b == a) {
			System.out.println(c + "*" + b + "=" + a);
		}
		if (a - b == c) {
			System.out.println(a + "-" + b + "=" + c);
		}
		if (b - a == c) {
			System.out.println(b + "-" + a + "=" + c);
		}
		if (a - c == b) {
			System.out.println(a + "-" + c + "=" + b);
		}
		if (b - c == a) {
			System.out.println(b + "-" + c + "=" + a);
		}
		if (c - a == b) {
			System.out.println(c + "-" + a + "=" + b);
		}
		if (c - b == a) {
			System.out.println(c + "-" + b + "=" + a);
		}

	}

	public static String placementToString(int number) {

		int hundred = number % 100;
		int ten = number % 10;

		if (hundred - ten == 10) {
			return "th";
		}

		switch (ten) {
		case (1):
			return "st";
		case (2):
			return "nd";
		case (3):
			return "rd";
		default:
			return "th";
		}

	}
}
