package com.qa.day6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BlackjackSimpleTest {
	BlackjackSimple bjS = new BlackjackSimple();
	
	@Before
	public void init() {
		
	}
	@Test
	public void testPlay() {
		assertEquals(0, bjS.play(22, 22));
		assertEquals(19, bjS.play(19, 22));
		assertEquals(19, bjS.play(22, 19));
		assertEquals(20, bjS.play(18, 20));
		assertEquals(20, bjS.play(20, 18));
	}
}
