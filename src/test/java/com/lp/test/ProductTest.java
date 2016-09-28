package com.lp.test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ProductTest {

	@Test
	public void getProduct() {
		int a = 1;
		assertTrue(a == 1);
	}
	
	@Test
	public void updateProduct() {
		int a = 2;
		assertTrue(a == 2);
	}

}
