package org.halochallenge.steps;

import io.cucumber.java.en.And;
import org.halochallenge.pages.CheckoutCompletePage;
import org.junit.Assert;


public class CheckoutCompleteStepDefinitions {
    CheckoutCompletePage checkoutCompletePage;


    @And("verifies that the message {string} is present on the Checkout: Complete page")
    public void verifiesThatTheMessageIsPresent(String message) {
        Assert.assertTrue(message, checkoutCompletePage.messageExist(message));
    }

    @And("clicks on Back Home button on the Checkout: Complete page")
    public void clicksOnBackHomeButton() {
        checkoutCompletePage.clickOnBackHomeButton();
    }
}
