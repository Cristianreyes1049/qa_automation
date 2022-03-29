package com.selenium.training.app.login.stepDefinitions;

import com.selenium.training.app.login.pageObject.LoginPage;
import com.selenium.training.common.cucumber.TestContext;
import com.selenium.training.common.manager.ReaderManager;
import com.selenium.training.dataTypes.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    TestContext testContext;
    LoginPage loginPage;

    public LoginSteps(TestContext testContext) {
        this.testContext = testContext;
        loginPage = testContext.getPageManager().getLoginPage();
    }

}
