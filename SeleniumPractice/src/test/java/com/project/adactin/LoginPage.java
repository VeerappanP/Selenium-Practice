package com.project.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maven.baseclass.BaseClassCucumber;

public class LoginPage extends BaseClassCucumber {
   
	public LoginPage(WebDriver driver1) {
		super(driver1);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
