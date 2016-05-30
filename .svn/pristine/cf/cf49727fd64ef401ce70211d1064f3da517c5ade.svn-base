package com.gametwist.appModules;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gametwist.pageObjects.HomePage;
import com.gametwist.pageObjects.MenuLinkPage;

public class PageNavigationAction {

	public static void navigate(HomePage home, MenuLinkPage menuLink) throws InterruptedException {
		home.goToSlotsPage();
		menuLink.assertHighlightedMenuLink("Slots");
		Thread.sleep(5000);
		home.goToBingoPage();
		menuLink.assertHighlightedMenuLink("Bingo");
		Thread.sleep(5000);
		home.goToCasinoPage();
		menuLink.assertHighlightedMenuLink("Casino");
		Thread.sleep(5000);
		home.goToPokerPage();
		menuLink.assertHighlightedMenuLink("Poker");
		Thread.sleep(5000);
	}

	public static void languageChange(HomePage home, Actions action, WebDriverWait wait) {
		home.changeToGermanLanguage(action, wait);
	}
}
