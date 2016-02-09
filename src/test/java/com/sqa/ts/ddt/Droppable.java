package com.sqa.ts.ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Droppable {

	private WebDriver driver;

	@Test
	public void droppable() {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		new Actions(driver).dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
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
