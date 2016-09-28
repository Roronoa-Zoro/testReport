package com.lp.test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ProductTest {

	private ProductService ps = new ProductService();

	@Test
	public void getProduct() {
		Product p = ps.getProduct(2);
		assertEquals(2, p.getId());
		assertEquals(10, p.getPrice());
	}
	
	@Test
	public void updateProduct() {
		Product p = ps.updateProduct(2);
		assertEquals(2, p.getId());
		assertEquals(30, p.getPrice());
	}

}
