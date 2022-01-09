package org.etsbytes.reports;

import org.etsbytes.constants.FrameworkConstants;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentReport {
	
	public static ExtentReports extent;
	public static ExtentTest extenttest; // this is not thread safe so need ThreadLocal class for it
	
	private ExtentReport() {}
	
	public static void initReports() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getReportPath());
		extent.attachReporter(spark);
	}
	
	public static void flushReports() {
		extent.flush();
	}
	
	public static void createTest(String testcasename) {
		extenttest = extent.createTest(testcasename);
		ExtentManager.setExtentTest(extenttest);
	}

}
