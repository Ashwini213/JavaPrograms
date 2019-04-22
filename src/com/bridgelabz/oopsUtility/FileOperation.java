/**
 * 
 */
package com.bridgelabz.oopsUtility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author all
 *
 */
public class FileOperation {

	/**
	 * @param args
	 */
	public static FileReader readFile(String path) {
		try {
			File file = new File(path);
			FileReader fileReader = new FileReader(file);
			return fileReader;
		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}
	}