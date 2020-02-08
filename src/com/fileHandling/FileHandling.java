package com.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		String directory = "C:\\Sandeep";  
		String fileName = "SampleFile.txt";  
		String absolutePath = directory + File.separator + fileName;

		// write the content in file 
		try {
			FileWriter fileWriter = new FileWriter(absolutePath);
		    StringBuffer fileContent = new StringBuffer("Line1");
		    fileContent.append("\n");
		    fileContent.append("Line2");
		    fileWriter.write(fileContent.toString());
		    fileWriter.close();
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		} catch (Exception e) {
		    // exception handling
		}

		// read the content from file
		try {
			FileReader fileReader = new FileReader(absolutePath);
		    int ch = fileReader.read();
		    while(ch != -1) {
		        System.out.print((char)ch);
		        ch = fileReader.read();
		    }
		    fileReader.close();
		} catch (FileNotFoundException e) {
		    // exception handling
		} catch (IOException e) {
		    // exception handling
		} catch (Exception e) {
		    // exception handling
		}
	}

}
