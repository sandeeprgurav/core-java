package com.ocp.file7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class FileTest3 {
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
		return null;// new BufferedInputStream(new FileReader("magic.book")); //param is new
					// FileInputStream(fPath)
	}

	public static void main(String... horn) {
		new Unicorn().findUnicorns();
	}

}

// Ans: BufferedInputStream as param FileInputStream not FileReader ==>> Code
// does not compile