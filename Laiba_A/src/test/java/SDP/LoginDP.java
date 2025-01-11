package SDP;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDP {

	public static WebDriver driver;
	public static String SnippetSubFolderName;
	

	@BeforeTest
	public void dplogin() throws AWTException {
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
	   
	   //driver.get("https://www.google.co.in");
	 
	}

	@AfterTest
	public void teardown() {
	driver.quit();
	}

	public void captureScreenshot(String filename) {

	if (SnippetSubFolderName==null) {
	LocalDateTime myDateObj = LocalDateTime.now();
	   DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMddyyyyHHmmss");
	   SnippetSubFolderName = myDateObj.format(myFormatObj);

	}

	TakesScreenshot ts=(TakesScreenshot) driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File("D:\\Ticket\\"+SnippetSubFolderName+"\\"+filename);
	try {
	FileUtils.copyFile(sourceFile, destFile);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	System.out.println("Screenshot saved successfully");

	}

}
