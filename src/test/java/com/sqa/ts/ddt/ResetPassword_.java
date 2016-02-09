
package com.sqa.ts.ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * ResetPassword_ //ADDD (description of class)
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
public class ResetPassword_ {

	@FindBy(id = "un")
	private WebElement emailInputfield;

	@FindBy(how = How.LINK_TEXT, using = "cancel")
	private WebElement cancelBtn;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	private WebDriver driver;

	/**
	 * the constructor for this class
	 * 
	 */
	public ResetPassword_(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This is for the typing in the email input field
	 * 
	 * @param username
	 * @return ResetPassword_ page object
	 */
	public ResetPassword_ typeEmail(String username) {
		emailInputfield.sendKeys(username);
		return this;
	}

	// remember, when going to a new page thanks to the method, the method has
	// to
	// be the object type of the page it's going to, like below

	/**
	 * This is for when the cancel button is selected
	 * 
	 * @return Login_ page object
	 */
	public Login_ clickOnCancelBtn() {
		cancelBtn.click();
		return PageFactory.initElements(driver, Login_.class);
	}

	/**
	 * This is in case the user clicks continue and stays on the same page
	 * 
	 * @return ResetPassword_ page object
	 */
	public ResetPassword_ clickOnContinueAndStayOnSamePage() {
		continueBtn.click();
		return this;
	}

	// This is going to a new page, so it is a different object type than
	// what this current page is

	/**
	 * This is when user clicks the continue button and it goes to the
	 * confirmation page
	 * 
	 * @return Confirmation_ page object
	 */
	public Confirmation_ clickOnContinueAndNavigateToConfirmationPage() {
		continueBtn.click();
		return PageFactory.initElements(driver, Confirmation_.class);
	}

}
