package com.ocp.exceptions6;

import java.io.Closeable;
import java.io.IOException;

class StungException extends Exception {
}

class Suit implements Closeable {
	public void close() throws IOException {
	}
}

public class BeeCatcher {
	public static void main(String... bees) {
      try (Suit s = new Suit(); Suit t = new Suit()) {  //; instead of , 
         throw new StungException();
      } catch (Exception e) {
      //} catch (StungException e) { // unreacheable exception
      } finally {
      }
   }
}

//Ans : Two Exceptions