package com.ocp.file7;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileTest14 {

	public static void main(String[] real) throws Exception {
		//readFileUisngFileInputStream();
		//readFileUisngBuferredInputStream();
		getWidgetNumber();
	}

	static void readFileUisngFileInputStream() throws FileNotFoundException, IOException {
	   File f = new File("C:\\Sandeep\\Career\\Interview Preparation\\CoreJava\\src\\com\\ocp\\file7\\prime6.txt");
		try (InputStream is = new FileInputStream(f)) { //1234567890 
			is.skip(1);
			//is.read();
			System.out.println(" First "+(char)is.read());
			is.skip(1);
			//is.read();
			System.out.println(" Second "+(char)is.read());
			is.mark(4);
			is.skip(1);
			//is.reset(); // reset not supported at runtime //Repositions this stream to the position at
						// the time the mark method was last called on this input stream.
			//It doesnt not work because didnt used BufferedInputStream, reset() works with it. 
			System.out.println(" Third "+(char)is.read());
		}
	}

	static void readFileUisngBuferredInputStream() throws FileNotFoundException, IOException {
	   File f = new File("C:\\Sandeep\\Career\\Interview Preparation\\CoreJava\\src\\com\\ocp\\file7\\prime6.txt");
		try (FileInputStream is = new FileInputStream(f);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) { //1234567890 
			if(br.markSupported()) {
				System.out.println((char)br.read());  //1
				br.mark(2);
				System.out.println((char)br.read()); // 2
				br.reset();
				System.out.println((char)br.read()); // 2
			}
		}
	} //Ans: 122
	
	static void getWidgetNumber() throws Exception {
		byte[] data = new byte[] {1,2,3,4,5,6,7};
	      try (InputStream is = new ByteArrayInputStream(data)) {
	    	  System.out.println(is.read(new byte[2])); //pos=2, mark =0
	         if(is.markSupported()) {
	         System.out.println(is.read());
	         is.mark(5); ////pos=2 mark=5
	         System.out.println(is.read());
	         System.out.println(is.read()); ////pos=4
	         is.skip(3); ////pos=7
	         is.reset(); //pos=2	         
	         System.out.println(is.read());//pos=3
	         }
	      }
	   }  //Ans : 3
}

// Ans: The code compiles but throws an exception at runtime.
