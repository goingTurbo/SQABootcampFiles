package com.sqa.ts.webtests;
//make sure that the package is correct after import

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementsCollection {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(groups = { "Chrome" })
	public void setUpChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.baseUrl = "http://www.amazon.com/";
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeClass(groups = { "Firefox" }, enabled = false)
	public void setUpFirefox() throws Exception {
		this.driver = new FirefoxDriver();
		this.baseUrl = "http://www.ebay.com/";
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() throws Exception {
		this.driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	/**
	 * @param verificationErrorString
	 */
	private void fail(String verificationErrorString) {
		// TODO Auto-generated method stub
		System.out.println("Verification Error");
	}

	@Test(groups = { "Ebay", "Chrome" })
	public void testEBayLoginAddItemCart() throws Exception {
		// A Collection to hold Web Elements
		ArrayList<WebElement> elements = new ArrayList<WebElement>();

		// Go to URL to search for elements
		this.driver.get("http://amazon.com");
		// the xpath 'jargon' was made up by teacher, look at day21 in notes to
		// find the actual value
		// WebElement searchbox =
		// this.driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		// elements.add(searchbox);
		// // What this is actually doing is
		// WebElement nameLogoImage =
		// this.driver.findElement(By.className("nav-logo-base nav-sprite"));
		// elements.add(nameLogoImage);
		// WebElement amazonCareers = this.driver
		// .findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[1]/a"));
		// elements.add(amazonCareers);
		// WebElement shoppingCartButton =
		// this.driver.findElement(By.xpath(".//*[@id='nav-cart']/span[2]"));
		// elements.add(shoppingCartButton);
		// // WebElement promoLeftArrow = this.driver
		// //
		// .findElement(By.xpath(".//*[@id='billboardFragment']/div[1]/div[1]/button[3]"));
		// // elements.add(promoLeftArrow);
		// // Was looking for the 'id' name of the link, not the xPath
		// WebElement searchButton =
		// this.driver.findElement(By.id("nav-search-submit-text"));
		// elements.add(searchButton);
		// WebElement cssTrendingLink =
		// this.driver.findElement(By.cssSelector(".nav_a"));
		// elements.add(cssTrendingLink);
		// this will grab the first <a> tag that it finds. That includes
		// stuff like <a href="blah">.
		List<WebElement> imageTag = this.driver.findElements(By.tagName("img"));
		elements.addAll(imageTag);

		// Perform a method on all elements of the collection
		System.out.println(elements.size());
		for (WebElement element : elements) {
			// the getAttribute & isDisplayed are stock methods that belong the
			// WebElement class
			System.out.println(element.getAttribute("id") + " is Displayed:");
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
}
