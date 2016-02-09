package com.sqa.ts.webtests;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassProjectTestCase4 {

	private WebDriver driver;

	@Test(enabled = false)
	public void polTest() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://example.crowdynews.com/crowdynews/usa/politics/");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(
				By.xpath("//b[@class='kudos-count' and number(.)>5]/ancestor::div[@class='item-wrap li-link']"))
				.click();
		String articleTitle = driver.findElement(By.className("cnoverlay-articletitle")).getText();
		System.out.println(articleTitle);
		driver.findElement(By.cssSelector(".icon-twitter.share-twitter")).click();
		Set handles = driver.getWindowHandles();
		for (String hand : driver.getWindowHandles()) {
			driver.switchTo().window(hand);
		}
		String twitterMsg = driver.findElement(By.id("status")).getText();
		Assert.assertTrue(articleTitle.contains(twitterMsg));
		// Assert.assertEquals(driver.findElement(By.id("status")).getText(),
		// articleTitle);
		driver.close();
	}

	@Test(enabled = false)
	public void polTest2() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://example.crowdynews.com/crowdynews/usa/politics/");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//b[@class='kudos-count' and number(.)>5]/ancestor::div[@class='item-wrap li-link']"))
				.click();
		String mainAccount = driver.findElement(By.className("cnoverlay-author")).getText();
		System.out.println(mainAccount);
		String retweetName = driver.findElement(By.xpath("//p[@class = 'content-twitter-tweet']/span/a")).getText();
		System.out.println(retweetName);
		Assert.assertEquals(mainAccount, retweetName);
		driver.close();
	}

	@Test(enabled = false)
	public void polTest3() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://example.crowdynews.com/crowdynews/usa/politics/");
		String parentWindow = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//b[@class='kudos-count' and number(.)>5]/ancestor::div[@class='item-wrap li-link']"))
				.click();
		String mainLink = driver.findElement(By.className("cnClickSource")).getAttribute("href");
		System.out.println(mainLink);
		driver.findElement(By.xpath("//p[@class='content-twitter-tweet']/span[2]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String currentWindow : allWindows) {
			driver.switchTo().window(currentWindow);
		}
		String retweetLink = driver.getCurrentUrl();
		System.out.println(retweetLink);
		Assert.assertEquals(mainLink, retweetLink);
		driver.close();
	}

	@Test(enabled = true)
	public void polTest4() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://example.crowdynews.com/crowdynews/usa/politics/");
		driver.manage().window().maximize();
		driver.findElement(By.className("cnMenuTrigger")).click();
		WebElement select = driver.findElement(By.className("cnMainMenu cnSectionsMenu"));
		List<WebElement> choices = select.findElements(By.tagName("ul"));
		for (WebElement choice : choices) {
			if ("republicans".equalsIgnoreCase(choice.getText()))
				;
			choice.click();
		}

		driver.close();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
