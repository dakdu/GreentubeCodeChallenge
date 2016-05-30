package com.gametwist.appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gametwist.pageObjects.HomePage;

public class LogoutAction {
	public static void Logout(WebDriver driver, Actions action, WebDriverWait wait, HomePage home) {
		PageFactory.initElements(driver, HomePage.class);
		home.clickLogoutButton(action, wait);
		driver.quit();
	}
}