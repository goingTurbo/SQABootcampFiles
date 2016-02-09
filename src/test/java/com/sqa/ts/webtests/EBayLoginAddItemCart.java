package com.sqa.ts.webtests;
//make sure that the package is correct after import

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

public class EBayLoginAddItemCart {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(groups = { "Chrome" }, enabled = false)
	public void setUpChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.baseUrl = "http://www.ebay.com/";
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeClass(groups = { "Firefox" })
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

	// the highest thing we are trying to find is which element on the page is
	// located closest to the top, not the quantity
	@Test(groups = { "Starbucks", "Chrome", "Firefox" })
	public void testHelperMethodJF() throws Exception {
		driver.get("http://www.starbucks.com");
		WebElement instagramIcon = driver.findElement(By.cssSelector(".instgram>a"));
		WebElement logo = this.driver.findElement(By.cssSelector("#logo"));
		System.out.println("Which element is higher on screen?");
		System.out.println("Element1 " + instagramIcon.getAttribute("href") + "// Element2 " + logo.getAttribute("id"));
		WebElement highest = highestElement(logo, instagramIcon);
		System.out.println(highest + " is the highest element count");
	}
	// @Ignore
	// @Test(groups = { "Ebay", "Firefox" })
	// public void testEBayLoginAddItemCart() throws Exception {
	// // A Collection to hold Web Elements
	// ArrayList<WebElement> elements = new ArrayList<WebElement>();
	//
	// // Go to URL to search for elements
	// this.driver.get("http://ebay.com");
	// // the xpath 'jargon' was made up by teacher, look at day21 in notes to
	// // find the actual value
	// WebElement searchbox =
	// this.driver.findElement(By.xpath(".//*[@id='gh-ac']"));
	// elements.add(searchbox);
	// // What this is actually doing is
	// WebElement nameLogoImage =
	// this.driver.findElement(By.xpath(".//*[@id='gh-logo']"));
	// elements.add(nameLogoImage);
	// WebElement ebayAffiliatesLink = this.driver
	// .findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[5]/a"));
	// elements.add(ebayAffiliatesLink);
	// WebElement shoppingCartButton =
	// this.driver.findElement(By.xpath(".//*[@id='gh-cart-i']"));
	// elements.add(shoppingCartButton);
	// // WebElement promoLeftArrow = this.driver
	// //
	// .findElement(By.xpath(".//*[@id='billboardFragment']/div[1]/div[1]/button[3]"));
	// // elements.add(promoLeftArrow);
	// // Was looking for the 'id' name of the link, not the xPath
	// WebElement advancedLink = this.driver.findElement(By.id("gh-as-a"));
	// elements.add(advancedLink);
	// WebElement categoryDropDown = this.driver.findElement(By.name("_sacat"));
	// elements.add(categoryDropDown);
	// WebElement shopDropDown =
	// this.driver.findElement(By.className("gh-control"));
	// elements.add(shopDropDown);
	// // Below looks for text on the actual page that is a hyperlink to
	// // another page. This is something that even users can see from their
	// // browser
	// WebElement pumaWord =
	// this.driver.findElement(By.partialLinkText("Hobbies"));
	// elements.add(pumaWord);
	// // to find below, do FirePath-->CSS and it's the one in the address bar
	// // USING CSS-SELECTOR IS ADVISED TO BE THE BEST ONE USED WHEN FINDING
	// // ELEMENTS
	// WebElement cssTrendingLink =
	// this.driver.findElement(By.cssSelector(".trending-collections-browse-all-box>a"));
	// elements.add(cssTrendingLink);
	// // this will grab the first <a> tag that it finds. That includes
	// // stuff like <a href="blah">.
	// WebElement aTag = this.driver.findElement(By.tagName("a"));
	// elements.add(aTag);
	//
	// IntroHelpMethods.displayElements(elements, "id", "name");
	//
	// // // Perform a method on all elements of the collection
	// // System.out.println(elements.size());
	// // for (WebElement element : elements) {
	// // // the getAttribute & isDisplayed are stock methods that belong the
	// // // WebElement class
	// // System.out.println(element.getAttribute("id") + " is Displayed:");
	// // }
	//
	// this.driver.get(baseUrl + "/");
	// this.driver.findElement(By.linkText("Sign in")).click();
	// this.driver.findElement(By.id("userid")).clear();
	// this.driver.findElement(By.id("userid")).sendKeys("sqasolution@hotmail.com");
	// this.driver.findElement(By.id("pass")).clear();
	// this.driver.findElement(By.id("pass")).sendKeys("sqa123");
	// this.driver.findElement(By.id("sgnBt")).click();
	// this.driver.findElement(By.id("gh-ac")).clear();
	// this.driver.findElement(By.id("gh-ac")).sendKeys("computer");
	// this.driver.findElement(By.id("gh-btn")).click();
	// this.driver.findElement(By.cssSelector("a.vip > strong")).click();
	// this.driver.findElement(By.id("isCartBtn_btn")).click();
	//
	// }

	/**
	 * @param logo
	 * @param instagramIcon
	 * @return
	 */
	private WebElement highestElement(WebElement element1, WebElement element2) {
		System.out.println("Element 1 " + element1.getLocation().getY());
		System.out.println("Element 2 " + element2.getLocation().getY());
		// If element 1 is a higher #, than return element 2; OTHERWISE return
		// element 1
		// We want the lowest number, which represents which one is higher on
		// the browser
		WebElement highest = element1.getLocation().getY() > element2.getLocation().getY() ? element2 : element1;
		return highest;
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
