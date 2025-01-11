package AdecoCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import freemarker.core.ParseException;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test(priority=1)
public class CRMLogin {
	
	public static WebDriver driver;
    
	public void log() throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();	
	    driver = new ChromeDriver();
	    driver.get("https://c-infosoft.in/adeco/index.php");
//	    driver.get("https://www.indielabs.in/adeco/index.php");
	    driver.manage().window().maximize();
	    
	    Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_SUBTRACT);
		  robot.keyRelease(KeyEvent.VK_SUBTRACT);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		 }
	    driver.findElement(By.id("username")).sendKeys("admin@adeco.com");
	    driver.findElement(By.id("password")).sendKeys("admin123");
	    driver.findElement(By.name("LOGIN")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Contacts']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	    
	    for (int i = 0; i < 2; i++) {
	    	
	    Faker faker = new Faker();
		String FakerName=faker.name().fullName();
		String fakerPhone=faker.phoneNumber().cellPhone();

	    driver.findElement(By.id("contact_email")).sendKeys(FakerName+"@Yahoo.com");
	    driver.findElement(By.id("contact_mobile")).sendKeys(fakerPhone);
	    driver.findElement(By.id("addContact")).click();
	    
	    try {
            Thread.sleep(2000); // Adjust the delay as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//	    WebElement elementToHover = driver.findElement(By.xpath("//span[text()='Sales & Purchase']"));
//	    Actions actions = new Actions(driver);
//	    actions.moveToElement(elementToHover).perform();
//	    Thread.sleep(1000);
//	    Actions actions1 = new Actions(driver);
//	    for (int i = 0; i < 3; i++) {
//	        actions1.sendKeys(Keys.PAGE_DOWN).perform();
//	    }
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//span[text()='Sales & Purchase']")).click();
//	    Thread.sleep(1000);
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//a[text()='Quotes']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
//	    Thread.sleep(1000);
//
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
	    
//	    String Month="May 2024";
//		String day="26";
//		
//		driver.findElement(By.xpath("//i[contains(@class,'icon-calender')]")).click();
//		Thread.sleep(1000);
//	
//		while(true) {
//			
//			driver.findElement(By.xpath("//th[contains(@class,'prev')]")).click();
//			String text = driver.findElement(By.xpath("//th[contains(@class,'datepicker-switch')]")).getText();
//			if(text.equals(Month))
//			{
//				break;
//			}
//			else
//			{
//				driver.findElement(By.xpath("//th[contains(@class,'prev')]")).click();
//			}
//		}
//		driver.findElement(By.xpath("//td[contains(@class,'day')][text()="+day+"]")).click();
		Thread.sleep(1000);
		
	    driver.quit();
	    
//	    driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
//	    Thread.sleep(1000);
//	    
//	   Faker faker = new Faker();
//	    String FakerName=faker.name().fullName();
//	    String FakerDesg=faker.job().position();
//	    String fakerDes =faker.aquaTeenHungerForce().character();
//	    String fakerTrn =faker.number().digits(10);
//	    String fakerState =faker.address().state().toUpperCase();
//		String fakerPhone=faker.phoneNumber().cellPhone();
//	    
//	    driver.findElement(By.name("full_name")).sendKeys(FakerName);
//	    Thread.sleep(1000);
	    
	    
//	    driver.findElement(By.id("contact_dob")).sendKeys("019-11-1994");
	    
//	    driver.findElement(By.name("contact_desig")).sendKeys(FakerDesg);	   
//	    Thread.sleep(1000);
//	    
	    
//	    driver.findElement(By.id("s2id_oppty_stage")).click();
//	    Thread.sleep(1000);
//	    
//	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Proposal")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Oppty: " +option.getText());
//       }
//	    Thread.sleep(1000);
//	    driver.findElement(By.name("oppty_probability")).sendKeys("100"); 
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.id("s2id_oppty_source")).click();
//	    Thread.sleep(1000);
//	    
//	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options1) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Email")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Oppty: " +option.getText());
//       }
//	    Thread.sleep(1000);
//	    driver.findElement(By.name("oppty_trn")).sendKeys(fakerTrn+fakerState+fakerTrn);
//	    Thread.sleep(1000);
//	    driver.findElement(By.name("oppty_desc")).sendKeys(fakerDes);
//	    
	    
//	    Thread.sleep(1000);
//	    driver.findElement(By.name("account_website")).sendKeys("www.google.com"); 
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.id("s2id_account_industry")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options1) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Aerospace")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Industry: " +option.getText());
//       }
//	    
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("s2id_account_assigned")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options2) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Kabilan")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Acount: " +option.getText());
//       }
//	    
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("s2id_team_id")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options3 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options3) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Sales 2")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Team: " +option.getText());
//       }
//	    
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("contact_email")).sendKeys(FakerName+"@Yahoo.com");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("contact_mobile")).sendKeys(fakerPhone);
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("addContact")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//a[text()='Address']")).click();
//	    
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("s2id_bill_country_id")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options4) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("India")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Team: " +option.getText());
//       }

	    
//	    s2id_bill_country_id
	    
//	    WebElement CourseNameElement = driver.findElement(By.id("s2id_account_type"));
//		Select courseName_dd = new Select(CourseNameElement);
//		courseName_dd.selectByIndex(0);
//		Thread.sleep(1000);
//		
//		List<WebElement> options1 = courseName_dd.getAllSelectedOptions();
//        for (WebElement option : options1) {
//            System.out.println("Lead Status: " +option.getText());
//        }
//        Thread.sleep(1000);
//        
//        WebElement CourseNameElement1 = driver.findElement(By.id("lead_currency"));
//		Select courseName_dd1 = new Select(CourseNameElement1);
//		courseName_dd1.selectByIndex(1);
//		Thread.sleep(1000);
//		
//		List<WebElement> options2 = courseName_dd.getAllSelectedOptions();
//        for (WebElement option : options2) {
//            System.out.println("Lead Currency: " +option.getText());
//        }
//        Thread.sleep(1000);
        
        
	}
	
			

//	@Test(priority=2)
//		
//		public void source() throws InterruptedException  {
//		
//		driver.findElement(By.id("s2id_account_id")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options1) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Lura Beer")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Account: " +option.getText());
//       }
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.id("s2id_contact_id")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options2) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Rose Berry")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Contact: " +option.getText());
//       }
//	    Thread.sleep(1000);
//	    
//	    driver.findElement(By.name("oppty_value")).sendKeys("1000.00");
//	    Thread.sleep(1000);
//	    
//	    WebElement CourseNameElement = driver.findElement(By.id("oppty_currency"));
//		Select courseName_dd = new Select(CourseNameElement);
//		courseName_dd.selectByIndex(1);
//		Thread.sleep(1000);
//		
//		List<WebElement> options = courseName_dd.getAllSelectedOptions();
//        for (WebElement option : options) {
//            System.out.println("Lead Status: " +option.getText());
//        }
//        
//        Thread.sleep(1000);
//        
//		String Month="January 2025";
//		String day="19";
//		
//		driver.findElement(By.xpath("//i[contains(@class,'icon-calender')]")).click();
//		Thread.sleep(1000);
//	
//		while(true) {
//			driver.findElement(By.xpath("//th[contains(@class,'next')]")).click();
//			
//			String text = driver.findElement(By.xpath("//th[contains(@class,'datepicker-switch')]")).getText();
//			if(text.equals(Month))
//			{
//				break;
//			}
//			else
//			{
//				driver.findElement(By.xpath("//th[contains(@class,'next')]")).click();
//			}
//		}
//		
//		driver.findElement(By.xpath("//td[contains(@class,'day')][text()="+day+"]")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.id("s2id_oppty_assigned")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options4) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Kabilan")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Contact: " +option.getText());
//       }
//	    Thread.sleep(1000);
//	    
//
//		driver.findElement(By.id("s2id_team_id")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options5 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options5) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Sales 2")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("Contact: " +option.getText());
//       }
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("item_name")).sendKeys("MacBookPro");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("item_qty")).sendKeys("2");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("item_lprice")).sendKeys("125000.00");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("item_uprice")).sendKeys("150000.00");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("addItem")).click();
//		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.name("SAVE")).click();
//	    Thread.sleep(1000);								
//	    driver.findElement(By.id("s2id_autogen1_search")).click();
//	    Thread.sleep(1000);
//	    Select value= new Select(driver.findElement(By.id("lead_source")));
//	    WebElement CourseNameElement = driver.findElement(By.id("lead_source"));
//		Select value = new Select(CourseNameElement);
//		value.selectByIndex(0);
//		Thread.sleep(1000);	
//	    
//	    List<WebElement> options = value.getAllSelectedOptions();
//	    for (WebElement option : options) {
//          System.out.println("Lead Source: " +option.getText());
//          }
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
//        
//        driver.findElement(By.xpath("//a[text()='Address']")).click();
//		Thread.sleep(1000);
//	    
//	    driver.findElement(By.id("s2id_city_id")).click();
//	    Thread.sleep(1000);
//	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
//		
//	    for (WebElement option : options) {
//	    	String OptionText = option.getText();
//          if(OptionText.equals("Chennai")) {
//        	  option.click();
//        	  break;
//        	  
//          }
//          System.out.println("City: " +option.getText());
//       }
//	     
//	   	    
	    
//	    Thread.sleep(1000);
//	    driver.findElement(By.name("lead_value")).sendKeys("1000.00");
		
//	    Select value= new Select(driver.findElement(By.id("lead_source")));
//        value.selectByIndex(0);
//        Thread.sleep(1000);				
//        driver.findElement(By.name("lead_value")).sendKeys("1000.00");
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("s2id_lead_assigned")).click();
//	    Thread.sleep(1000);				
//	    driver.findElement(By.id("s2id_autogen3_search")).click();
//	    Thread.sleep(1000);				
//	    Select value1= new Select(driver.findElement(By.id("lead_assigned")));
//        value1.selectByIndex(0);        
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("s2id_team_id")).click();
//	    Thread.sleep(1000);				
//	    driver.findElement(By.id("s2id_autogen4_search")).click();
//	    Thread.sleep(1000);				
//	    Select value2= new Select(driver.findElement(By.id("team_id")));
//        value2.selectByIndex(0);  
//	    List<WebElement> options = value2.getOptions();
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//	}
	    
//	    driver.findElement(By.id("s2id_lead_industry")).click();
//	    Thread.sleep(1000);				
//	    driver.findElement(By.id("s2id_autogen2_search")).click();
//	    Thread.sleep(1000);				
//	    Select value3= new Select(driver.findElement(By.id("lead_industry")));
//        value3.selectByIndex(0);  
//	    driver.findElement(By.id("s2id_country_id")).click();
//	    Thread.sleep(1000);				
//	    driver.findElement(By.id("s2id_autogen5_search")).click();
//	    Thread.sleep(1000);				
//	    Select value3= new Select(driver.findElement(By.id("country_id")));
//        value3.selectByIndex(0);  
//	    Thread.sleep(1000);
//	    driver.quit();
	    
	
//	}
}
