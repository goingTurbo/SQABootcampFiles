
package com.sqa.ts.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTools {

	public static int affectedRecords = 0;
	public static Connection dbConn;
	public static ResultSet results;

	public static void displayResults(ResultSet results) {
		System.out.println("/\n****************************************************************/");
		int colCount;
		try {
			ResultSetMetaData rsmd = results.getMetaData();
			colCount = rsmd.getColumnCount();
			// the next() will make it so it goes to each record in the table
			while (results.next()) {
				for (int i = 1; i < colCount; i++) {
					System.out.print(rsmd.getColumnLabel(i) + ":" + results.getString(i) + "\t");
				}
				System.out.print("\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("/****************************************************************/\n");
	}

	/**
	 * The ResultSet will be the SQL query
	 * 
	 * @param results
	 * @param columns
	 */
	public static void displayResults(ResultSet results, String... columns) {
		System.out.println("/\n****************************************************************/");
		// the next() will make it so it goes to each record in the table
		try {
			while (results.next()) {
				for (String col : columns) {
					System.out.print(col + ":" + results.getString(col) + "\t");
				}
				System.out.print("\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("/****************************************************************/\n");
	}

	/**
	 * Overloaded method to return database connection to given database
	 * information, uses default driverString of com.mysql.jdbc.Driver
	 * 
	 * @param dbUrl
	 * @param user
	 * @param pass
	 * @return
	 */

	public static Connection getDBConn(String dbUrl, String user, String pass) {
		return getDBConn("com.mysql.jdbc.Driver", dbUrl, user, pass);
	}

	/**
	 * Return a database connection given database information
	 * 
	 * @param driverString
	 * @param dbUrl
	 * @param user
	 * @param pass
	 * @return
	 */

	public static Connection getDBConn(String driverString, String dbUrl, String user, String pass) {
		dbConn = null;
		try {
			// Step 1 Get class name for driver
			Class.forName(driverString);
			// Create the connection by passing in dbUrl, user, pass
			dbConn = DriverManager.getConnection(dbUrl, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dbConn;
	}

	/**
	 * This is the overloaded method of the 2
	 * 
	 * @param dbConn
	 * @param sqlQuery
	 * @return
	 */

	public static ResultSet runScript(Connection dbConn, String sqlQuery) {
		return runScript(dbConn, sqlQuery, false);
	}

	/**
	 * 
	 * @param dbConn
	 * @param sqlQuery
	 * @param isUpdate
	 * @return
	 */
	public static ResultSet runScript(Connection dbConn, String sqlQuery, boolean isUpdate) {
		ResultSet results = null;
		Statement statement = null;
		try {
			// Step 3 Create statement object for SQL query
			statement = dbConn.createStatement();
			if (isUpdate) {
				// this will
				affectedRecords = statement.executeUpdate(sqlQuery);
			} else {
				// Execute the statement to get query results
				results = statement.executeQuery(sqlQuery);
			}
			// statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return results;
	}

	public static ResultSet runScript(String sqlQuery) {
		return runScript(dbConn, sqlQuery, false);
	}

	public static void closeConnection() {
		try {
			dbConn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeResultSet() {
		try {
			results.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
