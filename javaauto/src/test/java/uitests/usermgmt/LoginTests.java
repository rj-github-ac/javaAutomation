package uitests.usermgmt;

import org.openqa.selenium.By;
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
		
		driver.findElement(By.name("username")).sendKeys("rjsapient");
		driver.findElement(By.name("password")).sendKeys("parabank@2022");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
