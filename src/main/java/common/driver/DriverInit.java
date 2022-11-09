package common.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
	
	//private String browser;
	
	
	public DriverInit()
	{
		//this.browser=browser;
	}
	
	public static WebDriver lauchLocalDriver(String browser){
		WebDriver driver =null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahjaisw\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		
		return driver;
		
	}

}
