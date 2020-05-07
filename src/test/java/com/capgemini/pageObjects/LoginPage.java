package com.capgemini.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}	
	@FindBy(xpath = "//span[text()=\"Sign In\"]")
	WebElement signinBtn;

	@FindBy(xpath = "//a[@href=\"https://www.snapdeal.com/login\"]")
	WebElement loginbtn;

	@FindBy(id = "userName")
	WebElement usernameTb;

	@FindBy(id = "checkUser")
	WebElement checkuserTB;

	@FindBy(id = "j_password_login_uc")
	WebElement passwordTb;

	@FindBy(id = "submitLoginUC")
	WebElement submitBtn;

	

	public void signinButton() {
		signinBtn.click();
	}

	public void logininButton() {
		loginbtn.click();
	}

	public void usernameTextbox(String mobileNumber) {
		usernameTb.sendKeys(mobileNumber);

	}

	public void checkuserButton() {
		checkuserTB.click();
	}

	public void passwordTextbox(String pwd) {
		passwordTb.sendKeys(pwd);
	}

	public void submitButton() {
		submitBtn.click();
	}
}
