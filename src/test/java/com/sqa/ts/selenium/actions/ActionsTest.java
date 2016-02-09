package com.sqa.ts.selenium.actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsTest {

	private static WebDriver driver;
	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setup() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://wordpress.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void signIn() {
		driver.get(baseUrl);
		driver.findElement(By.cssSelector(".click-wpcom-login")).click();
		driver.findElement(By.cssSelector("#user_login")).clear();
		driver.findElement(By.cssSelector("#user_login")).sendKeys("trevorscott01");
		driver.findElement(By.cssSelector("#user_pass")).clear();
		driver.findElement(By.cssSelector("#user_pass")).sendKeys("onoda36217");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
	}

	@Test(dependsOnMethods = "signIn") // this test will execute ONLY if
										// "signin" method passes.
	public void testActionGoToStatPage() {
		WebElement mySiteButton = driver.findElement(By.linkText("My Site"));
		mySiteButton.click();
		System.out.println("I am currently on this page: " + driver.getTitle());
		Assert.assertEquals("Stats ‹ sqasolutiontrevor — WordPress.com", driver.getTitle());
	}

	@Test(dependsOnMethods = "testActionGoToStatPage")
	public void testDragAction() {

	}

	@Test(enabled = false)
	public void wordPressSignIn() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.cssSelector(".click-wpcom-login")).click();
		driver.findElement(By.cssSelector("#user_login")).clear();
		driver.findElement(By.cssSelector("#user_login")).sendKeys("trevorscott01");
		driver.findElement(By.cssSelector("#user_pass")).clear();
		driver.findElement(By.cssSelector("#user_pass")).sendKeys("onoda36217");
		driver.findElement(By.id("rememberme")).click();
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.cssSelector(".masterbar-new-post__button")).click();
		driver.findElement(By.xpath(".//*[@id='editor']/div[2]/div/div[2]/div[2]/ul/li[1]/div[1]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='status-draft']")).click();
		driver.findElement(By.xpath(".//*[@id='title']")).clear();
		driver.findElement(By.xpath(".//*[@id='title']")).sendKeys("this iS the TitlE AREa. :D");
		driver.findElement(By.cssSelector(".gravatar")).click();
		driver.findElement(By.cssSelector(".me-sidebar__menu__signout.form-button.button")).click();
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

	/**
	 * @param verificationErrorString
	 */
	private void fail(String verificationErrorString) {
		// TODO Auto-generated method stub
		System.out.println("Verification Error Message");
	}
}
