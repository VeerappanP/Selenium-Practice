package com.project.adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass extends BookHotel {
	
	
	public RunnerClass(WebDriver driver1) {
		super(driver1);
	}

	public void adactin() throws IOException {
		maximize();
		getUrl("https://adactinhotelapp.com/index.php");
		initElements();
		
		getUserName().sendKeys("vv0472191");
		getPassword().sendKeys("Password@098123");
		getLoginButton().click();

		selectByValue(getLocation(), "Sydney");
		selectByValue(getHotels(), "Hotel Cornice");
		selectByValue(getRoomType(), "Standard");
		selectByValue(getNumberOfRoom(), "2");
		getCheckInDate().sendKeys("30/10/2011");
		getCheckOutDate().sendKeys("31/10/2022");
		selectByValue(getAdultsPerRoom(), "2");
		selectByValue(getChildrenPerRoom(), "2");
		getSearchButton().click();

		getRadioBox().click();
		getContinueButton().click();

		getFirstName().sendKeys("Vignesh");
		getLastName().sendKeys("V");
		getBillingAdress()
				.sendKeys("No:3/876, VOC street, Mettur Village and Post, Tindivanam Taluk, Villupuram District");
		getCreditCardNumber().sendKeys("6738273652376283");
		selectByValue(getCreditCardType(), "VISA");
		selectByValue(getExpireMonth(), "12");
		selectByValue(getExpireYear(), "2022");
		getCvvNumber().sendKeys("345");
		getBookNowButton().click();
		takesScreenshot("Adactin");
	}

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		RunnerClass r = new RunnerClass(driver);
		r.adactin();

	}

}
