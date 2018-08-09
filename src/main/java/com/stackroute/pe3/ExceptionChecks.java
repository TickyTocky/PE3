package com.stackroute.pe3;

public class ExceptionChecks 
{
	public static void main(String args[]) 
	{
        int result;                                                  
        int a = 3;
        int b = -1;                                                  
        int[] arr = null; 
                
        String s = "Doing String Checks.";
        for(int i = 0; i<4 ; ++i)
        try 
        {
          switch(i) 
          {
            case 0:
            	result = arr[0];       // NullPointerException.
            	break;

            case 1:
            	arr = new int[b];      // NegativeArraySizeException.
            	break;
            
            case 2:
            	arr = new int[a];
            	result = arr[a];       // ArrayIndexOutOfBoundsException.
            	break;
            
            case 3:
            	char c = s.charAt(0);    // StringIndexOutOfBoundsException
            	c = s.charAt(40);
            	System.out.println(c);    
          }
        } 
        
        catch(NullPointerException e) 
        {                  
        	System.out.println("Null Pointer Exception");
        } 
        
        catch(NegativeArraySizeException e) 
        {  
        	System.out.println("Negative Array Size Exception");
        } 
        
        catch(ArrayIndexOutOfBoundsException e) 
        { 
        	System.out.println("Array Index Out Of Bounds Exception");
        } 
        
        catch(StringIndexOutOfBoundsException e)
        {
        	System.out.println("String Index Out Of Bounds Exception"); 
        }
      }
}
