package com.ocp.file7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Smoke {
	public void sendAlert(File fn) {
		//try (BufferedWriter w = new BufferedWriter(new FileOutputStream(fn))) { //wrong parameter passed
		try (BufferedWriter w = new BufferedWriter(new FileWriter(fn))) { 
			w.write("ALERT!");
			w.flush();
			w.write('!');
			System.out.print("1");
		} catch (IOException e) {
			System.out.print("2");
		} finally {
			System.out.print("3");
		}
	}

	public static void main(String[] testSignal) {
		new Smoke().sendAlert(new File("alarm.txt"));
	}
}

//Ans: The code does not compile.