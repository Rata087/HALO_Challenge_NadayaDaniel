package org.halochallenge.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElement userNameInputField;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@data-test='error']")
    private WebElement errorMessageContainer;


    public void inputUser(String user) {
        userNameInputField.sendKeys(user);
    }

    public void inputPassword(String psw) {
        passwordInputField.sendKeys(psw);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public Boolean getErrorMsg(String errorMsg) {
        return errorMessageContainer.getText().contains(errorMsg);
    }
}
