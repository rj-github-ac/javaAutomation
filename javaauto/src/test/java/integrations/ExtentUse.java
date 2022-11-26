package integrations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entry");
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSpark.html");
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(spark);
		 
		 extent.createTest("TestName").pass("Test Passed");
		 
		 extent.flush();
		 System.out.println("Exit");

	}
	
	
	// Need to integrate with the TestNG flow
	//BeforeSuite needs to be extended for extent
	//After suite need to configured for extent
	//MyListerners need to be extended for this implementation

}
