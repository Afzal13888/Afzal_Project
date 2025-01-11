package AdecoCRM;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Lead {

	
	@Test(priority=1)
	public void createuser() {
		
		String url = "https://c-infosoft.in/adeco/leads-add.php"; // Replace with the actual URL	 
		 String token= "VmVob0tpK0RkY0x4bGRPRmpReDFBNW1YWDMvTFNHcGgrdnFCclZyQXlDTStBWDUwYmdZNEJkSkVXUzB0UE5iWlpyKysyTi8zQXJxdGQ5UzZtdGFQSDN1VHFEWXdyanJXVy9zVlJnRWtLVWNmUmkzTng2bE1mYzVvOTh2amFuUFhWSjBKTUkya0x2c0RRYmtpRkhqWUxnPT0";

		
	    HashMap<String, Object> data = new HashMap<>();
//		data.put("Full Name", "Rose Douglass");
//		data.put("Title ", "Test");
//		data.put("Lead Status", "Assinged");
//		data.put("Source ", "Email");
//		data.put("Opportunity", "1000.00");
//		data.put("Industry ", "Banking");
//		data.put("TRN Number", "1234567");
//		data.put("Description", "Good");
//		data.put("Account Name ", "Rose");
//		data.put("Website", "www.gmail.com");
//		data.put("Photo ", " ");
//		data.put("Assigned User ", "Kabilan");
//		data.put("Choose a Default Team", "Sale");
//		data.put("Email ID", "Rose@gmail.com");
//		data.put("Mobile Number", "1234567890");
		
	    data.put("Full Name", "Rose Douglass");
	     data.put("Title", "Tester");
	     data.put("Lead Status", "Qualified");
	     data.put("Source", "Email");
	     data.put("Opportunity", "1000.00");
	     data.put("Industry", "Banking");
	     data.put("TRN Number", "1234567");
	     data.put("Description", "Good");
	     data.put("Account Name", "Rose");
	     data.put("Website", "www.example.com");
	     data.put("Photo", ""); // If there’s a file, you’d need to handle it separately
	     data.put("Assigned User", "Kabilan");
	     data.put("Team", "Sales");
	     data.put("Email ID", "rose@example.com");
	     data.put("Mobile Number", "1234567890");
	    
		Response response = given()
		.contentType("text/html")
		.accept("text/html")      
		.header("Authorization", "Bearer " + token)
		.body(data)
				
		.when()
		   	.post(url);
//		   	.jsonPath().getInt("id");
		   	
		   	
	     System.out.println("Status Code: " + response.getStatusCode());
	     System.out.println("Response Body: " + response.asString());

	        // Optionally, assert response status
	        response.then().statusCode(200).log().all();
		   	
//		.then()
//			.statusCode(200)
//			.body("page",equalTo(2))
//			.log().all();
		
	}
	

	
}
