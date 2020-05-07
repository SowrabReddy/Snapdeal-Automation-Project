package com.capgemini.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage {
	public HelpCenterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "faq_search_text")
	WebElement searchBar;

	@FindBy(id = "faq_search_button")
	WebElement searchButton;

	public void searchBarIcon(String searchData) {
		searchBar.sendKeys(searchData);
	}

	public void searchButtonClick() {
		searchButton.click();
	}
}
