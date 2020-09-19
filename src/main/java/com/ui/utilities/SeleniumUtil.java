package com.ui.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUtil {
	
	WebDriver driver;
	
	public WebDriver getDriver() {
		if(System.getProperty("browser")== null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/binary/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(System.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/binary/chromedriver.exe");
			driver = new ChromeDriver(); 
		}else if(System.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/resources/binary/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public boolean isElementDisplayed(By byElement) {
		WebElement elmt = driver.findElement(byElement);
		if(elmt != null && elmt.isDisplayed()) {
			return true;
		}
		return false;
	}
}
