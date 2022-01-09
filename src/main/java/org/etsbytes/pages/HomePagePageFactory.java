package org.etsbytes.pages;

import org.etsbytes.driver.DriverManager;
import org.etsbytes.enums.WaitStrategy;
import org.etsbytes.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePageFactory {
	
	public HomePagePageFactory() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(id="menu-item-1237")
	private WebElement account;
	
	@FindBy(id="menu-item-1232")
	private WebElement about;
	
	@FindBy(id="menu-item-1228")
	private WebElement men;
	
	LoginPage loginp;
	
	/*
	 * public LoginPage accountClick() {
	 * SeleniumUtils.click(account,WaitStrategy.CLICKABLE); return new LoginPage();
	 * }
	 * 
	 * public void login(String usrn,String pass) { accountClick().loginToApp(usrn,
	 * pass); }
	 */

}
