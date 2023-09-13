package com.maddison.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maddison.pages.BasePage;
import com.maddison.utils.logs.Log;

public class HomeFactory extends BasePage {

	/**
	 * Web Elements
	 */
	@FindBy(xpath = "/html/body/div/div[2]/header/div/div[2]/div/a/span[2]")
	WebElement linkAccount;

	@FindBy(linkText = "Register")
	WebElement linkRegister;

	@FindBy(linkText = "Log In")
	WebElement linkSingIn;

	/**
	 * Variables
	 */
	String baseURL = "http://demo-store.seleniumacademy.com";

	/**
	 * Constructor(s)
	 */
	public HomeFactory(WebDriver driver) {
		super(driver);
		Log.info("Opening Maddison Store.");
		visit(baseURL);
	}

	public HomeFactory(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Page Methods
	 */
	public void goToRegister() {
		Log.info("Going to Register menu option");
		click((By) linkAccount);
		click((By) linkRegister);
	}

	public void goToSingIn() {
		Log.info("Going to SingIn menu option");
		click((By) linkAccount);
		click((By) linkSingIn);
	}
}
