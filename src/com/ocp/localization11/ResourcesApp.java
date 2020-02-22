package com.ocp.localization11;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesApp {
 public void loadResourceBundle() {
	 ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
	 //System.out.println(resource.getObject(1)); //key only in String format	 	
 }
}

//Ans: Compilation fails.
