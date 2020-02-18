package com.ocp.file7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Guitar {
	   public void readMusic(File f) throws IOException /*throws IOException missing*/ {
		   //try (BufferedReader r = new BufferedReader(FileReader(f))) { new keyword missing  
	      try (BufferedReader r = new BufferedReader(new FileReader(f))) {  
	         //final String music = null; remove final keyword
	         String music = null;
	         try {
	            while((music = r.readLine()) != null)
	               System.out.println(music);
	         } catch (IOException e) {}
	      } catch (FileNotFoundException e) {
	         throw new RuntimeException(e);
	      } finally {}
	}}

//Ans Three code correction needed