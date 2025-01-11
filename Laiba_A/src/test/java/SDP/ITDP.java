package SDP;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITDP extends LoginDP implements ITestListener  {

	@Override
	public void onTestFailure(ITestResult result) {
	captureScreenshot(result.getMethod().getMethodName()+".jpg");
	}
}
