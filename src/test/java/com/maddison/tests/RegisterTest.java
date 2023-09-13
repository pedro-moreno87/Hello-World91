package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.maddison.utils.listeners.TestListener;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Listeners({ TestListener.class })
@Epic("Epic -Smoke Tests")
@Feature("Feature - Register Tests")
public class RegisterTest extends BaseTest {

	@Test
	public void register(Method method) {
		startTest(method.getName(),"Create new Account");
		homePage.goToRegister();
		registerPage.createNewAccount();
	}

	@Test
    public void register2(Method method) {
        startTest(method.getName(),"Create new Account 2");
        homePage.goToRegister();
        registerPage.createNewAccount();
    }

}
