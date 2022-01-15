package org.etsbytes.testcases;

import java.lang.reflect.Method;

import org.etsbytes.driver.Driver;
import org.etsbytes.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	// we don't need @BeforeSuite and @AfterSuite now, only for understanding we kept it here
	// both annotations are not doing anything now
	@BeforeSuite
	public void beforeSuite() {
		//ExtentReport.initReports(); // moved to TestListener
	}

	@AfterSuite
	public void afterSuite() {
		// ExtentReport.flushReports(); // moved to TestListener
	}

	@BeforeMethod
	public void setUp() {                             // Method method parameter
		//ExtentReport.createTest(method.getName()); // moved to on TestStart in TestListener
		Driver.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
