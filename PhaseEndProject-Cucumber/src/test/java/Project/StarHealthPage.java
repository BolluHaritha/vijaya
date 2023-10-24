package Project;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class StarHealthPage {
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}
	@Test(priority='1')
	public void Validate_title()
	{
		System.out.println("The title of the page");
		String ExpectedTitle = "Star";
		String ActualTitle = driver.getTitle(); 
       assertEquals(ActualTitle, ExpectedTitle , "The title is not valid");
       
       driver.findElement(By.xpath("//img[@alt=\"Star Health Logo\"]")).click();
	}
	
	@Parameters({"name","mobile","email" })
	@Test(priority='2')
	public void Test_Header_plan(String name, String mobile, String email)
	{
		System.out.println("driver.findElement(By.xpath(\"//select=right-icon ml-10\"));");
		System.out.println("driver.findElement(By.xpath(\"//div[@class=\\\"our-plans_w-100p__fKY_m text-28 font-800 \\\"]\"));");
		System.out.println("driver.findElement(By.xpath(\"(//span[@class=\\\"btn-text\\\"])[1]\")).click();");
		Assert.assertTrue(true); 
		System.out.println("driver.findElement(By.xpath(\"//div[@class=\\\"text-main ml-8 flex[1]\\\"]\"));" + name);
		System.out.println("driver.findElement(By.xpath(\"//div[@class=\\\"text-main ml-8 flex[2]\\\"]\"));" + mobile);
		System.out.println("driver.findElement(By.xpath(\"//div[@class=\\\"text-main ml-8 flex[3]\\\"]\"));" + email);
		
	}
	
	@Test(priority='3',dataProvider = "testdata" )
	public void validatedatafromExcel(String input1, String input2, String input3, String input4 )
	{
		String	ActaulDetails1 = driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[2]")).getAttribute("href");
		System.out.println("driver.findElement(By.xpath(\"(//a[@class='mr-4 mr-10-xs'])[4]\")");
		String Expecteddetail1 = input1;
		Assert.assertEquals(ActaulDetails1,Expecteddetail1);
		System.out.println("driver.findElement(By.xpath(\"(//a[@class='mr-4 mr-10-xs'])[4]\")");
	}
	@DataProvider(name="testdata")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException
	{
		Object[][] inputdata = XLS_DataProvider.getTestData("Sheet2");
		return inputdata;
	}
	@Test(priority='4')
	public void Clickontwitter()
	{
		driver.findElement(By.xpath("(//a[@class='mr-4 mr-10-xs'])[4]")).click();
		System.out.println("Validate title of the page");
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
