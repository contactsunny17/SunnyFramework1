package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ui.utilities.SeleniumUtil;

public class OrangeHrmLoginPage {
	WebDriver driver;

	public OrangeHrmLoginPage(WebDriver driver){
		this.driver = driver;

	}
	public boolean verifyLoginPage() {
		try {
			WebElement elmt = driver.findElement(By.xpath("//input[@value='LOGIN']"));
			if(elmt != null && elmt.isDisplayed()){
				System.out.println("Log-in Page can be seen");
				return true;
			}else{
				System.err.println("Log-in Page can't be seen");
				return false;
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return true;


	}

	public boolean enterLoginEmail(String strEmail){
		try{
//			WebElement elmt = driver.findElement(By.xpath("//input[@name='txtUsername']"));
			WebElement elmt = driver.findElement(By.cssSelector("input[name='txtUsername']"));
			if(elmt != null && elmt.isDisplayed()){
				elmt.sendKeys(strEmail);
				System.out.println("Input: " + strEmail + " is entered");
				return true;
			}else{
				System.err.println("Input: " + strEmail + " is not entered");
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	public boolean enterLoginPassword() {
		WebElement elmt = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		return true;

	}
}
