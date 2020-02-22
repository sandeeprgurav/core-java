package com.ocp.file7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTest18 {

	public static void main(String[] holidays) throws Exception {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log");
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path2.resolve("/readme/"); // 
		System.out.println(res1);
		System.out.println(res2);
		// Ans: \app\.\sys\log 
		//      \readme
		
		Path path11 = Paths.get("/pets/../cat.txt");
		Path path22 = Paths.get("./dog.txt");
		System.out.println(path11.resolve(path22));
		System.out.println(path22.resolve(path11));
		//Ans: /pets/../cat.txt/./dog.txt /pets/../cat.txt
	}
}
// Refer explanantion of FileTest16
