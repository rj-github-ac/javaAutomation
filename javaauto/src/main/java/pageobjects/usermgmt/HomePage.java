package pageobjects.usermgmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.elementactions.ElementActions;

public class HomePage {
	
	private WebDriver driver = null;
	
	By inpUName= By.xpath("//input[@name='username']");
	By inpPwd= By.xpath("//input[@name='password']");
	By btnSbmt= By.xpath("//input[@value='Log In']");
	
	
	public HomePage(WebDriver driver)
	{
	
		this.driver= driver;
	}
	
	public void enterUserName(String uName)
	{
		ElementActions.enterText(driver.findElement(inpUName), uName);
		//driver.findElement(inpUName).sendKeys(uName);
		
	}
	
	public void enterPwd(String pwd)
	{
		ElementActions.enterText(driver.findElement(inpPwd), pwd);
		
	}
	
	public void clickLogin()
	{
		ElementActions.clickEle(driver.findElement(btnSbmt));
		
	}
	

}
