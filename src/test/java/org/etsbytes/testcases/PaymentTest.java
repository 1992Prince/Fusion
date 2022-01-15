package org.etsbytes.testcases;

import org.etsbytes.annotations.FrameworkAnnotation;
import org.etsbytes.driver.DriverManager;
import org.etsbytes.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {

	@FrameworkAnnotation(author="Wasim")
	@Test(description = "To verify the payment mode is working or not",
			dataProvider = "getData")
	public void paymentTest(String usern,String pass){
		HomePage homep = new HomePage();
		homep.accountClick();
		homep.login(usern, pass);
		System.out.println("Payment Test Title is :"+DriverManager.getDriver().getTitle());
	//	Assert.assertEquals(DriverManager.getDriver().getTitle(), "Account – AskOmDch");
		Assert.assertEquals(DriverManager.getDriver().getTitle(), "UnknowTitle");
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{"admin","admin123"}
		};
		
	}

}
