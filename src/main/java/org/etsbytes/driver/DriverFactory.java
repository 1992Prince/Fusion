package org.etsbytes.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver getDriver(String browserName) {
      WebDriver driver;
      if(browserName.equalsIgnoreCase("chrome")) {
    	  WebDriverManager.chromedriver().setup();
    	  driver = new ChromeDriver();
    	  DriverManager.setDriver(driver);
      }
      else if(browserName.equalsIgnoreCase("firefox")) {
    	  WebDriverManager.firefoxdriver().setup();
    	  driver = new FirefoxDriver();
      }
      else {
    	  WebDriverManager.edgedriver().setup();
    	  driver = new EdgeDriver();
      }
      
      return driver;
	}

}
