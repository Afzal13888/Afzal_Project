package AdecoCRM;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CRM_PO_Product extends CRM_Login {

	@Test(priority=1)
	public void Product_ScrollPage() throws InterruptedException {
		
		Thread.sleep(1000);
	    WebElement elementToHover = driver.findElement(By.xpath("//span[text()='Sales & Purchase']"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(elementToHover).perform();
	    Thread.sleep(1000);
	    Actions actions1 = new Actions(driver);
	    for (int i = 0; i < 3; i++) {
	        actions1.sendKeys(Keys.PAGE_DOWN).perform();
	    }
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Sales & Purchase']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Products']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	}
	
	@Test(priority=2)
	public void Product_Name() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.name("prd_name")).sendKeys(FakerName);
	    Thread.sleep(1000);
		WebElement CourseNameElement = driver.findElement(By.id("category_id"));
		Select courseName_dd = new Select(CourseNameElement);
		courseName_dd.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.name("brand_name")).sendKeys(fakerBrand);
	    Thread.sleep(1000);
	    WebElement CourseNameElement1 = driver.findElement(By.id("prd_type"));
		Select courseName_dd1 = new Select(CourseNameElement1);
		courseName_dd1.selectByIndex(1);
		Thread.sleep(1000);
		WebElement CourseNameElement2 = driver.findElement(By.id("prd_status"));
		Select courseName_dd2 = new Select(CourseNameElement2);
		courseName_dd2.selectByIndex(1);
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void Product_Part() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.name("prd_partno")).sendKeys(fakerPhone);
	    Thread.sleep(1000);
	    driver.findElement(By.name("prd_weight")).sendKeys(fakerWeight);
	    Thread.sleep(1000);
	    driver.findElement(By.name("prd_url")).sendKeys("www.google.com");
	    Thread.sleep(1000);
	    driver.findElement(By.name("prd_description")).sendKeys(fakerDes);
	    Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void Product_Price() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.name("prd_cost_price")).sendKeys("100.00");
	    Thread.sleep(1000);
	    WebElement CourseNameElement = driver.findElement(By.id("prd_currency"));
		Select courseName_dd = new Select(CourseNameElement);
		courseName_dd.selectByIndex(3);
		Thread.sleep(1000);
		driver.findElement(By.name("prd_list_price")).sendKeys("200.00");
	    Thread.sleep(1000);
	    WebElement CourseNameElement1 = driver.findElement(By.id("prd_currency"));
		Select courseName_dd1 = new Select(CourseNameElement1);
		courseName_dd1.selectByIndex(3);
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, 500)");
	    Thread.sleep(1000);
	    WebElement CourseNameElement2 = driver.findElement(By.id("pricing_type"));
		Select courseName_dd2 = new Select(CourseNameElement2);
		courseName_dd2.selectByIndex(1);
	    Thread.sleep(1000);
	    driver.findElement(By.name("prd_tax_free")).click();
	    Thread.sleep(1000);
	}
	

	@Test(priority=5)
	public void Product_Qty() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.name("prd_allow_fqty")).click();
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
		driver.findElement(By.name("SAVE")).click();
		Thread.sleep(1000);
	}
}
