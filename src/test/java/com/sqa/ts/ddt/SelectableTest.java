package com.sqa.ts.ddt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableTest {

	private WebDriver driver;

	@Test(enabled = false)
	public void selectable() {
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List<WebElement> elements = driver.findElements(By.cssSelector("ol#selectable *"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(elements.get(1)).click(elements.get(2)).click(elements.get(3))
				.keyUp(Keys.CONTROL).build().perform();
	}

	@Test(enabled = true)
	public void selectableRandom() {
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		List<WebElement> elements = driver.findElements(By.cssSelector("ol#selectable *"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(elements.get((int) (Math.random() * elements.size())))
				.click(elements.get((int) (Math.random() * elements.size())))
				.click(elements.get((int) (Math.random() * elements.size()))).keyUp(Keys.CONTROL).build().perform();
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
