package com.maddison.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maddison.utils.logs.Log;

public class AccountPage extends BasePage {

	/**
	 * Web Elements
	 */
	By headerTitle = By.xpath("//h1");

	/**
	 * Constructor(s)
	 */
	public AccountPage(WebDriver driver) {
		super(driver);
	}

	public AccountPage(WebDriver driver, int timeoutSec) {
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
		return find(headerTitle).getText();
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
