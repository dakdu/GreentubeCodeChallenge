package com.gametwist.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchResultsPage {
	public static List<WebElement> similarGames;
	public static WebElement similarGamePlayNow;
	public static WebElement selectedSimilarGame;
	public static String selectedSimilarGameName;

	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section[@class='push-half--top']/ul[@class='no-bullets grid js-load-games']")
	public WebElement similarItems;

	public void listSimilarGames(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(similarItems));
		similarGames = similarItems.findElements(By.tagName("li"));
		System.out.println("Number of similar games: " + similarGames.size());
		System.out.println("Similar games: ");
		for (int i = 1; i <= similarGames.size(); ++i) {
			System.out.println(getSimilarGame(driver, i).getText());
		}
	}

	public void selectSimilarGame(WebDriver driver, Actions action) {
		selectedSimilarGame = getSimilarGame(driver, 2);
		selectedSimilarGameName = selectedSimilarGame.getText();
		action.moveToElement(selectedSimilarGame).moveToElement(similarGamePlayNow).click().build().perform();
	}

	public WebElement getSimilarGame(WebDriver driver, int nth_item) {
		similarGamePlayNow = driver.findElement(By.xpath("//ul[@class='no-bullets grid js-load-games']/li[" + nth_item
				+ "]/div[@class='game-teaser']/div[@class='game-teaser__content']/div[@class='game-teaser__buttons']/a[@class='btn btn--primary btn--big']"));
		return driver.findElement(By.xpath("//ul[@class='no-bullets grid js-load-games']/li[" + nth_item
				+ "]//div[@class='game-teaser']/h1[@class='game-teaser__title font--brand']"));
	}

	public void assertCorrectPageRedirection(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(similarItems));
		Assert.assertEquals(driver.getTitle(), selectedSimilarGameName,
				"Redirection to page " + driver.getTitle() + " was unsuccessful!");
	}
}