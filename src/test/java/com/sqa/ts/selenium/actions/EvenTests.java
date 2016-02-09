package com.sqa.ts.selenium.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sqa.ts.utils.DatabaseTools;

public class EvenTests {

	public static Object[][] dataSet1() {
		Object[][] data = new Object[][] { { 2, true }, { 3, false }, { 0, true }, { 22, true }, { -4, true },
				{ -100234, true }, { 8009, false } };
		return data;

	}

	@DataProvider(name = "Even Numbers")
	public static Object[][] dbTestData() {
		Object[][] data = null;
		Connection conn = DatabaseTools.getDBConn("jdbc:mysql://localhost:8889/sqadb", "root", "root");
		ResultSet results = DatabaseTools.runScript(conn, "select * from eventests");
		ArrayList<Object> resultObjects = new ArrayList<Object>();
		try {
			while (results.next()) {
				System.out.println("Data.." + results.getInt(2) + " : " + results.getBoolean(3));
				Object[] row = { results.getInt(2), results.getBoolean(3) };
				resultObjects.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data = new Object[resultObjects.size()][];
		for (int i = 0; i < resultObjects.size(); i++) {
			data[i] = (Object[]) resultObjects.get(i);
		}
		return data;
	}

	public static void main(String[] args) {
		Object[][] data = dbTestData();
		System.out.println("Data: " + Arrays.deepToString(data));
	}

	@Test
	public void connectDB() {
		System.out.println("Connecting to DB");
		String user = "root";
		String pass = "root";
		String dbUrl = "jdbc:mysql://localhost:8889/sqausers";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection dbconn = DriverManager.getConnection(dbUrl, user, pass);
			Statement stmt = dbconn.createStatement();
			// What's in the () is the sql statement
			ResultSet rs = stmt.executeQuery("select name, address, age, jobtitle from person");

			while (rs.next()) {
				System.out
						.println("User name is " + rs.getString("name") + " is " + rs.getString("age") + " years old");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Even Numbers")
	public void testEvenOddAO(int number, boolean expResult) {
		boolean isEven = com.sqa.ao.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase2", "Phase3" }, dataProvider = "Even Numbers")
	public void testEvenOddAP(int number, boolean expResult) {
		boolean isEven = com.sqa.ap.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase2" }, dataProvider = "Even Numbers")
	public void testEvenOddLL(int number, boolean expResult) {
		boolean isEven = com.sqa.ll.helpers.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase2" }, dataProvider = "Even Numbers")
	public void testEvenOddMS(int number, boolean expResult) {
		boolean isEven = com.sqa.ms.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase3", "Phase4" }, dataProvider = "Even Numbers")
	public void testEvenOddPN(int number, boolean expResult) {
		boolean isEven = com.sqa.pn.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase1" }, dataProvider = "Even Numbers")
	public void testEvenOddTS(int number, boolean expResult) {
		boolean isEven = com.sqa.ts.help.math.EvenOdd.numberIsEven(number);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}

	@Test(groups = { "Phase1" }, dataProvider = "Even Numbers")
	public void testEvenOddRA(int number, boolean expResult) {
		// setting the value of the method works like how it is at the end of
		// the code line
		boolean isEven = com.sqa.ra.helpers.math.EvenOdd.numberIsEven(number, true);
		if (expResult == true) {
			Assert.assertTrue(isEven);
		} else if (expResult == false) {
			Assert.assertFalse(isEven);
		}
	}
}
