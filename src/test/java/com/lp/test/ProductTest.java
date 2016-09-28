package com.lp.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class ProductTest {

	@InjectMocks
	@Resource
	private ProductService ps;

	@Spy
	@Resource
	private ProductDao pd;

//	@InjectMocks
//	@Resource
//	private ProductService mockPS = new ProductService();

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		doAnswer(new Answer<Product>() {
			public Product answer(InvocationOnMock invocation) {
				Product p = new Product();
				p.setId(1111);
				p.setPrice(1111);
				return p;
			}
		}).when(pd).getProductFromDb(1111);
	}

	@Test
	public void getProductTest() {
		Product p = ps.getProduct(2);
		assertEquals(2, p.getId());
		assertEquals(10, p.getPrice());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getProductFromDbTest() {
		Product p = ps.getProductFromDb(2);
	}

	@Test
	public void getProductFromDbWithMockTest() {
		Product p = ps.getProductFromDb(1111);
		assertEquals(1111, p.getId());
		assertEquals(1111, p.getPrice());
	}

	@Test
	public void loadProductFromDbTest() {
		Product p = ps.loadProductFromDb(2);
		assertEquals(2, p.getId());
		assertEquals(8, p.getPrice());
	}

	@Test
	public void updateProductTest() {
		Product p = ps.updateProduct(2);
		assertEquals(2, p.getId());
		assertEquals(6, p.getPrice());
	}

}
