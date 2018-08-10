package com.ash.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ash.de.Calculator;

public class CalTest {

	Calculator c=new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(6, c.add(3,2));
		
	}
}
