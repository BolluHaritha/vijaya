package com.app.JUnitDemo;
import java.util.Arrays;

import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Assertions;


public class DynamicTestAnnotation {
	
	@TestFactory
	public Collection<DynamicTest> dynamicTests() 
	{
		return Arrays.asList(
				DynamicTest.dynamicTest("Simple Test1", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Simple Test2", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Exception handling", () -> {throw new Exception("Exception dynamicTest");}),
				DynamicTest.dynamicTest("Simple Test2", () -> Assertions.assertTrue(true))
				
				);
	}
}



