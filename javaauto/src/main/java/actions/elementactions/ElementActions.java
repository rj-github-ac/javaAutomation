package actions.elementactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementActions {
	
	public static void clickEle(WebElement ele)
	{
		ele.click();
	}
	
	public static void enterText(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}

}
