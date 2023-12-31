package restAssuredScripts;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Script008GITHUBBearerToken {
	
	@Test(priority='1')
	public void Authorization_bearertoken()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	

	
	@Test(priority='2')
	public void Authorization_bearertoken_specificrepo()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/repos/sonal0409/myAppE2E")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}

}
