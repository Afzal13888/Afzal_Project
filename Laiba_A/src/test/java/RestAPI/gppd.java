package RestAPI;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class gppd {

	int id;
	
	
	@Test(priority=1)
	public void getuser() {
		
		
		given()
		.pathParam("mypath", "users")   //Path parameter
		.queryParam("page", 2)  // Query parameter
		
		.when()
		   	.get("https://reqres.in/api/{mypath}")
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
		
	}
	
	
	@Test(priority=2)
	public void createuser() {
		
		HashMap data=new HashMap();
		data.put("Name", "Afzal");
		data.put("Job", "Tester");
		
		given()
		.contentType("Application/json")
		.body(data)
				
		.when()
		   	.post("https://reqres.in/api/users")
		   	.jsonPath().getInt("id");
		   	
//		.then()
//			.statusCode(200)
//			.body("page",equalTo(2))
//			.log().all();
		
	}
	
	
	@Test(priority=3, dependsOnMethods= {"createuser"} )
	public void updateuser() {
		
		HashMap data=new HashMap();
		data.put("Name", "Laiba");
		data.put("Job", "Manager");
		
		given()
		.contentType("Application/json")
		.body(data)
				
		.when()
		   	.put("https://reqres.in/api/users/"+id)
		   	
		   	
		.then()
			.statusCode(200)
			.body("Name",equalTo("Laiba"))
			.body("Job",equalTo("Manager"))
			.log().all();
		
	}


	@Test(priority=4)
	public void deleteuser() {
				
		given()
		
				
		.when()
		   	.delete("https://reqres.in/api/users/"+id)
		   	
		   	
		.then()
			.statusCode(204)
			.log().all();
		
	}

}
