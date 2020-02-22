package com.ocp.file7;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest25 {
	 public void setupInventory(Path desiredPath) throws Exception {
	      Path suggestedPath = Paths.get("sneakers");
	      if(Files.isSameFile(suggestedPath, desiredPath)  // j1  //isSameFile expect path of files not directory
	            && !Files.exists(suggestedPath))
	         Files.createDirectories(desiredPath);  // j2
	   }
	   public static void main(String[] socks) throws Exception {
	      Path w = new File("/stock/sneakers").toPath();  // j3
	      new FileTest25().setupInventory(w);
	   }
}

// Ans: Line j1 does not compile or produces an exception at runtime.




