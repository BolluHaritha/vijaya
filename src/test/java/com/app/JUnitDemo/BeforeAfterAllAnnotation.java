package com.app.JUnitDemo;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BeforeAfterAllAnnotation {
	
static  JavaOperations obj;
	
	@BeforeAll 
	public void init() {   
		System.out.println("Start Db connection");
		 obj = new JavaOperations();
		 System.out.println("Initalization done..");
	}
	
	
	@AfterAll 
	public void teardown() 
	{
		System.out.println("close DB connection");
	}
	
	@Test
	public void test1()
	{
		
		System.out.println("Execute the test case using methods of ... JavaOperations");
		
	}
	
	@Test
	public void test2()
	{
		
		System.out.println("Execute the test case using methods of ... JavaOperations");
		
	}


}
