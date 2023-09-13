package com.maddison.factory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maddison.pages.BasePage;
import com.maddison.utils.logs.Log;

public class AccountFactory extends BasePage {

	/**
	 * Web Elements
	 */
	@FindBy (xpath = "//h1")
	WebElement headerTitle;

	/**
	 * Constructor(s)
	 */
	public AccountFactory(WebDriver driver) {
		super(driver);
	}

	public AccountFactory(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
	}

	/**
	 * Page Methods
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	public String getHeader() {
		return find((By) headerTitle).getText();
	}

	public void verifyLogin() {
		Log.info("Login has been successfully ... Welcome to your account");
		assertEquals(getTitle(), "My Account");
	}

	public void verifyDashboard() {
		Log.info("Login has been successfully ... Welcome to your Dashboard");
		assertEquals(getHeader(), "My Dashboard");
	}
}
