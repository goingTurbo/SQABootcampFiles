
package com.sqa.ts.ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Homepage object
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Homepage {

	private final static String HOME_PAGE_URL = "http://www.salesforce.com/sales-cloud/sales-performance-management.jsp";

	// locating the page object of login button and assigning it to Web Element
	// loginBtn
	@FindBy(id = "button-login")
	private WebElement loginBtn;

	private WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public Login_ clickOnLoginBtn() {
		loginBtn.click();
		// initializes the next page objects that we are going to
		return PageFactory.initElements(driver, Login_.class);
	}

	public Homepage navigateToHomePage() {
		driver.get(HOME_PAGE_URL);
		return this;
	}
}
