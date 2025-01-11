package AdecoCRM;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CRM_ExtentReport extends CRM_Login implements ITestListener {

	public ExtentSparkReporter sparkReporter; 
	public ExtentReports extent; 
	public ExtentTest test;
	String RepName;
	
	public void onStart(ITestContext context) {
		
		
		String TimeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		RepName = "Test-Report-"+TimeStamp+ ".html";
		
		sparkReporter = new ExtentSparkReporter(".\\Report\\" + RepName);
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "Localhost");
		extent.setSystemInfo("Application", "AdecoCRM");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Absal");
		extent.setSystemInfo("Operating System", "Windows10");
		extent.setSystemInfo("Browser Name", "Chrome");
	}
	
	public void onTestSuccess(ITestResult result) {
	
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.PASS, "Test Case PASSED is:" +result.getName());	
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.FAIL, "Test Case FAILED is:" +result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is:" +result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		
		test = extent.createTest(result.getTestClass().getName());
		test.log(Status.SKIP, "Test Case SKIPPED is:" +result.getName());	
	}
	
	public void onFinish(ITestContext context) {
		
		extent.flush();
		
		String pathofExtentReport = System.getProperty("user.dir")+"\\Report\\"+RepName;
		File extent = new File(pathofExtentReport); 
		
		try {
			 Desktop.getDesktop().browse(extent.toURI());
		    }
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
