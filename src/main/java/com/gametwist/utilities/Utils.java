package com.gametwist.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	static String fileLocation = ".\\Gametwist.properties";

	// Read properties file
	public static Properties readFile() {
		// Creating the File Object
		File file = new File(fileLocation);
		// Creating properties object
		Properties property = new Properties();

		try {
			// Creating InputStream object to read data
			FileInputStream objInput = new FileInputStream(file);
			// Reading properties key/values in file
			property.load(objInput);
			// Closing the InputStream
			objInput.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return property;
	}

	// Copy/Paste search term
	public static void copyPasteFileName(String fileName) {
		StringSelection fileNameString = new StringSelection(fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileNameString, null);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_V);
		robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	}
}
