package restAssuredScripts;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class LogginginRestAssured {
	
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-654c572bfc7f5e003fed2a43-af8b2725b3437b7b451635b92533638feb";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}


}
