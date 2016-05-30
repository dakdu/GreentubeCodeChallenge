package com.gametwist.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(css = "Input[name*='login-nickname'")
	public WebElement txtbxUsername;

	@FindBy(css = "Input[id*='login-password'")
	public WebElement txtbxPassword;

	@FindBy(css = "Button[class*='btn btn--primary'")
	public WebElement btnLogin;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String username) {
		txtbxUsername.clear();
		txtbxUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtbxPassword.clear();
		txtbxPassword.sendKeys(password);
	}

	public void clickLoginBtn() {
		btnLogin.click();
	}
}