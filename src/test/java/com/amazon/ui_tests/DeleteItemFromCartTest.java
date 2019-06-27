package com.amazon.ui_tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.BaseTest;
import com.amazon.pages.CartPage;
import com.amazon.pages.MainPage;

public class DeleteItemFromCartTest extends BaseTest {

	@Test
	@Parameters({"searchItem"})
    public void deleteItemFromCartTest(String searchItem) {

        MainPage mainPage = new MainPage();
        CartPage cartPage = new CartPage();

        mainPage.openBaseURL()
                .searchForItem(searchItem)
                .clickOnItemWithText(searchItem)
                .addItemToCart()
                .proceedToCart()
                .deleteFirstItemFromCart();
        Assert.assertEquals(0, cartPage.getNumberOfItemsInCart(), "Wrong number of items in cart!");
    }
}
