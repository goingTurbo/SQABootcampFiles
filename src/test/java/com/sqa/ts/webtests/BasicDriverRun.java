package com.sqa.ts.webtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicDriverRun {

	private static WebDriver driver;
	private static String baseUrl;

	@Test
	public void login() {
		baseUrl = "http://www.bbc.com";
		driver.get(baseUrl);
	}

	// it's wise to separate the browsers from methods
	@BeforeClass(enabled = false)
	public void setupFirefox() {
		driver = new FirefoxDriver();
	}

	@BeforeClass(enabled = false)
	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeClass(enabled = false)
	public void setupOpera() {
		System.setProperty("webdriver.opera.driver", "drivers\\operadriver.exe");
		driver = new OperaDriver();
	}

	@BeforeClass
	public void setupIE() {
		System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	@BeforeClass(enabled = false)
	public void setupSafari() {
		driver = new SafariDriver();
	}

	@BeforeClass(enabled = false)
	public void setupEdge() {
		System.setProperty("webdriver.edge.driver", "drivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
	}

}
