
package com.sqa.ts.ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Login_ This is when you are on the login page Where you are creating methods
 * for all actions on the page
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Login_ {

	@FindBy(id = "username")
	private WebElement usernameInputField;

	@FindBy(id = "password")
	private WebElement passwordInputfield;

	@FindBy(id = "Login")
	private WebElement loginBtn;

	@FindBy(id = "forgot_password_link")
	private WebElement forgotPasswordLink;

	private WebDriver driver;

	public Login_(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * type username into input field
	 * 
	 * @param username
	 * @return Login_ page object
	 **/
	public Login_ typeUsername(String username) {
		usernameInputField.sendKeys(username);
		return this;
	}

	/**
	 * type password into input field
	 * 
	 * @param password
	 * @return Login_ page object
	 **/
	public Login_ typePassword(String password) {
		passwordInputfield.sendKeys(password);
		return this;
	}

	// each method with this strategy should have a descriptive name like below
	/**
	 * This will click the login button and navigate to the account page of the
	 * user
	 * 
	 * @return Useraccount_ page object
	 */
	public UserAccount_ clickOnLoginBtnAndNavigateToAccount() {
		loginBtn.click();
		return PageFactory.initElements(driver, UserAccount_.class);
	}

	/**
	 * this will click on the login button and stay on the same page.
	 * Recommended to use for negative test scenarios
	 * 
	 * @return Login_ page object
	 */
	public Login_ clickOnLoginBtnAndStayOnTheSamePage() {
		loginBtn.click();
		return this;
	}

	/**
	 * clicking on the Forgot Password Link
	 * 
	 * @return ResetPassword_ page object
	 */
	public ResetPassword_ clickOnForgotPasswordLink() {
		forgotPasswordLink.click();
		return PageFactory.initElements(driver, ResetPassword_.class);

	}
}
