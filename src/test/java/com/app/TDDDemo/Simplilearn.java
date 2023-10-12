package com.app.TDDDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Simplilearn {
	private static final WebElement Mycourses = null;
	private static final WebElement SignIn = null;
	WebDriver driver = null;
		
		// this method is expecting an input from the user
		
		
		@BeforeTest
		public void openbrowser()
		{
		
				driver = new ChromeDriver();
		
			
			driver.manage().window().maximize();
			driver.get("https://www.simplilearn.com/");
			driver.findElement(By.xpath( "//span[text()='Mycourses']"));
			driver.findElement(By.xpath("//div[text()='signIn']"));
		}
	    public void clickonMycourses()
		{
			Mycourses.click();
		}
		
		
		public void clickonRegister()
		{
		  SignIn.click();
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}



}
