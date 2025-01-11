package AdecoCRM;

import java.awt.AWTException;
import java.awt.Desktop;
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
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class CRM_Login {

	public static WebDriver driver;
//	public static ExtentReports extentReports;
//	public static ExtentTest extentTest;
	
	Faker faker = new Faker();
    String FakerName=faker.name().fullName();
    String FakerDesg=faker.job().position();
    String fakerDes =faker.aquaTeenHungerForce().character().toUpperCase();
    String fakerTrn =faker.number().digits(10);
    String fakerState =faker.address().state().toUpperCase();
	String fakerPhone=faker.phoneNumber().cellPhone();
	String fakerBrand=faker.book().genre().toUpperCase();
	String fakerWeight =faker.number().digits(2);
	
	@BeforeTest
	public void log(ITestContext context ) throws InterruptedException, AWTException {
			
//			Scanner sc=new Scanner(System.in);
//		    System.out.println("Enter browser? GC/ED/FF");
//		    String browser=sc.next();
//		    
//		    if(browser.equalsIgnoreCase("GC"))
//		    {
		    	WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
//		    }
//		    
//		    else if(browser.equalsIgnoreCase("ED"))
//		    {
//		    	WebDriverManager.edgedriver().setup();
//				driver = new EdgeDriver();
//		    }
//		    
//		  /*  else if(browser.equalsIgnoreCase("IE"))
//		    {
//		    	WebDriverManager.iedriver().setup();
//				driver = new InternetExplorerDriver();
//		    } */
//
//		    else
//		    {
//		       WebDriverManager.firefoxdriver().setup();	
//		      driver=new FirefoxDriver();
//		    }
//		    
		   
		    driver.get("https://www.indielabs.in/adeco/index.php");
//		    driver.get("https://c-infosoft.in/adeco/index.php");
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
//				extentTest = extentReports.createTest(context.getName());
		}
		
		@AfterTest
		public void teardown() {
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			driver.quit();		
		}
		
//		@BeforeSuite
//		public void InitialiseExtentReport() throws Exception {
//			ExtentSparkReporter SparkReporter_all = new ExtentSparkReporter("AllTests.html");
//			extentReports = new ExtentReports();
//			extentReports.attachReporter(SparkReporter_all);
//			Desktop.getDesktop().browse(new File ("AllTests.html").toURI());
//			
//			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
//			extentReports.setSystemInfo("Java Version", System.getProperty("Java"));
//		}
//		
//		@AfterSuite
//		public void GenerateExtentReport() {
//			extentReports.flush();
//		}
	}



