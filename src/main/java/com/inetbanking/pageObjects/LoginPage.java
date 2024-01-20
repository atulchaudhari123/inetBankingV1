package com.inetbanking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	WebElement username;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(name = "btnLogin")
	WebElement login;
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[15]/a")
	WebElement logout;

	public void setUserName(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String password) {
		pwd.sendKeys(password);
	}

	public void clickSubmit() {
		login.click();
	}
	
	public void logOut() {
		logout.click();
	}

}
