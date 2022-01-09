package org.etsbytes.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {
	
	private ExtentManager() {}

	private static ThreadLocal<ExtentTest> threadlocal = new ThreadLocal<ExtentTest>();

	static ExtentTest getExtentTest() {
		return  threadlocal.get();
	}

	static void setExtentTest(ExtentTest test) {
		threadlocal.set(test);
	}

}
