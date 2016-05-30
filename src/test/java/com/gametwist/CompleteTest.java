package com.gametwist;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gametwist.appModules.ClosePopupAction;
import com.gametwist.appModules.LoginAction;
import com.gametwist.appModules.LogoutAction;
import com.gametwist.appModules.PageNavigationAction;
import com.gametwist.appModules.SearchAction;
import com.gametwist.pageObjects.HomePage;
import com.gametwist.pageObjects.LoginPage;
import com.gametwist.pageObjects.MenuLinkPage;
import com.gametwist.pageObjects.SearchResultsPage;
import com.gametwist.utilities.Utils;

public class CompleteTest {
	public static WebDriver driver = new FirefoxDriver();
	public static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static Actions action = new Actions(driver);
	public static HomePage home = new HomePage(driver);
	public static LoginPage login = new LoginPage(driver);
	public static Properties properties = Utils.readFile();
	public static MenuLinkPage menuLink = new MenuLinkPage(driver);
	public static SearchResultsPage searchResults = new SearchResultsPage(driver);

	@BeforeMethod
	public void beforeMethod() {
		LoginAction.login(driver, wait, home, login, properties);
	}

	@Test
	public void main() throws InterruptedException {
		ClosePopupAction.closePopup(driver, home);
		PageNavigationAction.navigate(home, menuLink);
		SearchAction.search(driver, wait, home, properties);
		SearchAction.similarGames(driver, action, wait, searchResults);
		PageNavigationAction.languageChange(home, action, wait);
	}

	@AfterMethod
	public void afterMethod() {
		LogoutAction.Logout(driver, action, wait, home);
	}
}