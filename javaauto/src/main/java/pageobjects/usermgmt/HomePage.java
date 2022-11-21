package pageobjects.usermgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver = null;
	
	By inpUName= By.name("username");
	By inpPwd= By.name("password");
	By btnSbmt= By.xpath("//input[@value='Log In']");
	
	
	public HomePage(WebDriver driver)
	{
	
		this.driver= driver;
	}
	
	public void enterUserName(String uName)
	{
		driver.findElement(inpUName).sendKeys(uName);
		
	}
	
	public void enterPwd(String pwd)
	{
		driver.findElement(inpPwd).sendKeys(pwd);
		
	}
	
	public void clickLogin()
	{
		driver.findElement(btnSbmt).click();
		
	}
	

}
