package com.stackroute.pe3;

import static org.junit.Assert.*;



import org.junit.Test;

public class SquareTest {

	@Test
	public void test() 
	{
		App test = new App();
		int output = test.Square(5);
		assertEquals(25, output);
		assertNotEquals(40, output);
		assertNotNull(output);
	}
	
	@Test
	public void App() 
	{
		
	}

	

}
