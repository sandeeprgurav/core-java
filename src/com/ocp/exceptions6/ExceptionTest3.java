package com.ocp.exceptions6;

public class ExceptionTest3 {
	class TideException extends Exception {
	}

public void surf() throws RuntimeException {
    try {
       throw new TideException();
    } catch (IllegalStateException | TideException t) {}
    //} catch (Exception a | RuntimeException f) {} // RuntimeException already caught
    //} catch (	TideException | IOException i) {} //  IOException is not thrown from try body
    //} catch (	TideException | Exception x) {} // TideException Exception already caught
 }

}

//Ans: IllegalStateException | TideException t
