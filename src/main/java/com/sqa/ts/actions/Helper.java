
package com.sqa.ts.actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Helper //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Helper {

	public static Properties loadProperties(String fileLocation) {

		Properties props = new Properties();
		// 'fileLocation' is put here because its the method variable at the top
		FileInputStream fis;
		try {
			fis = new FileInputStream(fileLocation);
			props.load(fis); // the 'load' process inputs all the file contents
		} catch (FileNotFoundException e) { // this is for FileInputStream
			System.out.println("File was not FOUND");
			e.printStackTrace();
		} catch (IOException e) { // this is for the .load()
			System.out.println("File was not loaded");
			e.printStackTrace();
		}

		return props;

	}

	public static void saveProperties(String fileLocation, Properties props) {

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(fileLocation);
			props.store(fos, "Properties File - TS");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	  *
	  */
	public static void display2DMatrix(Object[][] matrix, String title) {
		System.out.println("\n" + title);
		String segment = "";
		for (int i = 0; i < matrix[i].length; i++) {
			segment += "----------";
		}
		System.out.print(segment + "\n");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("|     ");
			for (int j = 0; j < matrix[i].length; j++) {
				String div = (j < (matrix[i].length - 1)) ? "\t" : "\t |\n";
				System.out.print(matrix[i][j] + div);
			}
			System.out.println(segment);
		}
	}
}
