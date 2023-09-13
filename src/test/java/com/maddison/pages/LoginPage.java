package com.maddison.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import com.maddison.utils.logs.Log;

public class LoginPage extends BasePage {

	/**
	 * Web Elements
	 */
	By Email = By.id("email");
	By Password = By.id("pass");
	By Login = By.id("send2");
	By Already = By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div[1]/h2");

	/**
	 * Constructor(s)
	 */
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
	}

	/**
	 * Page Methods
	 */

	public String getTitle() {
		return driver.getTitle();
	}

	public void login() {
		String password = "vz6l4j5iy";
		String email = "byron.quigley@yahoo.com";
		isDisplayed(Already);
		Log.info("Login on Maddison Store with Email :" + email + " Password :" + password);
		type(Email, email);
		type(Password, password);
		submit(Login);
		Log.info("Entering your profile");
	}
	
	public void InvalidLogin() {
		String password = "vz6l4j5iyxsss";
		String email = "byron.quigley@yahoo.com";
		isDisplayed(Already);
		Log.info("Login on Maddison Store with Email :" + email + " Password :" + password);
		type(Email, email);
		type(Password, password);
		submit(Login);
		Log.info("Entering your profile");
	}

}
