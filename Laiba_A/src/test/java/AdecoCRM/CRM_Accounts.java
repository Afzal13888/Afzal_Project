package AdecoCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CRM_Accounts extends CRM_Login {

	@Test(priority=1)
	public void Account_name() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Accounts']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	    
	    Faker faker = new Faker();
	    String FakerName=faker.name().fullName();
	    String fakerDes =faker.aquaTeenHungerForce().character();
	    String fakerTrn =faker.number().digits(10);
	    String fakerState =faker.address().state();
	    
	    driver.findElement(By.name("account_name")).sendKeys(FakerName);
	    Thread.sleep(1000);
	    driver.findElement(By.id("s2id_account_type")).click();
	    Thread.sleep(1000);
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Investor")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Type: " +option.getText());
       }
	    Thread.sleep(1000);
	    driver.findElement(By.name("account_desc")).sendKeys(fakerDes); 
	    Thread.sleep(1000);
	    driver.findElement(By.name("account_trn")).sendKeys(fakerTrn+fakerState+fakerTrn);
	}
	
	@Test(priority=2)
	public void Account_web() throws InterruptedException {
	
		Faker faker = new Faker();
		String FakerName=faker.name().fullName();
		String fakerPhone=faker.phoneNumber().cellPhone();
		
		Thread.sleep(1000);
	    driver.findElement(By.name("account_website")).sendKeys("www.google.com"); 
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("s2id_account_industry")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Aerospace")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Industry: " +option.getText());
       }
	    
	    Thread.sleep(1000);
	    driver.findElement(By.id("s2id_account_assigned")).click();
	    Thread.sleep(1000);
	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options2) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Kabilan")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Acount: " +option.getText());
       }
	    
	    Thread.sleep(1000);
	    driver.findElement(By.id("s2id_team_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options3 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options3) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Sales 2")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Team: " +option.getText());
       }
	    Thread.sleep(1000);
	    driver.findElement(By.id("contact_email")).sendKeys(FakerName+"@Yahoo.com");
	    Thread.sleep(1000);
	    driver.findElement(By.id("contact_mobile")).sendKeys(fakerPhone);
	    Thread.sleep(1000);
	    driver.findElement(By.id("addContact")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Address']")).click();
	}
	
	@Test(priority=3)
	public void Account_Billing_Country() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_bill_country_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options4) {
	    	String OptionText = option.getText();
          if(OptionText.equals("India")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Country: " +option.getText());
       }
	}
	
	@Test(priority=4,dependsOnMethods="Account_Billing_Country")
	public void Account_Billing_State() throws InterruptedException {
		
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_bill_state_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options4) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Kerala")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("State: " +option.getText());
       }
	}
	
	@Test(priority=5,dependsOnMethods="Account_Billing_State")
	public void Account_Billing_City() throws InterruptedException {
		
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_bill_city_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options4) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Alleppey")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("City: " +option.getText());
       }
	}
	
	@Test(priority=6,dependsOnMethods="Account_Billing_City")
	public void Account_Billing_Pin() throws InterruptedException {
		Faker faker = new Faker();
		String fakerPin=faker.address().zipCode();
		String fakerAddress=faker.address().country();
		
		Thread.sleep(1000);
		driver.findElement(By.id("bill_pincode")).sendKeys(fakerPin);

		Thread.sleep(1000);
		driver.findElement(By.id("bill_address")).sendKeys(fakerAddress);
		
		Thread.sleep(1000);
		driver.findElement(By.id("same_address")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("SAVE")).click();
		
	}
}
