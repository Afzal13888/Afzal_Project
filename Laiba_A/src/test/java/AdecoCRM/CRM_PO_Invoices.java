package AdecoCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CRM_PO_Invoices extends CRM_Login {

	@Test(priority=1)
	public void Invoices_ScrollPage() throws InterruptedException {
		
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
	    driver.findElement(By.xpath("//a[text()='Invoices']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void Invoices_SalesNo() throws InterruptedException {
		
		driver.findElement(By.id("s2id_sale_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("SO-00002")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("SaleNo: " +option.getText());
       }
	    
	    Thread.sleep(1000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
	}
	
	@Test(priority=3,dependsOnMethods="Invoices_SalesNo")
	public void Invoices_Teams() throws InterruptedException {
		
		Thread.sleep(1000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.id("s2id_tmpl_id")).click();
	    Thread.sleep(1000);
	    List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]"));
		
	    for (WebElement option : options1) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Invoice 1")) {
        	  option.click();
        	  break;
        	  
          }
          System.out.println("Temp : " +option.getText());
       }
	    
	    Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void Invoices_Save() throws InterruptedException {
		
		driver.findElement(By.name("SAVE")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=5)
	public void Invoices_Logout() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[contains(@class,'ti-power-off')]")).click();
		
	}
	
}
