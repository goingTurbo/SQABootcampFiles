package com.sqa.ts.ddt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginWithSpreadSheet {

	private WebDriver driver;

	private final static long LONG_TIME_TO_WAIT = 30;

	@DataProvider(name = "excelSheet")
	public static Object[][] spreadsheet() throws BiffException, IOException {
		return getDataFromExcel("C:/Users/Trevor/Desktop/SQASolutions/data2.xls", "Login", "StartPoint", "EndPoint");
	}

	@Test(dataProvider = "excelSheet")
	public void loginWithSpreadSheet(String username, String password) {
		driver.get("https://www.salesforce.com/sales-cloud/");
		WebElement element = null;

		driver.findElement(By.id("button-login")).click();
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("username"));
		element.sendKeys(username);
		element = waitForVisibilityOfElement(LONG_TIME_TO_WAIT, By.id("password"));
		element.sendKeys(password);
		driver.findElement(By.id("Login")).click();

		Assert.assertEquals(driver.findElement(By.id("error")).getText(),
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
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

	private static String[][] getDataFromExcel(String xlsFilePath, String sheetName, String startPoint, String endPoint)
			throws BiffException, IOException {
		String[][] tabArray = null;
		try {
			// open an workbook
			Workbook workbook = Workbook.getWorkbook(new File(xlsFilePath));
			// open a sheet "Login"
			Sheet sheet = workbook.getSheet(sheetName);
			int startRow, startCol, endRow, endCol, ci, cj;
			// find a cell labeled with "StartPoint"
			// is 1, it's at A2, but remember numbers that at 0
			Cell tableStart = sheet.findCell(startPoint);
			// get a row of that cell
			startRow = tableStart.getRow();
			// get a column of that cell
			startCol = tableStart.getColumn();

			// find a cell#2 labeled with "EndPoint"
			Cell tableEnd = sheet.findCell(endPoint);
			// get a row of that cell
			endRow = tableEnd.getRow();
			// get a row of that cell
			endCol = tableEnd.getColumn();

			///////////////////////// [Row] => 7-1-1=5 //[Column] => 3-0-1 = 2
			tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
			int b = 0;
			int c = 0;

			for (int i = startRow + 1; i < endRow; i++, b++) {

				for (int j = startCol + 1; j < endCol; j++, c++) {
					// ------------------------>(column,row)
					tabArray[b][c] = sheet.getCell(j, i).getContents();
					System.out.println(tabArray[b][c]);
				}
				c = 0;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}

		return tabArray;
	}

	private WebElement waitForVisibilityOfElement(long time, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
