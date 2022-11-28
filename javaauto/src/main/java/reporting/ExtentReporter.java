package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	
	private static ExtentReports extent= null;
	
	private ExtentReporter()
	{
		
	}
	
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
