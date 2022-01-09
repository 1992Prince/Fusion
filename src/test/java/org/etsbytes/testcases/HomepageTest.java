package org.etsbytes.testcases;

import org.etsbytes.driver.DriverManager;
import org.etsbytes.pages.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {

	@Test(description = "To check whether the user can login to askOmDch website", dataProvider = "getData")
	public void loginTest(String usern, String pass) {

		HomePage homep = new HomePage();
		homep.login(usern, pass);
		

		System.out.println("HomePage Test Title is :" + DriverManager.getDriver().getTitle());

	}

	@DataProvider
	public Object[][] getData() {
		return new Object[][] { { "admin", "admin123" } };

	}

}
