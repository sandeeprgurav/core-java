package com.ocp;

public class Test {
  int sum=0;
  public void doCheck(int number) {
	  if(number%2==0) {
		  //continue; compile time error should be used withn loop
		  //break;  compile time error should be used withn loop
	  } else {
		 for(int i=0;i<number;i++) {			 
			 sum+=i;			 
		 }
	  }
  }
	  
	
}
