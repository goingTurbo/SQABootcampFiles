package com.sqa.ts.ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResizableTest {

	private WebDriver driver;

	@Test(enabled = false)
	public void resizableTestEast() {
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver)
				.dragAndDropBy(driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-e")), 150, 0)
				.build().perform();
	}

	@Test(enabled = false)
	public void resizableTestSouth() {
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver)
				.dragAndDropBy(driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-s")), 0, 180)
				.build().perform();
	}

	@Test(enabled = true)
	public void resizableTestSouthEast() {
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver)
				.dragAndDropBy(driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-se")), 150, 150)
				.build().perform();
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
