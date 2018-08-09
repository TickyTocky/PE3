package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConsecutiveNumberTest 
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
		int [] output = {10, 11, 12, 13, 14, 15, 16};
		assertNotEquals(false, test.isConsecutive(output, 7));
	}
	
	@Test
	public void testFailure1() 
	{
		int [] output = {10, 19, 21, 13, 14, 15, 16};
		assertNotEquals(true, test.isConsecutive(output, 7));
	}
	
	@Test
	public void testPass()
	{
		int [] output = {86, 87, 88, 89, 90, 91, 92};
		assertEquals(true, test.isConsecutive(output, 7));
	}
	
	@Test
	public void testPass1()
	{
		int [] output = {81, 87, 44, 89, 90, 91, 92};
		assertEquals(false, test.isConsecutive(output, 7));
	}
	
	@Test
	public void testPass2()
	{
		int [] output = {99, 98, 97, 96, 95, 94, 93};
		assertEquals(true, test.isConsecutive(output, 7));
	}
	
	@Test
	public void testNull()
	{
		int [] output = {81, 87, 44, 89, 90, 91, 92};
		assertNotNull(test.isConsecutive(output, 7));	
	}
}
