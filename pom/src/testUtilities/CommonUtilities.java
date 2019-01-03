package testUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testbase.BrowserFactory;

public class CommonUtilities extends BrowserFactory {

	public void elementOperations(WebElement element, String operation, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));

		if (operation.equalsIgnoreCase("sendkeys")) {
			ele.sendKeys(value);
		} else if (operation.equalsIgnoreCase("click")) {
			ele.click();
		}
	
	}
	
	
	
}