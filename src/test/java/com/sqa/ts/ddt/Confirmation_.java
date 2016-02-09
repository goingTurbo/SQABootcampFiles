
package com.sqa.ts.ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Confirmation_ This is the confirmation page
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Confirmation_ {

	@FindBy(id = "resend-email")
	private WebElement resendTheEmailLink;

	@FindBy(className = "message")
	private WebElement messageContainer;

	private WebDriver driver;

	public Confirmation_(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Clicking the resend link will take user back to the reset password page
	 * object
	 * 
	 * @return ResetPassword_ page object
	 */
	public ResetPassword_ clickOnResendTheEmailLink() {
		resendTheEmailLink.click();
		return PageFactory.initElements(driver, ResetPassword_.class);
	}

	/**
	 * This checks to make sure that there is messageContainer object on the
	 * page
	 * 
	 * @return confirmation message
	 */
	public String getConfirmationMessage() {
		return messageContainer.getText();
	}

}
