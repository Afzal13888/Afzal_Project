package AdecoCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CRM_Opps extends CRM_Login {
	
	@Test(priority=1)
	public void Opps_Name() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    
	    Thread.sleep(1000);
		driver.findElement(By.name("full_name")).sendKeys(FakerName);
	    Thread.sleep(1000);

	    driver.findElement(By.id("s2id_oppty_stage")).click();
	    Thread.sleep(1000);
	    
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Proposal")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Oppty: " +option.getText());
       }
	    Thread.sleep(1000);
	    driver.findElement(By.name("oppty_probability")).sendKeys("100"); 
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("s2id_oppty_source")).click();
	    Thread.sleep(1000);
	    
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Email")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Oppty: " +option.getText());
       }
	    Thread.sleep(1000);
	    driver.findElement(By.name("oppty_trn")).sendKeys(fakerTrn+fakerState+fakerTrn);
	    Thread.sleep(1000);
	    driver.findElement(By.name("oppty_desc")).sendKeys(fakerDes);

		}

	@Test(priority=2)
	public void Opps_Acct() throws InterruptedException{
	    Thread.sleep(1000);
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
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("s2id_contact_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options2 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options2) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Rose Berry")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Contact: " +option.getText());
       }
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("oppty_value")).sendKeys("1000.00");
	    Thread.sleep(1000);
	    
	    WebElement CourseNameElement = driver.findElement(By.id("oppty_currency"));
		Select courseName_dd = new Select(CourseNameElement);
		courseName_dd.selectByIndex(1);
		Thread.sleep(1000);
		
		List<WebElement> options = courseName_dd.getAllSelectedOptions();
        for (WebElement option : options) {
            System.out.println("Lead Status: " +option.getText());
        }
        
        Thread.sleep(1000);
        
		String Month="January 2025";
		String day="19";
		
		driver.findElement(By.xpath("//i[contains(@class,'icon-calender')]")).click();
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
		
		driver.findElement(By.id("s2id_oppty_assigned")).click();
	    Thread.sleep(1000);
	    List<WebElement> options4 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options4) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Kabilan")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Contact: " +option.getText());
       }
	    Thread.sleep(1000);
	    

		driver.findElement(By.id("s2id_team_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options5 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options5) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Sales 2")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Contact: " +option.getText());
       }

	}
	
	@Test(priority=3)
	public void Opps_Item() throws InterruptedException {
	    Thread.sleep(1000);
	    driver.findElement(By.id("item_name")).sendKeys("MacBookPro");
	    Thread.sleep(1000);
	    driver.findElement(By.id("item_qty")).sendKeys("2");
	    Thread.sleep(1000);
	    driver.findElement(By.id("item_lprice")).sendKeys("125000.00");
	    Thread.sleep(1000);
	    driver.findElement(By.id("item_uprice")).sendKeys("150000.00");
	    Thread.sleep(1000);
//	    driver.findElement(By.id("addItem")).click();
//		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.name("SAVE")).click();
	}
}
