package com.ui.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.utilities.SeleniumUtil;

public class OrangeHrmUserStory {
	SeleniumUtil util = new SeleniumUtil();
	String url = "https://opensource-demo.orangehrmlive.com/";
	WebDriver driver;
	
	@BeforeClass
	public void preRequisiteConditions() {
		driver = util.getDriver();
		if(driver != null) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else{
			System.err.println("Driver specify kar bhai.. ");
			System.err.println("System is exiting....");
			System.exit(0);
		}
	}
	
	@BeforeMethod
	public void launcUrl() {
		driver.get(url);
	}
	
	@Test
	public void launchUrl() {
		System.out.println("ggkgkk");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
