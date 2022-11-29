package testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import reporting.ExtentReporter;

public class MyListeners implements ITestListener, ISuiteListener {
	ExtentReports extent =null;
	
	
	public void onStart(ISuite suite)
	{
		extent =ExtentReporter.getInstance();
		System.out.println(suite.getName() + " Suite Started");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		//extent.flush();
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
		
		ExtentTest extTest = extent.createTest(result.getName());
		extTest.log(Status.INFO, "Test-Name-Started");
//		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSpark.html");
//		 ExtentReports extent = new ExtentReports();
//		 extent.attachReporter(spark);
		//extent.createTest(result.getName()).pass("Test Started");//log(Status.INFO, "Test Statred");
		
		//System.out.println("Test Started1! " + result.getName() );
	}
	
	public void onStart(ITestContext context)//test tag as context here, before any test in <test> tag
	{
		System.out.println("Test Started! " + context.getName());
	}
	
	public void onFinish(ITestContext context)//test tag as context here, when all tests in <test> done
	{
		System.out.println("Test Finished!");
	}
	
	public void onFinish(ISuite suite)
	{
		extent.flush();
		System.out.println(suite.getName() + " Suite Finished");
	}

}
