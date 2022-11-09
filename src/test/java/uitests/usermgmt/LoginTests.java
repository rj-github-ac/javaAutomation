package uitests.usermgmt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.driver.DriverInit;

public class LoginTests {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//DriverInit obj =new DriverInit("chrome");
		WebDriver driver = DriverInit.lauchLocalDriver("chrome");
		
		driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
