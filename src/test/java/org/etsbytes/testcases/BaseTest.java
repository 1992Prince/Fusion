package org.etsbytes.testcases;

import java.lang.reflect.Method;

import org.etsbytes.driver.Driver;
import org.etsbytes.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void beforeSuite() {
		ExtentReport.initReports();
	}

	@AfterSuite
	public void afterSuite() {
		ExtentReport.flushReports();
	}

	@BeforeMethod
	public void setUp(Method method) {
		ExtentReport.createTest(method.getName());
		Driver.initDriver();
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
