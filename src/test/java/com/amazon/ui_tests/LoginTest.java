package com.amazon.ui_tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.BaseTest;
import com.amazon.pages.MainPage;

public class LoginTest extends BaseTest {
	
	@Test
	@Parameters({"userEmail", "userPassword", "userName"})
    public void loginTest(String userEmail, String userPassword, String userName) {
		
        MainPage mainPage = new MainPage();

        mainPage.openBaseURL()
                .openLoginPage()
                .signInWithCredentials(userEmail, userPassword);
        Assert.assertEquals(mainPage.getUserName(), userName, "User is not signed in or userName is incorrect:");
    }
}
