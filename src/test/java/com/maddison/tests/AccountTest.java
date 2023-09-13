package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Epic - Integration Tests")
@Feature("Feature - Account Tests")
public class AccountTest extends BaseTest {

    
	@Test // TestNG
	@Severity(SeverityLevel.CRITICAL) // severidad del test
	@Description("Update personal information") // allure description
	@Story("updateMiddleName Story") // story for allure
	public void updateMiddleName(Method method) {
		startTest(method.getName(),"update personal information"); //informacion para extent report
		registerPage.updateProfile();
		//assertion
	}

	@Test
	@Severity(SeverityLevel.MINOR) // severidad del test
    @Description("check status of orders") // allure description
    @Story("viewOrders Story") // story for allure
	public void viewOrders(Method method) {
		startTest(method.getName(),"check status of orders");
		// more details
	}

	@Test
	@Severity(SeverityLevel.BLOCKER) // severidad del test
    @Description("check status of orders") // allure description
    @Story("viewOrdersInTransit Story") // story for allure
    public void viewOrdersInTransit(Method method) {
        startTest(method.getName(),"check status of orders");
        // more details
    }
}
