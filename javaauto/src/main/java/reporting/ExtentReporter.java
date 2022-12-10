package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	private static ExtentReports extent= null;//private static instance to comply the singleton design 
	
	private ExtentReporter()
	{
		//private constructor to comply the singleton design
	}
	
	//public static method to return the class instance
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("ExtentSpark.html");
			extent.attachReporter(spark);
			return extent;
		}
		else
			return extent;
		
	}
	

}
