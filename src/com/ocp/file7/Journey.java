package com.ocp.file7;

import java.io.File;

public class Journey {
	public static void main(String[] dig) {
		File file = new File("/Earth");
		//System.out.print(file.getParent() + " - " + file.getParent().getParent()); //file.getParent().getParent() not exist 		
		System.out.print(file.getParent() + " - " + file.getParent());
	}
}


//Ans: The code does not compile.