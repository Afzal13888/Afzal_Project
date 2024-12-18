package AdecoCRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRM_Login {

	public static WebDriver driver;
	public static String SnippetSubFolderName;
	
	@BeforeTest
	public void log() throws InterruptedException, AWTException {
					
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter browser? GC/ED/FF");
		    String browser=sc.next();
		    
		    if(browser.equalsIgnoreCase("GC"))
		    {
		    	WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
		    }
		    
		    else if(browser.equalsIgnoreCase("ED"))
		    {
		    	WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		    }
		    
		  /*  else if(browser.equalsIgnoreCase("IE"))
		    {
		    	WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
		    } */

		    else
		    {
		       WebDriverManager.firefoxdriver().setup();	
		      driver=new FirefoxDriver();
		    }
		    
		   
		    driver.get("https://c-infosoft.in/adeco/index.php");
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
		    //driver.close();

		}
		
		@AfterTest
		public void teardown() {
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			driver.quit();		
		}
				
	}



