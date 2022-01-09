package org.etsbytes.testcases;

import org.etsbytes.driver.DriverManager;
import org.etsbytes.pages.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {

	@Test(description = "To verify the payment mode is working or not",
			dataProvider = "getData")
	public void paymentTest(String usern,String pass){
		HomePage homep = new HomePage();
		homep.accountClick();
		homep.login(usern, pass);
		System.out.println("Payment Test Title is :"+DriverManager.getDriver().getTitle());
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{"admin","admin123"}
		};
		
	}

}
