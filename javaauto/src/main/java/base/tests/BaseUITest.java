package base.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseUITest {
	
	@BeforeSuite
	public void setup()
	{
		
	}
	
	@AfterSuite
	public void tearDOwn()
	{
		
	}
	
//	ExtentReports extent;
//	
//	@BeforeSuite
//	public void beginReport()
//	{
//		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSpark.html");
//		 extent = new ExtentReports();
//		 extent.attachReporter(spark);
//		 extent.createTest("TestName").pass("Test Passed");
//		
//	}
//	
//	@AfterSuite
//	public void endReport()
//	{
//		extent.flush();
//		System.out.println("Exit");
//		
//	}

}
