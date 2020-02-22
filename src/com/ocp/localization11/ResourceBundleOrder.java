package com.ocp.localization11;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleOrder {
	public static void main(String[] args) {
		// Given the following code, Java will try to find a matching resource bundle.
		// Which order will Java search to find a match?

		Locale.setDefault(new Locale("en"));
		ResourceBundle.getBundle("AB", new Locale("fr"));
	}
}
//Ans: AB_fr.properties, AB_en.properties, AB.class, AB.properties

/*//Options:
AB_fr.properties, AB_en.properties, AB.class, AB.properties
AB.class, AB.properties, AB_en.properties, AB_fr.properties
AB_en.properties, AB_fr.properties, AB.class, AB.properties
AB_fr.properties, AB.class, AB.properties, AB_en.properties
AB.properties, AB.class, AB_en.properties, AB_fr.properties
AB_fr.properties, AB_en.properties, AB.properties, AB.class
*/