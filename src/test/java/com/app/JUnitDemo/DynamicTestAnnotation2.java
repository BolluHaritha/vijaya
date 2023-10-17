package com.app.JUnitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestAnnotation2 {
	@TestFactory
	public Stream<DynamicTest> dynamicTestsforPalindrome()  // here DynamicTest is class generating testcase at runtime
	{
		return Stream.of("pop","mom","dad","madam").map(inputText ->
		
		DynamicTest.dynamicTest(inputText,

	
		() -> Assertions.assertTrue(MyUtiles.isPalindrome(inputText)))	
				
				
				);
		
		
	}

}
