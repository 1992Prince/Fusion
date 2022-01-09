package org.etsbytes.utils;

import org.etsbytes.config.ConfigFactory;
import org.etsbytes.driver.DriverManager;
import org.etsbytes.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	public static void click(By by,WaitStrategy waitstrategy) {
		WebElement element = waitUntilElementPresent(by,waitstrategy);
		element.click();
	}

	public static void sendKeys(By by,String value,WaitStrategy waitstrategy) {
		WebElement element = waitUntilElementPresent(by,waitstrategy);
		element.sendKeys(value);
	}

	private static WebElement waitUntilElementPresent(By by,WaitStrategy waitstrategy) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
		WebElement element=null;
		if((waitstrategy == WaitStrategy.PRESENSE)) {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitstrategy == WaitStrategy.CLICKABLE) {
			element = wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitstrategy == WaitStrategy.VISIBLE) {
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		
		return element;
	}

}
