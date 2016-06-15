package com.lp.test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AutoTest {

	@Test
	public void successTest() {
		int i = 1;
		System.err.println("successTest");
		assertTrue(i == 1);
	}
	
	@Test
	public void failureTest() {
		int i = 1;
		System.err.println("failureTest");
		assertTrue(i == 2);
	}

}
