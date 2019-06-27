package com.amazon;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.amazon.utils.WebDriverFactory;

public class BaseTest {

	@BeforeSuite
    public void setUp() {
        WebDriverFactory.setChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        if (WebDriverFactory.getChromeDriver() != null) {
            WebDriverFactory.getChromeDriver().quit();
        }
    }
}
