package steps;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
public class CapstoneProject {
	
	@Given("User send a Get request to create a user and validates status")
	public void user_send_a_get_request_to_create_a_user_and_validates_status() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();

	   
	}

	@Given("User sends a Post request to add a new product")
	public void user_sends_a_post_request_to_add_a_new_product() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
	    
	}

	@Given("User sends a Put request to update and delete the product")
	public void user_sends_a_put_request_to_update_and_delete_the_product() {
		
		 RestAssured.given()
		 .baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
        .queryParam("sizes","5,6,7")
		.queryParam("price", "2500")
		.when()
		.put()
		.then()
		.log().all();
	    
	}
	
	public void delete_product()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020")
		.when().delete()
		.then().log().all();
		
	}

}
