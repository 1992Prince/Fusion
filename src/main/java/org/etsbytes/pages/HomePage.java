package org.etsbytes.pages;

import org.etsbytes.enums.WaitStrategy;
import org.etsbytes.utils.SeleniumUtils;
import org.openqa.selenium.By;

public class HomePage {

	private static final By account = By.id("menu-item-1237");

	private static final By about = By.id("menu-item-1232");

	private static final By men = By.id("menu-item-1228");
	
	LoginPage loginp;
	
	public HomePage(){
		//loginp = new LoginPage();
	}

	public LoginPage accountClick() {
		SeleniumUtils.click(account,WaitStrategy.CLICKABLE);
		return new LoginPage();
	}
	
	public void login(String usrn,String pass) {
		accountClick().loginToApp(usrn, pass);
	}

}
