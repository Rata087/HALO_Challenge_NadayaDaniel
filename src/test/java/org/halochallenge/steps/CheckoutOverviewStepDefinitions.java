package org.halochallenge.steps;

import io.cucumber.java.en.And;
import org.halochallenge.pages.CheckoutOverviewPage;
import org.junit.Assert;

import static org.halochallenge.steps.InventoryStepDefinitions.productName;
import static org.halochallenge.steps.InventoryStepDefinitions.productPrice;


public class CheckoutOverviewStepDefinitions {
    CheckoutOverviewPage checkoutOverviewPage;


    @And("validates the Product Name and Price are correct on the Checkout: Overview page")
    public void validatesTheProductNameAndPriceAreCorrect() {
        Assert.assertEquals(productName, checkoutOverviewPage.getProductName());
        Assert.assertEquals(productPrice, checkoutOverviewPage.getProductPrice());
    }

    @And("clicks on Finish button")
    public void clicksOnFinishButton() {
        checkoutOverviewPage.clickOnFinishButton();
    }
}
