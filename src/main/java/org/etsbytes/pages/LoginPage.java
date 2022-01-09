package org.etsbytes.pages;

import org.etsbytes.enums.WaitStrategy;
import org.etsbytes.reports.ExtentLogger;
import org.etsbytes.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class LoginPage {
	
	private static final By username = By.id("username");
	
	private static final By password = By.id("password");
	
	private static final By login = By.name("login");
	
	public LoginPage setUserName(String usrname) {
		SeleniumUtils.sendKeys(username, usrname,WaitStrategy.VISIBLE);
		ExtentLogger.pass("username enetered successfully");
		return this;
	}
	
	public LoginPage setPassword(String pass) {
		SeleniumUtils.sendKeys(password, pass,WaitStrategy.VISIBLE);
		ExtentLogger.pass("password enetered successfully");
		return this;
	}
	
	public LoginPage clickLoginBtn() {
		SeleniumUtils.click(login,WaitStrategy.CLICKABLE);
		ExtentLogger.info("Loign Button is clicked");
		return this;
	}
	
	public LoginPage loginToApp(String usrname,String pass) {
		return setUserName(usrname).setPassword(pass).clickLoginBtn(); //method chaining
	}
	

}
