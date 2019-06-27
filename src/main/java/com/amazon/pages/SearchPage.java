package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	@FindBy(css = "#search a span.a-text-normal")
    private List<WebElement> searchItems;

    public ItemPage clickOnItemWithText(String text) {
        click(searchItems.stream()
        				.filter(webElement -> webElement.getText().contains(text))
        				.findAny()
        				.orElse(null));
        return new ItemPage();
    }
}
