package com.maddison.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maddison.utils.logs.Log;

public class HomePage extends BasePage {

	/**
     * Web Elements
     */
	By linkAccount = By.xpath("/html/body/div/div[2]/header/div/div[2]/div/a/span[2]");
	By linkRegister = By.linkText("Register");
	By linkSingIn = By.linkText("Log In");


	/**
     * Variables
     */
	String baseURL = "http://demo-store.seleniumacademy.com";

	/**
     * Constructor(s)
     */
	public HomePage(WebDriver driver) {
		super(driver);
		Log.info("Opening Maddison Store.");
		visit(baseURL);
	}

	public HomePage(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
	}

	/**
     * Page Methods
     */
	public void goToRegister() {
		Log.info("Going to Register menu option");
		click(linkAccount);
		click(linkRegister);
	}

	public void goToSingIn() {
		Log.info("Going to SingIn menu option");
		click(linkAccount);
		click(linkSingIn);
	}
}
