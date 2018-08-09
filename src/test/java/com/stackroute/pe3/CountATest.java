package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest 
{

	@Test
	public void test() 
	{
		App test = new App();
		int output = test.Count("A Lazy DAY, a Lazy Mind, A bRILLIANT IDEA.");

		assertEquals(8, output);
		assertNotEquals(4, output);
		assertNotNull(output);
	}

}
