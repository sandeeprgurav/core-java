package com.ocp.interface10;
class Tool {
	   /*default */void use() { }     // r1
	}
public class Hammer extends Tool {
	   public void use() { }  // r2
	   public void bang() { }  // r3
	}


// default value available in interface only. 