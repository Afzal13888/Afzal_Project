package AdecoCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CRM_PO_Quotes extends CRM_Login {

	@Test(priority=1)
	public void Quotes_ScrollPage() throws InterruptedException {
		
		Thread.sleep(1000);
	    WebElement elementToHover = driver.findElement(By.xpath("//span[text()='Sales & Purchase']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(elementToHover).perform();
	    Thread.sleep(1000);
	    Actions actions1 = new Actions(driver);
	    for (int i = 0; i < 4; i++) {
	        actions1.sendKeys(Keys.PAGE_DOWN).perform();
	    }
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Sales & Purchase']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Quotes']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void Quotes_Date() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
		 String Month="January 2025";
			String day="26";
			
			driver.findElement(By.xpath("(//i[contains(@class,'icon-calender')])[position()=2]")).click();
			Thread.sleep(1000);
		
			while(true) {
				
				driver.findElement(By.xpath("//th[contains(@class,'next')]")).click();
				String text = driver.findElement(By.xpath("//th[contains(@class,'datepicker-switch')]")).getText();
				if(text.equals(Month))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//th[contains(@class,'next')]")).click();
				}
			}
			driver.findElement(By.xpath("//td[contains(@class,'day')][text()="+day+"]")).click();
			Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void Quotes_Opp() throws InterruptedException {
		
		driver.findElement(By.id("s2id_oppty_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Rose Berry")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Opp: " +option.getText());
       }
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("s2id_account_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options2) {
	    	String OptionText = option.getText();
	      if(OptionText.equals("Lura Beer")) {
	    	  option.click();
	    	  break;
	    	  
	      }
	      System.out.println("Acct: " +option.getText());
	   }
	}
	
	@Test(priority=4,dependsOnMethods="Quotes_Opp")
	public void Quotes_Sale() throws InterruptedException {
		
	    Thread.sleep(1000);
	    driver.findElement(By.id("s2id_quote_assigned")).click();
	    Thread.sleep(1000);
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
	      if(OptionText.equals("Kabilan")) {
	    	  option.click();
	    	  break;
	    	  
	      }
	      System.out.println("Sale: " +option.getText());
	   }
	    
	    Thread.sleep(1000);	    
	    driver.findElement(By.id("s2id_team_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options2) {
	    	String OptionText = option.getText();
	      if(OptionText.equals("Sales 2")) {
	    	  option.click();
	    	  break;
	    	  
	      }
	      System.out.println("Team: " +option.getText());
	   }
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("s2id_quote_status")).click();
	    Thread.sleep(1000);
	    List<WebElement> options3 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options3) {
	    	String OptionText = option.getText();
	      if(OptionText.equals("Draft")) {
	    	  option.click();
	    	  break;
	    	  
	      }
	      System.out.println("Status: " +option.getText());
	   }
	    
	    Thread.sleep(1000);
	    driver.findElement(By.name("quote_value")).sendKeys("1000.00");
	    
	    Thread.sleep(1000);
	    WebElement element = driver.findElement(By.id("quote_currency"));
	    Select currency = new Select(element);
	    currency.selectByIndex(3);
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("s2id_tax_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options4) {
	    	String OptionText = option.getText();
	      if(OptionText.equals("Tax Free")) {
	    	  option.click();
	    	  break;
	    	  
	      }
	      System.out.println("Tax: " +option.getText());
	   }
	}
	
	@Test(priority=5,dependsOnMethods="Quotes_Sale")
	public void Quote_Billing_Country() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        
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
	
	@Test(priority=6,dependsOnMethods="Quote_Billing_Country")
	public void Quote_Billing_State() throws InterruptedException {
		
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
	
	@Test(priority=7,dependsOnMethods="Quote_Billing_State")
	public void Quote_Billing_City() throws InterruptedException {
		
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
	
	@Test(priority=8,dependsOnMethods="Quote_Billing_City")
	public void Quote_Billing_Pin() throws InterruptedException {
		Faker faker = new Faker();
		String fakerPin=faker.address().zipCode();
		String fakerAddress=faker.address().country();
		
		Thread.sleep(1000);
		driver.findElement(By.id("bill_pincode")).sendKeys(fakerPin);

		Thread.sleep(1000);
		driver.findElement(By.id("bill_address")).sendKeys(fakerAddress);
		
//		Thread.sleep(1000);
//		driver.findElement(By.id("s2id_bill_contact")).sendKeys(fakerAddress);
//		
//		Thread.sleep(1000);
//		driver.findElement(By.id("s2id_quote_pricebook")).sendKeys(fakerAddress);
		
		Thread.sleep(1000);
		driver.findElement(By.id("same_address")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("quote_desc")).sendKeys(fakerDes);
		
	}
	
	@Test(priority=9)
	public void Quote_Item() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		driver.findElement(By.id("item_name")).sendKeys(fakerDes);

		Thread.sleep(1000);
		driver.findElement(By.id("item_brand")).sendKeys(fakerBrand);
		
		Thread.sleep(1000);
		driver.findElement(By.id("item_model")).sendKeys(fakerBrand+fakerTrn+fakerBrand);
		
		Thread.sleep(1000);
		driver.findElement(By.id("item_qty")).sendKeys(fakerWeight);
		
		Thread.sleep(1000);
		driver.findElement(By.id("item_uprice")).sendKeys("1000.00");
		
		Thread.sleep(1000);
		driver.findElement(By.id("addItem")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("SAVE")).click();
		
	}
				
}
