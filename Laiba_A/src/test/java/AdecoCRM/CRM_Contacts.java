package AdecoCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CRM_Contacts extends CRM_Login{
	
	@Test(priority=1)
	public void Contact_name() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Contacts']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	    
	    Faker faker = new Faker();
	    String FakerName=faker.name().fullName();
//	    String fakerDes =faker.aquaTeenHungerForce().character();
//	    String fakerTrn =faker.number().digits(10);
//	    String fakerState =faker.address().state();
	    
	    driver.findElement(By.name("full_name")).sendKeys(FakerName);
	    Thread.sleep(1000);

	}
	
	
	@Test(priority=2)
	public void Contact_DOB() throws InterruptedException {
		
		String Month="May 2024";
		String day="19";
		
		driver.findElement(By.xpath("//i[contains(@class,'icon-calender')]")).click();
		Thread.sleep(1000);
	
		while(true) {
			
			driver.findElement(By.xpath("//th[contains(@class,'prev')]")).click();
			String text = driver.findElement(By.xpath("//th[contains(@class,'datepicker-switch')]")).getText();
			if(text.equals(Month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//th[contains(@class,'prev')]")).click();
			}
		}
		driver.findElement(By.xpath("//td[contains(@class,'day')][text()="+day+"]")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=3,dependsOnMethods="Contact_DOB")
	public void Contact_Des() throws InterruptedException {
		
		Faker faker = new Faker();
	    String FakerName=faker.name().fullName();
	    String FakerDesg=faker.job().position();
	    String fakerTrn =faker.number().digits(10);
	    String fakerState =faker.address().state().toUpperCase();
	    String fakerDes =faker.aquaTeenHungerForce().character();
	    
		driver.findElement(By.name("contact_desig")).sendKeys(FakerDesg);
		Thread.sleep(1000);
		driver.findElement(By.name("contact_trn")).sendKeys(fakerTrn+fakerState+fakerTrn);
		Thread.sleep(1000);
		driver.findElement(By.name("contact_desc")).sendKeys(fakerDes);
		Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void Contact_Acct() throws InterruptedException {
		
		Faker faker = new Faker();
		String FakerName=faker.name().fullName();
		String fakerPhone=faker.phoneNumber().cellPhone();
	    
		
		driver.findElement(By.id("s2id_account_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Lura Beer")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Account: " +option.getText());
       }
	    driver.findElement(By.id("contact_image")).sendKeys("D:\\Ticket\\ph.png");
		Thread.sleep(1000);
	    
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_contact_assigned")).click();
	    Thread.sleep(1000);
	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options2) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Kabilan")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Assinged: " +option.getText());
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
	
	@Test(priority=5)
	public void Contacts_Country() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_country_id")).click();
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
	
	@Test(priority=6,dependsOnMethods="Contacts_Country")
	public void Contacts_State() throws InterruptedException {
		
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_state_id")).click();
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
	
	@Test(priority=7,dependsOnMethods="Contacts_State")
	public void Contacts_City() throws InterruptedException {
		
		Thread.sleep(1000);
	    driver.findElement(By.id("s2id_city_id")).click();
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
	
	@Test(priority=8,dependsOnMethods="Contacts_City")
	public void Contacts_Pin() throws InterruptedException {
		Faker faker = new Faker();
		String fakerPin=faker.address().zipCode();
		String fakerAddress=faker.address().country();
		
		Thread.sleep(1000);
		driver.findElement(By.name("pincode")).sendKeys(fakerPin);

		Thread.sleep(1000);
		driver.findElement(By.name("address")).sendKeys(fakerAddress);
		
		Thread.sleep(1000);
		driver.findElement(By.name("SAVE")).click();
		
	}
}
