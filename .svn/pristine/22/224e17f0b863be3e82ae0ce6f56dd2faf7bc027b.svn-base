package com.gametwist.appModules;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gametwist.pageObjects.HomePage;
import com.gametwist.pageObjects.SearchResultsPage;

public class SearchAction {

	public static void search(WebDriver driver, WebDriverWait wait, HomePage home, Properties properties) {
		home.searchGamesBy(properties.getProperty("searchTerm"), wait);
	}

	public static void similarGames(WebDriver driver, Actions action, WebDriverWait wait,
			SearchResultsPage searchResults) {
		searchResults.listSimilarGames(driver, wait);
		searchResults.selectSimilarGame(driver, action);
		searchResults.assertCorrectPageRedirection(driver, wait);
	}
}
