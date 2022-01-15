package org.etsbytes.listeners;

import java.util.Arrays;

import org.etsbytes.annotations.FrameworkAnnotation;
import org.etsbytes.reports.ExtentLogger;
import org.etsbytes.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getName()); // will create the Test in Extent Report with TestName
		// or we can use below line instead of above
		//ExtentReport.createTest(result.getMethod().getDescription()); // will create the Test in Extent Report with TestDes
		ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod()
				.getAnnotation(FrameworkAnnotation.class).author());
	}

	public void onStart(ITestContext context) {
		ExtentReport.initReports();
	}

	public void onFinish(ITestContext context) {
		ExtentReport.flushReports();
	}

	public void onTestSuccess(ITestResult result) {
	    ExtentLogger.pass(result.getName() + " is passed");
	}

	public void onTestFailure(ITestResult result) {
		ExtentLogger.fail(result.getName() + " is failed");
		ExtentLogger.fail(result.getThrowable().getMessage());
		ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
	}

}
