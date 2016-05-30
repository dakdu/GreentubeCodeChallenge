package com.gametwist.appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gametwist.pageObjects.HomePage;

public class ClosePopupAction {

	public static void closePopup(WebDriver driver, HomePage home) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		if (home.isFortuneWheelPresent()) {
			home.clickOnFortuneWheel(wait);
			home.closeFortuneWheel(wait);
		}
	}
}
