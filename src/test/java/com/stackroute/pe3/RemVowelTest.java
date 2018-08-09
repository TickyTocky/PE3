package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemVowelTest 
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
		String output = test.remVowel("India, Germany, Australia, Belgium, France");
		
		assertNotEquals("India, Germany, Australia, Blgm, Frnc", output);
	}
	
	@Test
	public void testPass()
	{
		String output = test.remVowel("India, Germany, Australia, Belgium, France");
		
		assertEquals("nd, Grmny, strl, Blgm, Frnc", output);
	}
	
	@Test
	public void testNull()
	{
		String output = test.remVowel("India, Germany, Australia, Belgium, France");
		
		assertNotNull(output);
	}

}
