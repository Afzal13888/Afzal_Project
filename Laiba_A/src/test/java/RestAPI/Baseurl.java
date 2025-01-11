package RestAPI;

import io.cucumber.java.Before;
import io.restassured.RestAssured;


public class Baseurl {

	 @Before
	    public static void setup() {
	        
	        String baseUrl = "https://reqres.in"; // Set the base URL for the API
	        
	    }
	
}
