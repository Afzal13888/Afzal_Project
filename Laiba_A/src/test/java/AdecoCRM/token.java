package AdecoCRM;


import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

import java.util.HashMap;

import org.testng.annotations.Test;

public class token {

	@Test(priority=1)
	public void auth() {
		

		        // Authentication URL
		        String authUrl = "https://c-infosoft.in/adeco/leads-add.php";

		        // Credentials map
		        HashMap<String, String> credentials = new HashMap<>();
		        credentials.put("username", "admin@adeco.com");
		        credentials.put("password", "admin123");

		        // Send the request
		        Response response = given()
		            .contentType("text/html; charset=UFT-8")
		            .header("Accept", "text/html; charset=UFT-8")
		            .body(credentials)
		        .when()
		            .post(authUrl);

		        // Print full response details
		        System.out.println("Status Code: " + response.statusCode());
		        System.out.println("Response Content-Type: " + response.getContentType());
		        System.out.println("Response Body: " + response.asString());

		        // Check if response is JSON
		        if (response.getContentType().contains("application/json")) {
		            try {
		                JsonPath jsonPath = response.jsonPath();
		                String token = jsonPath.getString("token");  // Use the actual key from your response
		                System.out.println("Token: " + token);
		            } catch (Exception e) {
		                System.out.println("Error parsing JSON: " + e.getMessage());
		            }
		        } else {
		            System.out.println("Response is not JSON. Check the response body for more details.");
		        }
		    }
		

	}

