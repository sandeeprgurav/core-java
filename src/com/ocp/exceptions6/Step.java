package com.ocp.exceptions6;

import java.io.Closeable;

interface Closing {
	void close() throws Exception;
}

class Shelf implements Closing {
	public void close() throws Exception {
	}
}

public class Step {
	static {
	      /*try (Shelf shelf = new Shelf()) { // Shelf doesnt not implemented AutoCloseable or Closeable
	         throws new IllegalArgumentException(); //thows instead of throw
	      } catch (Exception e) {
	      } catch (IllegalArgumentException e) { // NOt reachealbe exception
	      } finally {
	         shelf.close(); // shelf object not accessible in shelf
	      }*/
	   }
}

// Ans : Four compile time error