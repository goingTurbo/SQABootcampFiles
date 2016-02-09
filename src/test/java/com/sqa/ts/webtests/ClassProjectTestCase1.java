package com.sqa.ts.webtests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassProjectTestCase1 {

	private WebDriver driver;

	@Test
	public void testCaseOne() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://example.crowdynews.com/crowdynews/usa/politics/");
		driver.findElement(
				By.xpath("b[@class='kudos-count' and number(.)>5]/ancestor::div[@class='item-wrap li-link']")).click();
		// driver.switchTo().frame(arg0)
		driver.close();
	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser) throws MalformedURLException {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Trevor/workspace/ClassProject/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"C:/Users/Trevor/workspace/ClassProject/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
