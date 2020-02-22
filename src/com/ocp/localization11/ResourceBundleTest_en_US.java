package com.ocp.localization11;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class ResourceBundleTest_en_US extends ListResourceBundle {
	private int count = 0;

	@Override
	protected Object[][] getContents() {
		return new Object[][] { { "count", ++count } };
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.ocp.localization11.ResourceBundleTest");
		//System.out.println(rb.getString("count") + " " + rb.getString("count")); ClassCastException Int to String converiosn
		System.out.println(rb.getObject("count") + " " + rb.getObject("count")); //With Object 1 1 
	}
}

// Runtime Exception :  ClassCastException Int to String converiosn
