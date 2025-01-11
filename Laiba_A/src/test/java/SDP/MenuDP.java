package SDP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.cucumber.messages.types.Duration;

public class MenuDP extends LoginDP {

	@Test(priority=1,dataProvider = "logindata",dataProviderClass=DPExcel.class, testName="DPMenu")
	public void DPMenu(String UserName,String Password) throws AWTException {
		
	driver.get("https://cignareports.firstsource.com/CignaSympraxisReports/cignareport/Login.aspx");
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Robot robot = new Robot();
	for (int i = 0; i < 3; i++) {
	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_SUBTRACT);
	  robot.keyRelease(KeyEvent.VK_SUBTRACT);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	 }
	driver.findElement(By.id("UserName")).sendKeys(UserName);
	driver.findElement(By.id("Password")).sendKeys(Password,Keys.ENTER);
	}
	
//	@Ignore
	@Test(priority=2,testName="DPInvoice")
	public void DPInvoice() throws InterruptedException {
	driver.findElement(By.xpath("//a[normalize-space(text())='Invoice Report']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Invoice Summary']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='txtInputDate1' and @title='From']//span[contains(@class,'open-datetimepicker')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//table//div[text()=6]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@for='txt1' and @title='To']//span[contains(@class,'open-datetimepicker')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//table//div[text()=7])[position( )=2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(18000);
	driver.findElement(By.xpath("//span[contains(@class,'glyphicon-remove')]")).click();
	Thread.sleep(1000);
	// driver.findElement(By.id("UserIconId")).click();
	// Thread.sleep(1000);
	// driver.findElement(By.xpath("//a[normalize-space(text())='Logout']")).click();
	}

	@Test(priority=3,dependsOnMethods="DPInvoice", testName="FTP")
	public void FTP() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[contains(@class,'dropdown')]//a[text()='FTP']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[text()='FTP Vendor Report'])[position()=1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[contains(@class,'open-datetimepicker')])[position()=1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//table//div[text()=6]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[contains(@class,'open-datetimepicker')])[position()=2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//table//div[text()=7])[position( )=2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(15000);
	driver.findElement(By.xpath("//span[contains(@class,'glyphui-downarrow')]")).click();
	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//a[text()='Excel']")).click();
//	 Thread.sleep(8000);
	driver.findElement(By.xpath("//span[contains(@class,'glyphicon-remove')]")).click();
	Thread.sleep(1000);

	}

	@Test(priority=4,testName="DPClose")
	public void DPClose() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.id("UserIconId")).click();
	Thread.sleep(1000);
	   driver.findElement(By.xpath("//a[normalize-space(text())='Logout']")).click();
	}
}
