package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic - Oaut Module")
@Feature ("Feature - Login Tests")
public class LoginTest extends BaseTest {

	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Description: Login test with user & pass valid")
	@Story("SingIn Story")
	public void singIn(Method method) throws InterruptedException {
		startTest(method.getName(),"do singIn");
		homePage.goToSingIn();
		loginPage.login();
		accountPage.verifyLogin();
	}
	
	@Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Login test with user & pass invalid")
	@Story("singInInvalidCredential Story")
    public void singInInvalidCredential(Method method) throws InterruptedException {
        startTest(method.getName(),"singInInvalidCredential");
        homePage.goToSingIn();
        loginPage.login();
        accountPage.verifyLogin();
    }

	@Test
	@Severity(SeverityLevel.TRIVIAL)
    @Description("Test Description: do logOut")
    @Story("do logOut Story")
	public void logOut(Method method) {
		startTest(method.getName(),"do logOut");
		// all message
	}
}
