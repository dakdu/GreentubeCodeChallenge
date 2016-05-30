package com.gametwist.pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy(xpath = "//div[@class='wheel-frame']")
	public WebElement fortuneWheel;

	@FindBy(xpath = "//button[@class='btn WOF-close']")
	public WebElement closeFortuneWheel;

	@FindBy(xpath = "//div[@class='branding__bar-stretch float--left']/ul[@class='nav nav__my-gt-menu my-gt-menu']//span[@class='nickname']")
	public WebElement userAccount;

	@FindBy(xpath = "//div[@class='branding__content float--right authenticated']//div[@class='flyout my-gt-menu__flyout']//button[@class='btn--link js-logout']")
	public WebElement logout;

	@FindBy(xpath = "//li[@class='branding__language-and-help']/div[@class='select-language flyout']/span[@class='select-language__button']")
	public WebElement changeLanguage;

	@FindBy(xpath = "//li[@class='branding__language-and-help']/div[@class='select-language flyout']/ul[@class='select-language__list grid flyout__content']//a[@data-lang='de']")
	public WebElement germanLanguage;

	@FindBy(xpath = "//a[@href='/en/games/slots/']")
	public WebElement slotsPage;

	@FindBy(xpath = "//a[@href='/en/games/bingo/']")
	public WebElement bingoPage;

	@FindBy(xpath = "//a[@href='/en/games/casino/']")
	public WebElement casinoPage;

	@FindBy(xpath = "//a[@href='/en/games/poker/']")
	public WebElement pokerPage;

	@FindBy(xpath = "//input[@class='game-search__field js-game-search-input']")
	public WebElement txtbxSearchGames;

	@FindBy(xpath = "//a[@href='/en/games/slots/crazy-slots/']")
	public WebElement proposedGame;

	@FindBy(xpath = "//li[@class='game-search__list grid flyout__content js-game-search-list']")
	public WebElement gameSearchList;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isFortuneWheelPresent() {
		try {
			fortuneWheel.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void clickOnFortuneWheel(WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(fortuneWheel));
		fortuneWheel.click();
	}

	public void closeFortuneWheel(WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(closeFortuneWheel));
		closeFortuneWheel.click();
	}

	public void goToSlotsPage() {
		slotsPage.click();
	}

	public void goToBingoPage() {
		bingoPage.click();
	}

	public void goToCasinoPage() {
		casinoPage.click();
	}

	public void goToPokerPage() {
		pokerPage.click();
	}

	public void searchGamesBy(String searchTerm, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(txtbxSearchGames));
		txtbxSearchGames.sendKeys(searchTerm);
		wait.until(ExpectedConditions.visibilityOf(proposedGame));
		proposedGame.click();
	}

	public void changeToGermanLanguage(Actions action, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(changeLanguage));
		action.moveToElement(changeLanguage).moveToElement(germanLanguage).click().build().perform();
	}

	public void clickLogoutButton(Actions action, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOf(userAccount));
		action.moveToElement(userAccount).moveToElement(logout).click().build().perform();
	}

}
