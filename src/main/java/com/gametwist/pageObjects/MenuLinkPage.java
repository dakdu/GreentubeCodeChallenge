package com.gametwist.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenuLinkPage {

	@FindBy(xpath = "//a[@class='CMSListMenuLinkHighlighted']")
	public WebElement highlightedMenuLink;

	public MenuLinkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void assertHighlightedMenuLink(String page) {
		Assert.assertEquals(highlightedMenuLink.getText(), page,
				"Navigation to " + highlightedMenuLink.getText() + " was unsuccessful!");
	}
}