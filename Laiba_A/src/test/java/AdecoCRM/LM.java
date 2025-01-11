package AdecoCRM;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.response.Response;

public class LM {

	@Test(priority=1)
	public void createuser() {

	 String url = "https://c-infosoft.in/adeco/leads-add.php"; // Replace with the actual URL	 
	 String token= "VmVob0tpK0RkY0x4bGRPRmpReDFBNW1YWDMvTFNHcGgrdnFCclZyQXlDTStBWDUwYmdZNEJkSkVXUzB0UE5iWlpyKysyTi8zQXJxdGQ5UzZtdGFQSDN1VHFEWXdyanJXVy9zVlJnRWtLVWNmUmkzTng2bE1mYzVvOTh2amFuUFhWSjBKTUkya0x2c0RRYmtpRkhqWUxnPT0";

     // Set up the data map with form fields
     HashMap<String, Object> data = new HashMap<>();
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

     // Send the POST request
     Response response = given()
         .contentType("application/json")
         .header("Authorization", "Bearer " + token)
         .body(data)
         .post(url);

     // Output the response for verification
     System.out.println("Status Code: " + response.getStatusCode());
     System.out.println("Response Body: " + response.asString());
	
     if (response.getStatusCode() == 302) {
         // Print the Location header to see the redirect URL
         String redirectUrl = response.getHeader("Location");
         System.out.println("Redirect URL: " + redirectUrl);
     } else {
         // Handle other status codes (e.g., 200, 404, etc.)
         System.out.println("Response Body: " + response.asString());
     }
     
     
//     if (response.getStatusCode() == 201 || response.getStatusCode() == 200) {
//         System.out.println("User created successfully!");
//     } else {
//         System.err.println("Failed to create user. Status code: " + response.getStatusCode());
//     }
	
	}
     
}
