package com.ocp.localization11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Type extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] { { "keys", new ArrayList<String>() } };
	}

	public static void main(String[] args) {
		//ResourceBundle rb = ResourceBundle.getBundle("com.ocp.localization11.Type");
		ResourceBundle rb = ResourceBundle.getBundle("Type");
		List<String> keys = (List) rb.getObject("keys");
		keys.add("q");
		keys.add("w");
		keys.add("e");
		keys.add("r");
		keys.add("t");
		keys.add("y");
		System.out.println(((List) rb.getObject("keys")).size());
	}
}

//Ans: The code compiles but throws an exception at runtime. since package name is not specified. 


