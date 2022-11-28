package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyListeners implements ITestListener {
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This Test finished and was Passed!" + result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed!" + result.getName());
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped!" + result.getName());
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Inside Test Start! ");
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSpark.html");
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(spark);
		extent.createTest(result.getName()).pass("Test Started");//log(Status.INFO, "Test Statred");
		
		System.out.println("Test Started1! " + result.getName() );
	}
	
	public void onStart(ITestContext context)//test tag as context here, before any test in <test> tag
	{
		System.out.println("Test Started! " + context.getName());
	}
	
	public void onFinish(ITestContext context)//test tag as context here, when all tests in <test> done
	{
		System.out.println("Test Finished!");
	}

}
