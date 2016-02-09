package com.sqa.ts.ddt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sortable {

	private WebDriver driver;

	@Test
	public void f() {
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List<WebElement> elements = driver.findElements(By.cssSelector("ul#sortable li"));
		Actions action = new Actions(driver);
		action.clickAndHold(elements.get(1)).moveToElement(elements.get(4)).keyUp(theKey).build().perform();
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
