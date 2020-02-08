package com.ocp;

public class ExceptionTest3 {
	class TideException extends Exception {
	}

public void surf() throws RuntimeException {
    try {
       throw new TideException();
    } catch (IllegalStateException | TideException t) {}
    //} catch (Exception a | RuntimeException f) {} // RuntimeException already caught
    //} catch (	TideException | IOException i) {} // must be subclass of throwable
    //} catch (	TideException | Exception x) {} // TideException Exception already caught
 }

}

//Ans: IllegalStateException | TideException t
