package com.ocp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamLimitTest {
 
	 public static void main(String[] args){
		  try{
		 Path path = Paths.get("input.txt");
		 //Stream stream = Files.readAllLines(path) ; // Compile error where byte[] to Stream
		 Stream stream = (Stream)Files.readAllLines(path) ;
		 stream.limit(1).forEach(System.out::print);
		 }catch(IOException ex){

		 System.out.println("Error!");
		 }
		 }		 
}

// Ans: Compilation fails.