
package com.sqa.ts.webtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sqa.ts.ddt.Confirmation_;
import com.sqa.ts.ddt.Homepage;
import com.sqa.ts.ddt.Login_;
import com.sqa.ts.ddt.ResetPassword_;

/**
 * ResetPasswordTest_PageObjects //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class ResetPasswordTest_PageObjects {

	private WebDriver driver;

	@BeforeMethod
	public void createInstanceOfFirefox() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void endInstanceOfFirefox() {
		driver.quit();
	}

	@Test
	public void resetPassword() {
		Homepage homePage = PageFactory.initElements(driver, Homepage.class);
		// This will take user to homepage, this is acquired from the Homepage
		// class and uses the
		// method 'navigateToHomePage' method
		homePage.navigateToHomePage();
		// This will click the 'login' button on the page
		Login_ loginPage = homePage.clickOnLoginBtn();
		// this will click the "Forgotten password" link at the login page
		ResetPassword_ resetPasswordPage = loginPage.clickOnForgotPasswordLink();
		// This is the hard-coded email we are using to test
		final String username = "blah@hlfg.com";
		// This will use the method 'typeEmail' from java class "ResetPassword_"
		resetPasswordPage.typeEmail(username);
		// This will click the 'continue' button on the page
		Confirmation_ confirmationPage = resetPasswordPage.clickOnContinueAndNavigateToConfirmationPage();
		final String actualConfirmationMessage = "We�ve sent you an email with a link to finish resetting your password.\n"
				+ "Can�t find the email? Try checking your spam folder.\n"
				+ "If you still can�t log in, have us resend the email or contact your Salesforce administrator.";
		// Checks to make sure that the messages are correct
		AssertJUnit.assertEquals("Expected confirmation error doesn't match expected one.",
				confirmationPage.getConfirmationMessage(), actualConfirmationMessage);
	}

}
