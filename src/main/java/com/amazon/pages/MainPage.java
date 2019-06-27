package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
	
	@FindBy(id = "nav-link-accountList")
    private WebElement loginPageButon;

    @FindBy(css = "#nav-link-accountList .nav-line-1")
    private WebElement userBar;

    @FindBy(css = ".feed-carousel-card")
    private List<WebElement> carouselItems;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(css = "[value='Go'")
    private WebElement searchButton;
    
    public SignInPage openLoginPage() {
        click(loginPageButon);
        return new SignInPage();
    }

    public String getUserName() {
        return userBar.getText().split(" ")[1];
    }

    public SearchPage searchForItem(String itemName) {
        sendKeys(searchBar, itemName);
        click(searchButton);
        return new SearchPage();
    }
}
