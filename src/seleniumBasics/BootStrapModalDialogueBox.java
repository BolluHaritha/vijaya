package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapModalDialogueBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::input[1]")).sendKeys("353454646");
		driver.findElement(By.xpath("//div[@class='JFPqaw']/descendant::span[1]")).click();


	}

}
