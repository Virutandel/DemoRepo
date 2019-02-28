package ecommerceTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void sum() {
		int a = 20;
		int b = 10;
		System.out.println("SUM");
		assertEquals(30, a + b);
		
	}

	@Test
	public void sub() {
		int a = 20;
		int b = 10;
		System.out.println("SUB");
		assertEquals(10, a - b);
	}

	@Test
	public void mult() {
		int a = 20;
		int b = 10;
		System.out.println("MULT");
		assertEquals(200, a * b);
	}

	@Test
	public void div() {
		int a = 20;
		int b = 10;
		System.out.println("DIV");
		assertEquals(2, a / b);

		System.out.println("=========================================");
	}

}
