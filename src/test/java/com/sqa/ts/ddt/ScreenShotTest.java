package com.sqa.ts.ddt;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest {

	private WebDriver driver;
	private WebDriver augmentedDriver;
	private String time;

	@Test
	public void f() throws IOException {
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();

		screenShot();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	public void screenShot() throws IOException {
		augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,
				new File("C:/Users/Trevor/Desktop/SQASolutions/TestNG_ScreenShots/screenshot" + timeStamp() + ".png"));

	}

	public String timeStamp() {
		String pattern = "MMddyyyyhhmmss";
		SimpleDateFormat formated = new SimpleDateFormat(pattern);
		Date date = new Date();
		return formated.format(date);
	}
}
// SimpleDateFormat
