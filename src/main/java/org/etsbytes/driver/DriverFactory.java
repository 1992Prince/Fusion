package org.etsbytes.driver;

import java.net.URL;

import org.etsbytes.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;

public class DriverFactory {

	@SneakyThrows
	public static WebDriver getDriver(String runmode, String browserName) {
		WebDriver driver=null;
		if (runmode.equalsIgnoreCase("local")) {

			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				DriverManager.setDriver(driver);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

		} else if (runmode.equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();

			if (browserName.equalsIgnoreCase("chrome")) {
				capabilities.setBrowserName("chrome");
				DriverManager.setDriver(driver);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				capabilities.setBrowserName("edge");
				// write the code
			}

			driver = new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()), capabilities);
		}

		return driver;
	}

}
