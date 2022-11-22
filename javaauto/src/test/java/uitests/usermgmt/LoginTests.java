package uitests.usermgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.driver.DriverInit;
import constants.Credentials;
import pageobjects.usermgmt.HomePage;
@Listeners(testng.MyListeners.class)
public class LoginTests {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		//DriverInit obj =new DriverInit("chrome");
		driver = DriverInit.lauchLocalDriver("chrome");
				
		driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test
	public void TestOne() throws InterruptedException{
		
		
		
		HomePage objHomePage = new HomePage(driver);
		objHomePage.enterUserName(Credentials.USERNAME);
		objHomePage.enterPwd(Credentials.PASSWORD);
		objHomePage.clickLogin();
		
//		driver.findElement(By.name("username")).sendKeys("rjsapient");
//		driver.findElement(By.name("password")).sendKeys("parabank@2022");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);
		}
	
	@AfterMethod
	public void tearDOwn()
	{
		driver.quit();
	}
	
	

}
