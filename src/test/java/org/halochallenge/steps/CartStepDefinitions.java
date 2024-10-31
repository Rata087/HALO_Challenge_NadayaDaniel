package org.halochallenge.steps;

import io.cucumber.java.en.And;
import org.halochallenge.pages.CartPage;
import org.junit.Assert;

import static org.halochallenge.steps.InventoryStepDefinitions.productName;
import static org.halochallenge.steps.InventoryStepDefinitions.productPrice;


public class CartStepDefinitions {
    CartPage cartPage;


    @And("validates that only one item is visible on the Cart page")
    public void validatesTheItemIsVisible() {
        Assert.assertTrue(cartPage.onlyOneItemValidation());
    }

    @And("the Product Name and Price are correct on the Cart page")
    public void theProductNameAndPriceAreCorrect() {
        Assert.assertEquals(productName, cartPage.getProductName());
        Assert.assertEquals(productPrice, cartPage.getProductPrice());
    }

    @And("clicks on Checkout button on the Cart Page")
    public void clicksOnCheckoutButton() {
        cartPage.clickOnCheckoutButton();
    }
}
