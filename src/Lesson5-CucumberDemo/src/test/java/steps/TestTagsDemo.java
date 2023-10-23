package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestTagsDemo {
	
	WebDriver driver;
	
	@Then("I close browser")
	public void i_close_browser() {
	    driver.close();
	}
	
	@Then("I enter Input for the search box")
	public void i_enter_input_for_the_search_box() {
	  driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mac");
	}
	@Then("I click on search button")
	public void i_click_on_search_button() {
		 driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}
	
	@Given("I click on Add to Cart button")
	public void i_click_on_add_to_cart_button() {
		 driver.findElement(By.linkText("Shopping Cart")).click();
	}
	@Given("I click on Checkout button")
	public void i_click_on_checkout_button() {
		driver.findElement(By.linkText("Checkout")).click();
	}

	@Then("I click on logout link")
	public void i_click_on_logout_link() {
		driver.findElement(By.linkText("Logout")).click();
	}

	


}
