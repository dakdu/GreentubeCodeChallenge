package com.gametwist.appModules;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.gametwist.pageObjects.HomePage;
import com.gametwist.pageObjects.LoginPage;

public class LoginAction {

	public static void login(WebDriver driver, WebDriverWait wait, HomePage home, LoginPage login,
			Properties properties) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
		wait.until(ExpectedConditions.visibilityOf(login.txtbxUsername));
		login.setUsername(properties.getProperty("username"));
		login.setPassword(properties.getProperty("password"));
		login.clickLoginBtn();
		assertUserLogin(wait, home, properties);
	}

	public static void assertUserLogin(WebDriverWait wait, HomePage home, Properties properties) {
		wait.until(ExpectedConditions.visibilityOf(home.userAccount));
		Assert.assertEquals(home.userAccount.getText(), properties.getProperty("username"),
				"User " + home.userAccount.getText() + " wasn't logged in successfully!");
	}
}
