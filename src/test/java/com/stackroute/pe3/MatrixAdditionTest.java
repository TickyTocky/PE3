package com.stackroute.pe3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixAdditionTest 
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
		int [][] output = {{10, 20}, {23, 43}, {40, 34}};
		int [][] output1 = {{30, 45}, {21, 44}, {-5, -42}};
		int [][] outputFinal = {{49, 65}, {44, 87}, {35, -8}}; 
		assertNotEquals(outputFinal, test.addMatrix(output, output1));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testPass()
	{
		int [][] output = {{10, 20}, {23, 43}, {40, 34}};
		int [][] output1 = {{30, 45}, {21, 44}, {-5, -42}};
		int [][] outputFinal = {{40, 65}, {44, 87}, {35, -8}}; 
		assertEquals(outputFinal, test.addMatrix(output, output1));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testPass1()
	{
		int [][] output = {{10, 20}, {23, 43}};
		int [][] output1 = {{30, 45}, {21, 44}};
		int [][] outputFinal = {{40, 65}, {44, 87}}; 
		assertEquals(outputFinal, test.addMatrix(output, output1));
	}
	
	@Test
	public void testNull()
	{
		int [][] output = {{10, 20}, {23, 43}, {40, 34}};
		int [][] output1 = {{30, 45}, {21, 44}, {-5, -42}}; 
		assertNotNull(test.addMatrix(output, output1));
	}
}

