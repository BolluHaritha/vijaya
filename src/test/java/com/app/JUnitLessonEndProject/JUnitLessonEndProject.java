package com.app.JUnitLessonEndProject;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)


public class JUnitLessonEndProject {
	
	WebDriver driver;
	@BeforeAll
	public void startbrowser()
	{
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@DisplayName("Lesson 4 Project")
	@ParameterizedTest
	@CsvSource({
		 "admin, admin@123"
	})
	public void Testmethod(String username, String password)
	{
        driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(password);
	}
    @AfterAll
	public void closebrowser()
	{
		driver.close();
	}

}
