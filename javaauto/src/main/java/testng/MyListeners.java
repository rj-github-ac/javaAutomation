package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This Test finished and was Passed!" + result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed!");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped!");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started! " + result.getName() );
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("Test Started! " + context.getName());
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Finished!");
	}

}
