package com.ocp.file7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributesTest {
public static void main(String[] args) throws IOException {	
	Path path = Paths.get("sloth.schedule");
	BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);	
	 if(attributes.size()>0 && attributes.creationTime().toMillis()>0) {		
	//attributes.setTimes(null,null,null); no such method of attributes //line 4
	}
}
}
//Ans: The code will not compile because of line 4.