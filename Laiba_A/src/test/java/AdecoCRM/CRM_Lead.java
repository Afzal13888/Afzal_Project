package AdecoCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CRM_Lead extends CRM_Login {

	@Test(priority=1)
	public void lead() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Leads']")).click();
	}
	
	@Test(priority=2,dependsOnMethods="lead")
	public void CreateNew() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	}
	
//	@Ignore
	@Test(priority=3,dependsOnMethods="CreateNew")
	public void AddValue() throws InterruptedException {
		
		Faker faker = new Faker();
	    String FakerName=faker.name().fullName();
	    String FakerTitle=faker.artist().name();
	    
	    
		Thread.sleep(1000);
		driver.findElement(By.name("full_name")).sendKeys(FakerName);
		Thread.sleep(1000);
		driver.findElement(By.name("lead_title")).sendKeys(FakerTitle);
		Thread.sleep(1000);
		WebElement CourseNameElement = driver.findElement(By.id("lead_status"));
		Select courseName_dd = new Select(CourseNameElement);
		courseName_dd.selectByIndex(2);
		Thread.sleep(1000);
		
		List<WebElement> options = courseName_dd.getAllSelectedOptions();
        for (WebElement option : options) {
            System.out.println("Lead Status: " +option.getText());
        }
		
	}
	
//	@Ignore
	@Test(priority=4)
	public void Source() throws InterruptedException {
		
		driver.findElement(By.id("s2id_lead_source")).click();
	    Thread.sleep(1000);				
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
	    
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Email")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Lead Source: " +option.getText());
       }
	}
	
//	@Ignore
	@Test(priority=5)
	public void amt() throws InterruptedException {
				
		driver.findElement(By.name("lead_value")).sendKeys("1000.00");
		Thread.sleep(2000);
		
		WebElement CourseNameElement1 = driver.findElement(By.id("lead_currency"));
		Select courseName_dd1 = new Select(CourseNameElement1);
		courseName_dd1.selectByIndex(1);
		Thread.sleep(1000);
		
		List<WebElement> options2 = courseName_dd1.getAllSelectedOptions();
        for (WebElement option : options2) {
            System.out.println("Lead Currency: " +option.getText());
        }
        Thread.sleep(1000);
		driver.findElement(By.id("s2id_lead_industry")).click();
	    Thread.sleep(1000);
	    
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
	   
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Aerospace")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Lead Source: " +option.getText());
       }  

		Faker faker = new Faker();
		String fakerTrn =faker.number().digits(10);
		String fakerDes =faker.aviation().aircraft();
		String fakerName =faker.name().fullName();
		
        Thread.sleep(2000);
		driver.findElement(By.name("lead_trn")).sendKeys(fakerTrn);
		Thread.sleep(1000);
		driver.findElement(By.name("lead_desc")).sendKeys(fakerDes);
		Thread.sleep(1000);
		driver.findElement(By.name("account_name")).sendKeys(fakerName);
		Thread.sleep(1000);
		driver.findElement(By.name("lead_website")).sendKeys("www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.id("lead_image")).sendKeys("D:\\Ticket\\ph.png");
		Thread.sleep(1000);
		
		driver.findElement(By.id("s2id_lead_assigned")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
	   
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Super Admin")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Lead Assign: " +option.getText());
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
          System.out.println("Lead Assign: " +option.getText());
       }
	}
	 
//	@Ignore
	@Test(priority=6)
	public void Scroll() throws InterruptedException {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
       
	}
	
//	@Ignore
	@Test(priority=7)
	public void email() throws InterruptedException {
		
		Faker faker = new Faker();
		String fakerMail=faker.name().firstName();
		String fakerPhone=faker.phoneNumber().cellPhone();
		
		driver.findElement(By.name("contact_email")).sendKeys(fakerMail+"@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("contact_mobile")).sendKeys(fakerPhone);
		Thread.sleep(1000);
		driver.findElement(By.id("addContact")).click();
		Thread.sleep(1000);
	}
	
//	@Ignore
	@Test(priority=8,dependsOnMethods="email")
	public void address() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Address']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("s2id_country_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
	    
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
          if(OptionText.equals("India")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Country: " +option.getText());
       }
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
	}    
	
	@Test(priority=9, dependsOnMethods="address")
	public void State() throws InterruptedException {
	    driver.findElement(By.id("s2id_state_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
	    
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Tamilnadu")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("State: " +option.getText());
       }
	    Thread.sleep(4000);
	}  

	@Test(priority=10, dependsOnMethods="State")
	public void City() throws InterruptedException {
	    driver.findElement(By.id("s2id_city_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
	    
	    for (WebElement option : options2) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Chennai")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("City: " +option.getText());
       }
	    Thread.sleep(4000);
	}
	
	@Test(priority=11, dependsOnMethods="City")
	public void Pin() throws InterruptedException {
		Faker faker = new Faker();
		String fakerPin=faker.address().zipCode();
		String fakerAddress=faker.address().country();
		
		driver.findElement(By.name("pincode")).sendKeys(fakerPin);
		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys(fakerAddress);
		Thread.sleep(1000);
	}
	
//	@Ignore
	@Test(priority=12)
	public void sub() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.name("SAVE")).click();
		Thread.sleep(1000);
	}
}
