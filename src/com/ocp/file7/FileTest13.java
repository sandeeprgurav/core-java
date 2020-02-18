package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest13 {
	public Path rebuild(Path p) {
	      Path v = null;
	      for(int i=0; i<p.getNameCount(); i++)
	         if(v==null) v = p.getName(i);
	         else v = v.resolve(p.getName(i));
	      return v;
	   }
	   public static void main(String... tools) {
	      final FileTest13 al = new FileTest13();
	      Path original = Paths.get("/tissue/heart/chambers.txt");
	      Path repaired = al.rebuild(original);
	      System.out.print(original.equals(repaired));
	   }
}

// Ans: false
