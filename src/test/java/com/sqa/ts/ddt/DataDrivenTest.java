package com.sqa.ts.ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	private final static long LONG_TIME_TO_WAIT = 30;

	private final static long SHORT__TIME_TO_WAIT = 5;

	private WebDriver driver;

	@DataProvider(name = "email")
	public Object[][] emails() {
		return new Object[][] { { "peteGrif@gmail.com" }, { "joeSwan@gmail.com" }, { "Quag@yahoo.com" } };
	}

	/**
	 * @param emailEntry
	 * @throws InterruptedException
	 */
	@Test(dataProvider = "email")
	public void ddt(String emailEntry) throws InterruptedException {
		driver.get("https://www.salesforce.com/sales-cloud/");
		WebElement element = null;

		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("button-login"));
		element.click();
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.linkText("Forgot Your Password?"));
		element.click();
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("un"));

		element.sendKeys(emailEntry);
		driver.findElement(By.id("continue")).click();

		final String mesg1 = "We've sent you an email with a link to finish resetting your password.";
		final String mesg2 = "Can't find the email? Try checking your spam folder.";
		final String errorMessage = "Expected error doesn't natch with actual";

		// element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT,
		// By.className("message"));
		// Thread.sleep(3000);

		Assert.assertEquals(driver.findElement(By.className("message")).getText(),
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		driver.close();
	}

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}

	// Create a helper method for wait for expected conditions
	private WebElement waitForexpectedConditions(long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		// anything after the "ExpectedConditions" will be the condition that
		// will make
		// the code wait
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	// Create a helper method for wait for expected conditions
	private WebElement waitForVisibilityOfElement(long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
