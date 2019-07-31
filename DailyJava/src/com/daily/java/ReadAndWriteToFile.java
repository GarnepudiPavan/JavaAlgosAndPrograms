package com.daily.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class ReadAndWriteToFile {
	String path = "com.main.resources/ReadAndWrite.txt";
	// File file = new File(path);
	FileWriter fileWriter;
	FileReader fileRead;
	String value;

	public void writeToFile() {

		Scanner getDetails = new Scanner(System.in);
		System.out.println("Enter string to write to file");
		try {
			/**
			 * check for blan k or null not needed as scanner class only allows valid inout
			 * from console
			 */
			while (getDetails.hasNext()) { // checking for this condition scanner is stuck and not responding
				value = getDetails.next();
			}
			System.out.println("Details from console" + " " + value);
			fileWriter = new FileWriter(path);
			fileWriter.write(value);

			getDetails.close();
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Exception occured writing to file" + " " + e.getMessage());
		}
	}

	public void writeToFileUsingBufferedReader() {
		BufferedReader biFS = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string to write to file");
		try {
			//while (biFS.readLine() != null) {
				String value = biFS.readLine();
				System.out.println("Details from console using BufferedReader" + " " + value);
				fileWriter = new FileWriter(path);
				fileWriter.write(value);
			//}
			biFS.close();
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Exception occured writing to file" + " " + e.getMessage());
		}

	}

	public void readFromFile() {
		try {
			fileRead = new FileReader(path);
			Scanner readContent = new Scanner(fileRead);
			while (readContent.hasNext()) {
				System.out.println("Content from file" + " " + readContent.next());
			}
			readContent.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {

		ReadAndWriteToFile obj1 = new ReadAndWriteToFile();
		//obj1.writeToFile();
		obj1.writeToFileUsingBufferedReader();
		obj1.readFromFile();

	}
}
