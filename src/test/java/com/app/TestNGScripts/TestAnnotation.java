package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	@Test
	public void GetTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("MyAccount")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Seleniumdemo@123");
		driver.findElement(By.id("input-password")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(1500);
		driver.close();
	}
	@Test
	public void logout() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("MyAccount")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("Seleniumdemo@123");
		driver.findElement(By.id("input-password")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("MyAccount")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1500);
		driver.close();
		
		
	}


}
