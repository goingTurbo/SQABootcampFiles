package com.sqa.ts.ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Login //ADDD (description of class)
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
public class Login {

	private WebDriver driver;

	private final static long LONG_TIME_TO_WAIT = 30;

	/**
	 * This is the data given for 3 tests
	 * 
	 */
	@DataProvider(name = "login")
	public Object[][] loginCredentials() {
		return new Object[][] { { "joeSwan@gmail.com", "joe777swan" }, { "peteGrfi@goecities.com", "PeteheheheGrif" },
				{ "quag@yahoo.com", "QuagMireGiggity7" } };
	}

	/**
	 * This is the main test where test will imitate user trying to login in
	 * with non-valid username & password
	 * 
	 */
	@Test(dataProvider = "login")
	public void loginFailTest(String email, String password) {
		driver.get("https://www.salesforce.com/sales-cloud/");
		WebElement element = null;

		driver.findElement(By.id("button-login")).click();
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("username"));
		element.sendKeys(email);
		element = driver.findElement(By.id("password"));
		element.sendKeys(password);
		driver.findElement(By.id("Login")).click();

		Assert.assertEquals(driver.findElement(By.id("error")).getText(),
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		driver.close();
	}

	/**
	 * This will set the tests to be run in Chrome web browser
	 * 
	 */
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/Trevor/workspace/actions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	/**
	 * This will close out the browser once the test finishes each time
	 * 
	 */
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	private WebElement waitForVisibilityOfElement(long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
