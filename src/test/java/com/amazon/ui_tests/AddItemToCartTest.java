package com.amazon.ui_tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.BaseTest;
import com.amazon.pages.CartPage;
import com.amazon.pages.MainPage;

public class AddItemToCartTest extends BaseTest {

	@Test
	@Parameters({"searchItem"})
    public void addItemToCartTest(String searchItem) {

        MainPage mainPage = new MainPage();
        CartPage cartPage = new CartPage();

        mainPage.openBaseURL()
                .searchForItem(searchItem)
                .clickOnItemWithText(searchItem)
                .addItemToCart()
                .proceedToCart();
        Assert.assertEquals(1, cartPage.getNumberOfItemsInCart(), "Wrong number of items in cart!");
    }
}
