package com.stackroute.pe3;

import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class App 
{	
	public int Square(int num)
	{
		return num * num;
	}
	
	public int Count (String word)
	{
		int count = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A')	// To check against a character we use ''.
			{
				count++;
			}
		}
		return count;
	}
	
	// Exercise 4
	public String remVowel(String str)
    {
         Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
          
         List<Character> al = Arrays.asList(vowels);
          
         StringBuffer sb = new StringBuffer(str);
          
         for (int i = 0; i < sb.length(); i++) 
         {
             if(al.contains(sb.charAt(i)))
             {
                sb.replace(i, i+1, "") ;
                i--;
             }
        }
          
        return sb.toString();
    }
	
	// Exercise 2
	public int[][] addMatrix(int[][] a, int[][] b) 
	{
	       int rows = a.length;
	       int columns = a[0].length;
	       int[][] result = new int[rows][columns];

	       for (int i = 0; i < rows; i++) 
	       {
	           for (int j = 0; j < columns; j++) 
	           {
	               result[i][j] = a[i][j] + b[i][j];
	           }
	       }
	       return result;
	}
	
	// Exercise 6
	public boolean isConsecutive(int arr[], int n) 
    {
        if (n < 1)
            return false;
 
        int min = getMin(arr, n);
 
        int max = getMax(arr, n);
 
        if (max - min + 1 == n) 
        {
            boolean visited[] = new boolean[n];
            for (int i = 0; i < n; i++) 
            {
                if (visited[arr[i] - min] == true)
                    return false;
 
                visited[arr[i] - min] = true;
            }
             
            return true;
        }
        return false; 
    }
	
	/* UTILITY FUNCTIONS */
    int getMin(int arr[], int n) 
    {
        int min = arr[0];
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
 
    int getMax(int arr[], int n) 
    {
        int max = arr[0];
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    
    // Exercise 5
    public String [][] chessBoard(int a, int b)
    {
    	String s[][] = new String [8][8];
    	String s1 = "WW|";
    	String s2 = "BB|";
    	for (int i = 1; i < 9; i++)
    	{
    	    for (int j = 1; j < 9; j++)
    	    {
    	        if (( i + j % 2) == 0 ) 
    	        {
    	            s[i][j] = s2;
    	        } 
    	        else 
    	        {
    	            s[i][j] = s1;
    	        }
    	    }
    	}
    	return s;
    }
}
