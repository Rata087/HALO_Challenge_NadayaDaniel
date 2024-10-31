package org.halochallenge.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.model.environment.ConfiguredEnvironment;
import org.junit.Assert;
import org.halochallenge.pages.LoginPage;


public class LoginStepDefinitions {
    LoginPage loginPage;

    @After
    public void tearDown() {
        Serenity.getWebdriverManager().closeDriver();
    }

    @And("the user opens the Saucedemo page")
    public void OpensTheServiceNowPage() {
        loginPage.open();
        Assert.assertEquals("Swag Labs", loginPage.getTitle());
    }

    @And("logs in with valid credentials")
    public void logsInWithValidCredentials() {
        String user = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables().getProperty("valid.user");
        String password = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables().getProperty("valid.password");
        loginPage.inputUser(user);
        loginPage.inputPassword(password);
        loginPage.clickOnLoginButton();
    }

    @And("logs in with invalid credentials")
    public void logsInWithInvalidCredentials() {
        loginPage.inputUser("invalidUser");
        loginPage.inputPassword("invalidPassword");
        loginPage.clickOnLoginButton();
    }

    @And("logs in with a locked-out user")
    public void logsInWithALockedOutUser() {
        String user = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables().getProperty("locked-out.user");
        String password = ConfiguredEnvironment.getConfiguration().getEnvironmentVariables().getProperty("valid.password");
        loginPage.inputUser(user);
        loginPage.inputPassword(password);
        loginPage.clickOnLoginButton();
    }

    @And("the user logs in successfully")
    public void theUserLogsInSuccessfully() {
        Assert.assertEquals("The Page Title is not the expected one.", "Swag Labs", loginPage.getTitle());
    }


    @And("an error message displays indicating {string}")
    public void anErrorMessageIsDisplayed(String errorMsg) {
        Assert.assertTrue("The error message is not the expected one.", loginPage.getErrorMsg(errorMsg));
    }
}
