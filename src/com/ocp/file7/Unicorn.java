package com.ocp.file7;

import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Unicorn {
	public void findUnicorns() {
		try (InputStream o = new ObjectInputStream(readBook())) {
			while (o.read() != -1) {
				System.out.println(o.read());
			}
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	private InputStream readBook() throws IOException {
		return null;//new BufferedInputStream(new FileReader("magic.book")); FileReader is not param for BUfferedInputStream
	}

	public static void main(String... horn) {
		      new Unicorn().findUnicorns();
		   }
}

//Ans: The code does not compile.