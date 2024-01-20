package com.inetbanking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends TestBase {

	public AddCustomerPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	WebElement AddNewCustomerlink;

	@FindBy(xpath = "//input[@name='name']")
	WebElement CustomerName;

	@FindBy(xpath = "//input[@value='m']")
	WebElement gender;

	@FindBy(id = "dob")
	WebElement dob;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement addr;

	@CacheLookup
	@FindBy(name = "city")
	WebElement ccity;

	@FindBy(xpath = "//input[@name='state']")
	WebElement cstate;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement zipcode;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement mobNo;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement cemail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='sub']")
	WebElement subbtn;

	public void clickAddNewCustomerLink() {
		AddNewCustomerlink.click();
	}

	public void addCustomerName(String cname) {
		CustomerName.sendKeys(cname);
	}

	public void selectGender() {
		gender.click();
	}

	public void selectDob(String dd, String mm, String yy) {
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yy);
	}

	public void enterAddress(String address) {
		addr.sendKeys(address);
	}

	public void enterCity(String city) {
		ccity.sendKeys(city);
	}

	public void enterState(String state) {
		cstate.sendKeys(state);
	}

	public void enterZipCode(String zcode) {
		zipcode.sendKeys(String.valueOf(zcode));
	}

	public void enterMobNo(String mobno) {
		mobNo.sendKeys(mobno);
	}

	public void enterEmail(String email) {
		cemail.sendKeys(email);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickSubmitCustomer() {
		subbtn.click();
	}
}
