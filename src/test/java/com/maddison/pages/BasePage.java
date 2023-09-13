package com.maddison.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	WebDriverWait wait;
	int timeoutSec = 10;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));
	}

	public void setTimeoutSec(int timeoutSec) {
		this.timeoutSec = timeoutSec;
	}

	public void visit(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutSec));
		driver.get(url);
	}

	public WebElement find(By element) {
		return driver.findElement(element);
	}

	public void click(By element) {
		find(element).click();
	}

	public void submit(By element) {
		find(element).submit();
	}

	public void type(By element, String text) {
		find(element).sendKeys(text);
	}

	public boolean isDisplayed(By element) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
