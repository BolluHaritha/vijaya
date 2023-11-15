package com.sportyshoes.seleniumcucumberScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetupCheck {
	@Test
	public void test_setup_selenium()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:9010/");
		
	}

}
