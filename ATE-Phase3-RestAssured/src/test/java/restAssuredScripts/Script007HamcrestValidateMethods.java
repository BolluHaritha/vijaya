package restAssuredScripts;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Script007HamcrestValidateMethods {
	
	@Test(priority='1')
	public void ValidateRepsonseBody()
	{
		String PMapikey = "PMAK-654c572bfc7f5e003fed2a43-af8b2725b3437b7b451635b92533638feb";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("workspaces[1].id", equalTo("c39d389c-2b94-42a7-b9b6-15392ab8a813"),
			  "workspaces[1].name",equalTo("Phase3-Lesson2-API Testing"),
			   "workspaces[1].type",equalTo("personal"));
		
		
	}
	
	@Test(priority='2')
	public void ValidateRepsonseBody_equlaTo()
	{
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("username", equalTo("Uname001"),
			  "email", equalTo("Positive@Attitude.com"),
			  "userStatus", equalTo(1));
		
		
	}
	
	
	@Test(priority='3')
	public void ValidateRepsonseBody_hasitems()
	{
		String PMapikey = "PMAK-654c572bfc7f5e003fed2a43-af8b2725b3437b7b451635b92533638feb";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("workspaces.name", hasItems("My Workspace","Phase3-Lesson2-API Testing"),
				"workspaces.type", hasItems("personal"));
		
		
	}

}
