package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChessMatrixTest {
    private static App test;

    @BeforeClass
    public static void setUp()
    {
        test = new App();
    }
 
    @AfterClass
    public static void teardown() 
    {
    	test = null;
    }
 
    @SuppressWarnings("deprecation")
    @Test
    public void testPass()
    {
    	String[][] output = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                			 {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
      
    	assertEquals(output, test.chessBoard(8,8));
    }
    
    @Test
    public void testFail() 
    {
    	 String[][] output = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				   {"BB|","WW|","BB|","WW|","BB|"," |","BB|","WW|"},
				   {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				   {"BB|","BB|","BB|","WW|","WW|","WW|","BB|","WW|"},
			       {"WW|","BB|","WW|"," |","WW|","BB|","WW|","BB|"},
				   {"BB|","BB|","BB|","WW|","BB|","WW|","BB|","WW|"},
				   {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
				   {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};

    	 assertNotEquals(output, test.chessBoard(8,8));
    }
    
    @Test
    public void testNotNull() 
    {
        assertNotNull(test.chessBoard(8,8));
    }
    
}