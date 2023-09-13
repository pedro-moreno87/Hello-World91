package com.maddison.pages;

import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import com.maddison.utils.logs.Log;

public class RegisterPage extends BasePage {

	/**
	 * Web Elements
	 */
	By Firstname = By.id("firstname");
	By Lastname = By.id("lastname");
	By Email = By.id("email_address");
	By Password = By.id("password");
	By Confirmation = By.id("confirmation");
	By register = By.xpath("/html/body/div/div[2]/div[2]/div/div/div[2]/form/div[2]/button/span/span");

	/**
	 * Variables
	 */
	Faker faker = new Faker(new Locale("en-US"));

	/**
	 * Constructor(s)
	 */
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public RegisterPage(WebDriver driver, int timeoutSec) {
		this(driver);
		setTimeoutSec(timeoutSec);
	}

	/**
	 * Page Methods
	 */
	public void createNewAccount() {
		String password = faker.internet().password();
		String email = faker.internet().emailAddress();
		Log.info("Creating new Account on Maddison Store with Email :" + email + " Password :" + password);
		type(Firstname, faker.name().firstName());
		type(Lastname, faker.name().lastName());
		type(Email, email);
		type(Password, password);
		type(Confirmation, password);
		click(register);
		Log.info("New Account has been created on Maddison Store.");
	}

    public void updateProfile() {
        // TODO Auto-generated method stub
        
    }

}
