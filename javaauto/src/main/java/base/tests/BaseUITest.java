package base.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import common.driver.DriverInit;

public class BaseUITest {
	
	private WebDriver driver;
	
	@BeforeSuite
	public void setupReport()
	{
		
	}
	
	@BeforeMethod
	public void setupTest() throws InterruptedException
	{
		//DriverInit obj =new DriverInit("chrome");
		driver = DriverInit.lauchLocalDriver("chrome");
				
		driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void flushReport()
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
