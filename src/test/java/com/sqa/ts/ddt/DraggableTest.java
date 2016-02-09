package com.sqa.ts.ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DraggableTest {

	private WebDriver driver;

	@Test
	public void draggable() {
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver).dragAndDropBy(driver.findElement(By.id("draggable")), 120, 140).build().perform();
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
