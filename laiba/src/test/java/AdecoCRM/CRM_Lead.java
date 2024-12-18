package AdecoCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

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
		Thread.sleep(1000);
		driver.findElement(By.name("full_name")).sendKeys("Rose Doglass");
		Thread.sleep(1000);
		driver.findElement(By.name("lead_title")).sendKeys("Test1");
		Thread.sleep(1000);
		WebElement CourseNameElement = driver.findElement(By.id("lead_status"));
		Select courseName_dd = new Select(CourseNameElement);
		courseName_dd.selectByIndex(2);
		Thread.sleep(1000);
		
	}
	
	@Test(priority=4)
	public void Source() throws InterruptedException {
		
		driver.findElement(By.id("s2id_lead_source"));
		Thread.sleep(1000);
//		WebElement IdeNameElement = driver.findElement(By.cssSelector("#s2id_lead_source"));
//		Select IdeName_dd = new Select(IdeNameElement);
//		IdeName_dd.selectByIndex(2);
//		Thread.sleep(2000);				
	}
}
