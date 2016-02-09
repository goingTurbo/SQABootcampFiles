package com.sqa.ts.webtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonPurchase {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.amazon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testAmazonPurchase() throws Exception {
		driver.get(baseUrl + "/gp/gw/ajax/s.html/189-6953526-3975369");
		driver.findElement(By.cssSelector("span.nav-action-inner")).click();
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys("rktamachan@yahoo.com");
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.id("ap_password")).sendKeys("lime1234");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("floss glide");
		driver.findElement(By.cssSelector("input.nav-input")).click();
		driver.findElement(By.xpath("//li[@id='result_6']/div/div/div/div[2]/div/a/h2")).click();
		driver.findElement(By.id("clickableSnsVpcButton-announce")).click();
		driver.findElement(By.cssSelector("#onetimeOption > label > input[name=\"toggleBuyBox\"]")).click();
		driver.findElement(By.cssSelector("#onetimeOption > label > i.a-icon.a-icon-radio")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
	}

	@AfterTest
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
}
