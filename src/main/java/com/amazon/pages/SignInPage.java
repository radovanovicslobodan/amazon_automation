package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

	@FindBy(id = "ap_email")
	private WebElement emailField;

	@FindBy(id = "ap_password")
	private WebElement passwordField;

	@FindBy(id = "signInSubmit")
	private WebElement signInButton;

	public MainPage signInWithCredentials(String login, String password) {
		sendKeys(emailField, login);
		sendKeys(passwordField, password);
		click(signInButton);
		return new MainPage();
	}
}
