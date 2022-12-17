package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestReporter {
	
	public static ExtentTest getExtentTest() {
		
	
		ExtentReports extent =ExtentReporter.getInstance();
		ExtentTest extTest = extent.createTest("Test-Name");
		
		
		return extTest;
	
	}
	
	//One flow is TestNG event based flow with onTestStart() method
	//Other flow is user based flow
	//We need to add things , everything here, create and add Test etc.
	
	

}
