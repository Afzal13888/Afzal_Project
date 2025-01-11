package SJ;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crm {

	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();	
	    driver = new ChromeDriver();
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
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Leads']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[normalize-space(text())='Create New']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("full_name")).sendKeys("Rose Doc");
	    Thread.sleep(1000);
	    driver.findElement(By.id("s2id_lead_source")).click();
	    Thread.sleep(1000);				
//	    driver.findElement(By.id("s2id_autogen1_search")).click();
//	    Thread.sleep(1000);		
//	    Select value= new Select(driver.findElement(By.id("lead_source")));
//		value.selectByIndex(0);
//		Thread.sleep(1000);
	    
	    List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'select2-result-label')]/span"));
		
	    for (WebElement option : options) {
	    	String OptionText = option.getText();
          if(OptionText.equals("Call")) {
        	  option.click();
        	  break;
          }
       }
        
	    Thread.sleep(1000);
	    driver.quit();
		
	}

}
