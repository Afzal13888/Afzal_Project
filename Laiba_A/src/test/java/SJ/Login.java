package SJ;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		  WebDriverManager.chromedriver().setup();	
		    driver = new ChromeDriver();
		    driver.get("https://cignareports.firstsource.com/CignaSympraxisReports/cignareport/Login.aspx");
		    driver.manage().window().maximize();
		    Robot robot = new Robot();
			for (int i = 0; i < 3; i++) {
			  robot.keyPress(KeyEvent.VK_CONTROL);
			  robot.keyPress(KeyEvent.VK_SUBTRACT);
			  robot.keyRelease(KeyEvent.VK_SUBTRACT);
			  robot.keyRelease(KeyEvent.VK_CONTROL);
			 }
		    driver.findElement(By.id("UserName")).sendKeys("mac870748");
		    driver.findElement(By.id("Password")).sendKeys("Mohammed@144");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
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
			driver.findElement(By.xpath("//a[text()='Excel']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//span[contains(@class,'glyphicon-remove')]")).click();
			Thread.sleep(1000);

		  driver.quit();
	}

}
