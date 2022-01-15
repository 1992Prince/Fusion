package org.etsbytes.driver;

import java.util.concurrent.TimeUnit;

import org.etsbytes.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

	public static void initDriver() {
		String browser = ConfigFactory.getConfig().browser();
		String runmode = ConfigFactory.getConfig().runmode();

		if (DriverManager.getDriver() == null) {
			WebDriver driver = DriverFactory.getDriver(runmode,browser);
			DriverManager.setDriver(driver);
			// here DriverManager.getDriver() returns the driver object
			// DriverManager.getDriver().manage().window().maximize();
			DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(),
					TimeUnit.SECONDS);
			DriverManager.getDriver().get(ConfigFactory.getConfig().url());
		}

	}

	public static void quitDriver() {
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
			DriverManager.setDriver(null);
		}
	}

}
