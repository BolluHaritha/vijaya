package steps;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StarhealthPage {
	WebDriver driver;
	@Given("User open the chrome browser and starhealth application")
	public void user_open_the_chrome_browser_and_starhealth_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
		
	   
	}

	@When("User  waits for the Welcome to Star Health pop-up and closes it")
	public void user_waits_for_the_welcome_to_star_health_pop_up_and_closes_it() {
		
		driver.findElement(By.xpath("//div[@class=\"ant-modal-title\"]"));
		driver.findElement(By.xpath("//div[@class=\"ant-modal-close-x\"]"));
	   
	}

	@Then("validates the Star Health home page title using a JUnit assertion")
	public void validates_the_star_health_home_page_title_using_a_j_unit_assertion() {
		
		System.out.println("The title of the page");
		String ExpectedTitle = "Star Health Logo";
		String ActualTitle = driver.getTitle(); // replace it with selenum code
       assertEquals(ActualTitle, ExpectedTitle , "The title is not valid");
       
       driver.findElement(By.xpath("//img[@alt=\"Star Health Logo\"]")).click();
	    
	}

	@Then("clicks on the Buy Now button")
	public void clicks_on_the_buy_now_button() {
		
		driver.findElement(By.xpath("(//span[@class=\"btn-text\"])[1]")).click();
	   
	}

	@Then("User enters following details")
	public void user_enters_following_details(DataTable datatable) {
		
		// fetches the entire data table
				List<Map<String, String>> userList	= datatable.asMaps(String.class, String.class);
			// Now iterate over each row of the data table and get the value based on the columnname(key)
				
				//| URL | FullName | PhNo | PIN | OptionPlan |
				for(Map<String, String> e : userList) {
					// System.out.println(e);
					
					  driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[1]")).clear();
					  driver.findElement(By.xpath(
					 "(//div[@class='cdx-text-input']/descendant::input[1])[1]"))
					  .sendKeys(e.get("URL")); driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
					  driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[2]"))
					 .sendKeys(e.get("FullName")); driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
					  driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[3]"))
					  .sendKeys(e.get("PhNo")); driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
					  driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
					  .sendKeys(e.get("PIN"));
					  
					  driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[2]")).clear();
					  driver.findElement(By.xpath(
					  "(//div[@class='cdx-text-input']/descendant::input[1])[4]"))
					  .sendKeys(e.get("OptionPlan"));
					 
				}
				

	}

	@Then("User clicks on I need health insurance from the drop-down menu and select plan")
	public void user_clicks_on_i_need_health_insurance_from_the_drop_down_menu_and_select_plan() {
		
		driver.findElement(By.xpath("//select=right-icon ml-10"));
	   
	}

	@Then("User click on the Plan for My Family page")
	public void user_click_on_the_plan_for_my_family_page() {
		driver.findElement(By.xpath("//div[@class=\"our-plans_w-100p__fKY_m text-28 font-800 \"]"));
	   
	}

	@Then("Validate the user mobile number")
	public void validate_the_user_mobile_number() {
		driver.findElement(By.xpath("//div[@class=\"text-main ml-8 flex[2]\"]"));
	    
	}

	@Then("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() {
		
		driver.findElement(By.xpath("//img[@alt=\"Star Health Logo\"]"));
	    
	}

	@Then("Close all the browsers")
	public void close_all_the_browsers() {
		driver.close();
	   
	}

}
