package com.project.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends SearchHotel {
	public SelectHotel(WebDriver driver1) {
		super(driver1);
	}

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioBox;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;


	public WebElement getRadioBox() {
		return radioBox;

	}

	public WebElement getContinueButton() {
		return continueButton;

	}

}
