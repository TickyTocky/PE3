package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateTest 
{
	private static App test;

	@BeforeClass
	public static void setup()
	{
		test = new App();
	}
	
	@AfterClass
	public static void teardown()
	{
		test = null; 
	}
	
	@Test
	public void testFailure() 
	{
		String [] output = {"Mon 24/07/2017", "Sun 30/07/2017"};
		assertNotEquals(output, test.dateCheck());
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testPass()
	{
		String [] output = {"Mon 06/08/2018", "Sun 12/08/2018"};
		assertEquals(output, test.dateCheck());
	}
	
	
	@Test
	public void testNull()
	{
		assertNotNull(test.dateCheck());	
	}	
}
