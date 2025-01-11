package step2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BDD {

		public static WebDriver driver;
		
	@Given("user enter the1 {string}")
		public void user_enter_the1(String username) {
		  WebDriverManager.chromedriver().setup();	
		  driver = new ChromeDriver();
		  driver.get("https://cignareports.firstsource.com/CignaSympraxisReports/cignareport/Login.aspx");	
		  driver.manage().window().maximize();
		  driver.findElement(By.id("UserName")).sendKeys(username);
		}
	@And("user enter the {string}")
		public void user_enter_the(String password) {
			driver.findElement(By.id("Password")).sendKeys(password);  
		}
	@When("user click on the login button")
		public void user_click_on_the_login_button() {
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	@Then("Login should be success")
		public void login_should_be_success() {
		    driver.quit();
		}
		
	}


