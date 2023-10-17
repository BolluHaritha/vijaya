package com.app.JUnitDemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionsJUnitDemo {
	
	@Test
	public void testAssertions()
	{
		
		String expected = new String("abc");
		String actual = new String("abc");
		String str3 = "junit";
		String str4 = null;
		String s1 = "sonal";
		String s2 = "sonal";
		int val1 = 20;
		int val2 = 30; 
		
		String [] array1 = {"one","two","three"};
		String [] array2 = {"one","two","three"};
		
		Assertions.assertArrayEquals(array1,array2);
	}


}
