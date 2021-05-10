package utilities;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import baseFramework.baseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
public class utilities extends baseClass{

	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}
	
	public void selectByText(By locator,String value) {
	Select selecting1 = new Select(getElement(locator));
	selecting1.selectByVisibleText(value);
	}

}
