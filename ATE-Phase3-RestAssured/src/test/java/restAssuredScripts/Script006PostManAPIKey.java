package restAssuredScripts;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class Script006PostManAPIKey {
	@Test(priority='1')
	public void postmangetreq()
	{
		String PMapikey = "PMAK-654c572bfc7f5e003fed2a43-af8b2725b3437b7b451635b92533638feb";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200).log().all();
    }
	@Test(priority='2')
	public void extract_value_response()
	{
		String PMapikey = "PMAK-654c572bfc7f5e003fed2a43-af8b2725b3437b7b451635b92533638feb";
		String responseoutput = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().path("workspaces[1].name"); 
		System.out.println("The name of the workspace extracted is: " + responseoutput);
		
	}
	@Test(priority='3')
	public void extract_response_JSONPath()
	{
		String PMapikey = "PMAK-654c572bfc7f5e003fed2a43-af8b2725b3437b7b451635b92533638feb";
		Response res = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().response();
		JsonPath json = new JsonPath(res.asString());
		System.out.println(json.getString("workspaces[4]"));
		
	}
	

}
