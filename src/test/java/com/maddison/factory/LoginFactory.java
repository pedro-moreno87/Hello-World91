package com.maddison.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maddison.pages.BasePage;
import com.maddison.utils.logs.Log;

public class LoginFactory extends BasePage {

	/**
	 * Web Elements
	 */
	@FindBy (id = "email")
	WebElement Email;

	@FindBy (id = "pass")
	WebElement Password;

	@FindBy (id = "send2")
	WebElement Login;

	@FindBy (xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/form/div/div[2]/div[1]/h2")
	WebElement Already;

	/**
	 * Constructor(s)
	 */
	public LoginFactory(WebDriver driver) {
		super(driver);
	}

	public LoginFactory(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
		PageFactory.initElements(driver, this);
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
		isDisplayed((By) Already);
		Log.info("Login on Maddison Store with Email :" + email + " Password :" + password);
		type((By) Email, email);
		type((By) Password, password);
		submit((By) Login);
		Log.info("Entering your profile");
	}

}
