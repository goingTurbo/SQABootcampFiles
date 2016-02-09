package com.sqa.ts.webtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchFFTest {
	private WebDriver driver;
	
	@BeforeMethod
	private void setup(){
		driver = new FirefoxDriver();	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void googleSearch(){
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// type into search input field
		driver.findElement(By.id("lst-ib")).sendKeys("seafood city");
		//click on "Search btn"
		driver.findElement(By.name("btnG")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		final String yelpText = "Yelp";
		//click on the link that contains "Yelp"
		driver.findElement(By.partialLinkText(yelpText)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Assert.assertTrue(driver.findElement(By.linkText(yelpText)).isDisplayed());
	}

}
