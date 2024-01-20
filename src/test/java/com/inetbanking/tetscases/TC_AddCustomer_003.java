package com.inetbanking.tetscases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.TestBase;

public class TC_AddCustomer_003 extends TestBase {

	@Test
	public void addNewCustomer() throws Exception {
		LoginPage lp = new LoginPage();
		lp.setUserName(username);
		logger.info("Username provided...");
		lp.setPassword(password);
		logger.info("Password provided...");
		lp.clickSubmit();
		Thread.sleep(3000);

		AddCustomerPage cp = new AddCustomerPage();
		logger.info("Customer details added successfully...");
		cp.clickAddNewCustomerLink();
		cp.addCustomerName("Atul");
		cp.selectGender();
		cp.selectDob("06", "03", "1985");
		Thread.sleep(3000);
		cp.enterAddress("AT Wakad");
		cp.enterCity("Pune");
		cp.enterState("Maharashtra");

		String zcode = randomNum();
		cp.enterZipCode(zcode);
		Thread.sleep(3000);
		cp.enterMobNo("9876543455");

		String email = randomString() + "@gmail.com";
		cp.enterEmail(email);

		Thread.sleep(2000);
		cp.enterPassword("mango123");
		cp.clickSubmitCustomer();
		Thread.sleep(3000);

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res == true) {
			Assert.assertTrue(true);
			logger.info("Test Case is passesd...");
		} else {
			captureScreen(driver, "add new customer");
			Assert.assertTrue(false);
			logger.info("Test Case is failed...");
		}

	}
}